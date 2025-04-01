import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;


        // Métodos
        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mM = new MetodoBurbujaMejorado();

        while(continuar) {
            int[] listado = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
            String[] posibles = {"true", "false", "A", "D", "Si", "No"};
            
            System.out.println("|---------------------------------------------------------------------------- Métodos Ordenamiento -------------------------------------------------------------------------|");
            System.out.println("");
            System.out.println(" 1.- Burbuja");
            System.out.println(" 2.- Seleccion");
            System.out.println(" 3.- Insercion");
            System.out.println(" 4.- Burbuja Mejorado");
            System.out.println(" 5.- Salir");
            System.out.println("");

            //int metodo = scanner.nextInt();
            int metodo = getPositive (scanner, "Seleccione un método de ordenamiento (1-5): ");
            System.out.println("");       
            String pasos = getValidString(scanner, posibles, "¿Desea ver los pasos? (true/false) (Si/No): ");
            System.out.println("");         
            boolean verPasos = pasos.equalsIgnoreCase("true") || pasos.equalsIgnoreCase("Si");
            String orden = getValidString(scanner, posibles, "¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            System.out.println("");
            boolean ordenValida = orden.equalsIgnoreCase("A") || orden.equalsIgnoreCase("Ascendente");
            int[] resultados;
            switch (metodo) {
                case 1:
                    System.out.println("|-------------------------------------------------------------------------------- Método Burbuja ---------------------------------------------------------------------------|");
                    System.out.println("");
                    System.out.println("Arreglo original:");
                    mB.printArray(listado);
                    System.out.println("");

                    if (verPasos){
                        System.out.println("Calculando pasos por cada sección...");
                        if (ordenValida) {

                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mB.ordenarAscendentePasos(listado);
                            System.out.println("");
    
                        }else{
    
                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mB.ordenarDescendentePasos(listado);
                            System.out.println("");
    
                        }
                    }else{
                        if (ordenValida) {

                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mB.ordenarAscendente(listado);
                            System.out.println("");
    
                        }else{
    
                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mB.ordenarDescendente(listado);
                            System.out.println("");
    
                        }
                    }
                    break;
                case 2:
                    System.out.println("|------------------------------------------------------------------------------- Método Selección --------------------------------------------------------------------------|");
                    System.out.println("");
                    System.out.println("Arreglo original:");
                    mS.printArray(listado);
                    System.out.println("");

                    if (verPasos){
                        System.out.println("Calculando los pasos recorridos...");
                        if (ordenValida) {

                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mS.ordenarAscendentePasos(listado);
                            System.out.println("");

                        }else{

                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mS.ordenarDescendentePasos(listado);
                            System.out.println("");

                        }
                    }else{
                        if (ordenValida) {
                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mS.ordenarAscendente(listado);
                            System.out.println("");

                        }else{

                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mS.ordenarDescendente(listado);
                            System.out.println("");

                        }
                    }
                    break;
                case 3:
                    System.out.println("|------------------------------------------------------------------------------- Método Inserción --------------------------------------------------------------------------|");
                    System.out.println("");
                    System.out.println("Arreglo original:");
                    mI.printArray(listado);
                    System.out.println("");

                    if (verPasos){
                        System.out.println("Calculando los pasos recorridos...");
                        if (ordenValida) {

                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mI.ordenarAscendentePasos(listado);
                            System.out.println("");

                        }else{

                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mI.ordenarDescendentePasos(listado);
                            System.out.println("");

                        }
                    }else{
                        if (ordenValida) {
                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mI.ordenarAscendente(listado);
                            System.out.println("");

                        }else{

                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mI.ordenarDescendente(listado);
                            System.out.println("");

                        }
                    }
                    break;
                case 4:
                    System.out.println("|--------------------------------------------------------------------------- Método Burbuja Mejorado -----------------------------------------------------------------------|");
                    System.out.println("");
                    System.out.println("Arreglo original:");
                    mM.printArray(listado);
                    System.out.println("");

                    if (verPasos){
                        System.out.println("Calculando pasos por cada sección...");
                        if (ordenValida) {

                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mM.ordenarAscendentePasos(listado);
                            System.out.println("");
    
                        }else{
    
                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mM.ordenarDescendentePasos(listado);
                            System.out.println("");
    
                        }
                    }else{
                        if (ordenValida) {

                            System.out.println("Ordenando en orden ascendente...");
                            System.out.println("");
                            mM.ordenarAscendente(listado);
                            System.out.println("");
    
                        }else{
    
                            System.out.println("Ordenando en orden descendente...");
                            System.out.println("");
                            mM.ordenarDescendente(listado);
                            System.out.println("");
    
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println("¡Intente nuevamente!");
                    break;
            }                         
        }   
    }
                        
    public static int getPositive (Scanner scanner, String message){
        int input;
        do {
            System.out.print(message);
            input = scanner.nextInt();
            if (input<=0){
                System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
                System.out.println("¡ERROR! El número debe ser positivo.");
                System.out.println("|Intente nuevamente|");
            }
        } while (input<=0);
        return input;
    }
    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;
        do{
            System.out.print(message);
            input = scanner.next();
            valido = false;
            for (String posible : posibles){
                if (input.equalsIgnoreCase(posible)){
                    valido = true;
                    break;
                }
            }
        }while(!valido);
        return input;
    }
}


