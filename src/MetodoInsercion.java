public class MetodoInsercion {
    
    public void ordenarAscendente(int[] arreglo) {
        int c = 1;
        int cam = 1;
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            if (j >= 0 && arreglo[j] > aux) {
                while (j >= 0 && arreglo[j] > aux) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    cam+=1;
                    c+=1;
                }
            }else {
                c+=1;
            }
            arreglo[j + 1] = aux;
        }

        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }
    
    public void ordenarAscendentePasos(int[] arreglo) {
        int c = 1;
        int cam = 1;
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            if (j >= 0 && arreglo[j] > aux) {
                while (j >= 0 && arreglo[j] > aux) {
                    System.out.println("Comparación " + c + ": " + aux + " < " + arreglo[j]);
                    System.out.println("Intercambio: El elemento " + arreglo[j] + " se moverá a la posición del elemento menor " + aux + " y el axuliar almacenará " + aux);
                    System.out.print("Estado actual: ");
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    printArray(arreglo);
                    System.out.println("");
                    cam+=1;
                    c+=1;
                     
                }
            }else {
                System.out.println("Comparación " + c + ": " + arreglo[i] + " < " + arreglo[j]);
                System.out.println("Intercambio: No hay cambios");
                System.out.print("Estado actual: ");
                printArray(arreglo);
                System.out.println("");
                c+=1;
            }
            arreglo[j + 1] = aux;
        }
        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }

    public void ordenarDescendente(int[] arreglo) {
        int c = 1;
        int cam = 1;
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            if (j >= 0 && arreglo[j] < aux) {
                while (j >= 0 && arreglo[j] < aux) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    cam+=1;
                    c+=1;
                }
            }else {
                c+=1;
            }
            arreglo[j + 1] = aux;
        }

        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }

    public void ordenarDescendentePasos(int[] arreglo) {
        int c = 1;
        int cam = 1;
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            if (j >= 0 && arreglo[j] < aux) {
                while (j >= 0 && arreglo[j] < aux) {
                    System.out.println("Comparación " + c + ": " + arreglo[i] + " < " + arreglo[j]);
                    System.out.println("Intercambio: El elemento " + arreglo[j] + " se moverá a la posición del elemento mayor " + aux + " y el axuliar almacenará " + aux);;
                    System.out.print("Estado actual: ");
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    printArray(arreglo);
                    System.out.println("");
                    cam+=1;
                    c+=1;
                }
            }else {
                System.out.println("Comparación " + c + ": " + arreglo[i] + " < " + arreglo[j]);
                System.out.println("Intercambio: No hay cambio");
                System.out.print("Estado actual: ");
                printArray(arreglo);
                System.out.println("");
                c+=1;
            }
            arreglo[j + 1] = aux;
        }

        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }

    public void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : "\n"));
        }
    }
}
