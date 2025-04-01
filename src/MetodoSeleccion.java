public class MetodoSeleccion {
   
    

    public void ordenarDescendente(int[] arreglo) {
        int c=1;
        int cam = 1;
        for (int i = 0; i < arreglo.length; i++){
            int iM = i;
            for (int j= i+1; j<arreglo.length; j++){
                if (arreglo[j]> arreglo[iM] ){
                    iM=j;
                    cam+=1;
                }
                c+=1;
            }
            if (i!=iM){
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM]= aux;
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

    public void ordenarDescendentePasos(int[] arreglo) {
        int c=1;
        int cam = 1;
        for (int i = 0; i < arreglo.length - 1; i++){
            int iM = i;
            for (int j = i+1; j < arreglo.length; j++){
                System.out.println("Comparación " + c + ": " + arreglo[iM] + " < " + arreglo[j]);
                if (arreglo[j]> arreglo[iM] ){
                    System.out.println("Intercambio: " + arreglo[iM] + " <-> " + arreglo[j]);
                    iM=j;
                    cam+=1;
                }else{
                    System.out.println("Intercambio: No hay intercambio");
                }
                System.out.println("Número mayor: " + arreglo[iM]);
                System.out.println("");
                c+=1;
            }
            if (i!=iM){
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM]= aux;
            }
            System.out.print("Estado actual: ");
            printArray(arreglo);
            System.out.println("");
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
    
    public void ordenarAscendente(int[] arreglo) {
        int c=1;
        int cam = 1;
        for (int i = 0; i< arreglo.length; i++){
            int iM = i;
            for (int j= i+1; j < arreglo.length; j++){
                if (arreglo[j] < arreglo[iM]){
                    iM=j;
                    cam+=1;
                }
                c+=1;
            }
            if (i!=iM){
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM]= aux;
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

    public void ordenarAscendentePasos(int[] arreglo) {
        int c=1;
        int cam = 1;
        for (int i = 0; i < arreglo.length - 1; i++){
            int iM = i;
            for (int j = i+1; j < arreglo.length; j++){
                System.out.println("Comparación " + c + ": " + arreglo[iM] + " > " + arreglo[j]);
                if (arreglo[j] < arreglo[iM] ){
                    System.out.println("Intercambio: " + arreglo[iM] + " <-> " + arreglo[j]);
                    iM=j;
                    cam+=1;
                }else{
                    System.out.println("Intercambio: No hay intercambio");
                }
                System.out.println("Número menor: " + arreglo[iM]);
                System.out.println("");
                c+=1;
            }
            if (i!=iM){
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM]= aux;
            }
            System.out.print("Estado actual: ");
            printArray(arreglo);
            System.out.println("");
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
            if (i == arreglo.length - 1){
                System.out.println(arreglo[i]);
            } else{
                System.out.print(arreglo[i] + ", ");
            }
        }
    }

}
