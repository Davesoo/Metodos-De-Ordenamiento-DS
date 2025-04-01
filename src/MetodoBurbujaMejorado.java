public class MetodoBurbujaMejorado {

    public void ordenarAscendente(int[] arreglo) {
        int n = arreglo.length;
        int c = 0;
        int cam = 0;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                c++;
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                    cam++;
                }
            }
            if (!intercambio) break;
        }
        System.out.print("Estado actual: ");
        printArray(arreglo);
        System.out.println("");
        imprimirResultados(arreglo, c, cam);
    }

    public void ordenarAscendentePasos(int[] arreglo) {
        int n = arreglo.length;
        int c = 0;
        int cam = 0;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                c++;
                System.out.println("Comparación " + c + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                    cam++;
                } else {
                    System.out.println("Intercambio: No hay cambio");
                }
                System.out.print("Estado actual: ");
                printArray(arreglo);
                System.out.println("");
            }
            if (!intercambio) break;
        }
        imprimirResultados(arreglo, c, cam);
    }

    public void ordenarDescendente(int[] arreglo) {
        int n = arreglo.length;
        int c = 0;
        int cam = 0;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                c++;
                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                    cam++;
                }
            }
            if (!intercambio) break;
        }
        System.out.print("Estado actual: ");
        printArray(arreglo);
        System.out.println("");
        imprimirResultados(arreglo, c, cam);
    }

    public void ordenarDescendentePasos(int[] arreglo) {
        int n = arreglo.length;
        int c = 0;
        int cam = 0;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                c++;
                System.out.println("Comparación " + c + ": " + arreglo[j] + " < " + arreglo[j + 1]);
                if (arreglo[j] < arreglo[j + 1]) {
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                    cam++;
                } else {
                    System.out.println("Intercambio: No hay cambio");
                }
                System.out.print("Estado actual: ");
                printArray(arreglo);
                System.out.println("");
            }
            if (!intercambio) break;
        }
        imprimirResultados(arreglo, c, cam);
    }

    public void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : "\n"));
        }
    }

    public void imprimirResultados(int[] arreglo, int comparaciones, int intercambios) {
        System.out.print("Arreglo ordenado: ");
        printArray(arreglo);
        System.out.println("Comparaciones totales: " + comparaciones);
        System.out.println("Intercambios totales: " + intercambios);
        System.out.println("\n|------------------------------------------------------------------------------- FIN DEL MÉTODO ----------------------------------------------------------------------------|");
    }
}




    
    

    
