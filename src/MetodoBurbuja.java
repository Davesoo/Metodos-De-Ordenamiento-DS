public class MetodoBurbuja{

    int c=1;
    int cam = 1;
    
    public void ordenarAscendentePasos(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    System.out.println("Comparación " + c + ": " + arreglo[j+1] + " > " + arreglo[j]);
                    System.out.println("Intercambio: " + arreglo[j+1] + " <-> " + arreglo[j]);
                    System.out.print("Estado actual: ");
                    printArray(arreglo);
                    System.out.println("");
                    cam+=1;
                }else{
                    System.out.println("Comparación " + c + ": " + arreglo[j] + " > " + arreglo[j+1]);
                    System.out.println("Intercambio: No hay intercambio");
                    System.out.print("Estado actual: ");
                    printArray(arreglo);
                    System.out.println("");
                }
                c+=1;
            }
        }
        System.out.println("");
        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }

    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cam+=1;
                }
                c+=1;
            }
        }
        System.out.println("");
        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }

    // Método para ordenar de forma descendente
    public void ordenarDescendentePasos(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    System.out.println("Comparación " + c + ": " + arreglo[j+1] + " < " + arreglo[j]);
                    System.out.println("Intercambio: " + arreglo[j+1] + " <-> " + arreglo[j]);
                    System.out.print("Estado actual: ");
                    printArray(arreglo);
                    System.out.println("");
                } else{
                    System.out.println("Comparación " + c + ": " + arreglo[j] + " < " + arreglo[j+1]);
                    System.out.println("Intercambio: No hay intercambio");
                    System.out.print("Estado actual: ");
                    printArray(arreglo);
                    System.out.println("");
                }
                c+=1;
            }
        }
        System.out.println("");
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
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cam+=1;
                }
                c+=1;
            }
        }
        System.out.println("");
        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        c-=1;
        cam-=1;
        System.out.println("Comparaciones totales: " + c);
        System.out.println("Intercambios totales: " + cam);
        System.out.println("");
        System.out.println("|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }

    // Método para imprimir el arreglo
    public void printArray(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                System.out.println(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + ", " );
            }
        }
    }
}