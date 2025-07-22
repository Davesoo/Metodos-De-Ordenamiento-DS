package models;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Maquina implements Comparable<Maquina> {
    public String nombre;
    public String ip;
    public List<Integer> codigos;
    public int subred;
    public int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
        this.riesgo = calcularRiesgo();
    }

    private int calcularSubred() {
        String[] partes = ip.split("\\.");
        return Integer.parseInt(partes[3]); // cuarto octeto
    }

    private int calcularRiesgo() {
        // Suma de códigos divisibles por 5
        int suma = codigos.stream()
                          .filter(c -> c % 5 == 0)
                          .mapToInt(Integer::intValue)
                          .sum();

        // Caracteres únicos en el nombre (sin espacios)
        Set<Character> unicos = new HashSet<>();
        for (char c : nombre.replaceAll("\\s+", "").toCharArray()) {
            unicos.add(c);
        }

        return suma * unicos.size();
    }

    @Override
    public int compareTo(Maquina o) {
        int cmp = Integer.compare(this.subred, o.subred);
        if (cmp == 0) {
            cmp = this.nombre.compareTo(o.nombre);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Maquina m = (Maquina) obj;
        return subred == m.subred && nombre.equals(m.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + subred;
    }

    @Override
    public String toString() {
        return nombre + " | IP: " + ip + " | Subred: " + subred + " | Riesgo: " + riesgo;
    }
}





package controllers;

import models.Maquina;

import java.util.*;

public class MaquinaController {

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral) {
        Stack<Maquina> pila = new Stack<>();
        for (Maquina m : maquinas) {
            if (m.subred < umbral) {
                pila.push(m);
            }
        }
        return pila;
    }

    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila) {
        return new TreeSet<>(pila);
    }

    public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas) {
        Map<Integer, Queue<Maquina>> mapa = new TreeMap<>();
        for (Maquina m : maquinas) {
            mapa.putIfAbsent(m.riesgo, new LinkedList<>());
            mapa.get(m.riesgo).add(m);
        }
        return mapa;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa) {
        int maxSize = -1;
        int riesgoSeleccionado = -1;

        for (Map.Entry<Integer, Queue<Maquina>> entry : mapa.entrySet()) {
            int size = entry.getValue().size();
            int riesgo = entry.getKey();
            if (size > maxSize || (size == maxSize && riesgo > riesgoSeleccionado)) {
                maxSize = size;
                riesgoSeleccionado = riesgo;
            }
        }

        Queue<Maquina> grupo = mapa.get(riesgoSeleccionado);
        Stack<Maquina> pila = new Stack<>();
        while (!grupo.isEmpty()) {
            pila.push(grupo.poll());
        }
        return pila;
    }
}




import controllers.MaquinaController;
import models.Maquina;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Maquina> maquinas = Arrays.asList(
            new Maquina("Servidor1", "192.168.200.15", Arrays.asList(5, 10, 3)),        // subred: 15
            new Maquina("Servidor1", "10.0.200.88", Arrays.asList(10, 2)),              // subred: 88
            new Maquina("Alpha2", "192.168.100.8", Arrays.asList(25, 1, 3, 10)),        // subred: 8
            new Maquina("Beta22", "10.0.250.100", Arrays.asList(5, 5, 5)),              // subred: 100
            new Maquina("Beta22", "172.16.250.101", Arrays.asList(10, 5)),              // subred: 101
            new Maquina("Base de Datos 1", "10.0.50.99", Arrays.asList(5, 15, 20, 1)),  // subred: 99
            new Maquina("ControlBackupX9", "172.16.90.5", Arrays.asList(25, 5, 10)),    // subred: 5
            new Maquina("ControlBackupX9", "172.16.99.8", Arrays.asList(5, 10))         // subred: 8
        );

        MaquinaController controller = new MaquinaController();

        // 🔹 Método A
        System.out.println("🔵 Método A – filtrarPorSubred < 100:");
        Stack<Maquina> pila = controller.filtrarPorSubred(maquinas, 100);
        pila.forEach(m -> System.out.println("  " + m.nombre + " - " + m.ip + " (subred: " + m.subred + ")"));

        // 🔹 Método B
        System.out.println("\n🟢 Método B – ordenarPorSubred:");
        Set<Maquina> ordenado = controller.ordenarPorSubred(pila);
        ordenado.forEach(m -> System.out.println("  " + m.nombre + " (subred: " + m.subred + ")"));

        // 🔹 Método C
        System.out.println("\n🟡 Método C – agruparPorRiesgo:");
        Map<Integer, Queue<Maquina>> mapa = controller.agruparPorRiesgo(maquinas);
        mapa.forEach((riesgo, cola) -> {
            System.out.print("  Riesgo " + riesgo + " → [");
            cola.forEach(m -> System.out.print(m.nombre + ", "));
            System.out.println("]");
        });

        // 🔹 Método D
        System.out.println("\n🔴 Método D – explotarGrupo:");
        Stack<Maquina> grupoMayor = controller.explotarGrupo(mapa);
        grupoMayor.forEach(m -> System.out.println("  " + m.nombre));
    }
}

