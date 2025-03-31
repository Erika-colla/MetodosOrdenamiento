import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Ingrese la cantidad de numeros a ordenar");
            int tamanio = scanner.nextInt();
            if(tamanio <= 0) {
                System.out.println("Debe ingresar un valor positivo mayor a 0");
                opcion = 5;
            }
            int[] arreglo = new int[tamanio];

            for(int i = 0; i < arreglo.length; i++) {
                System.out.println("Ingrese el numero " + (i + 1));
                arreglo[i] = scanner.nextInt();
            }
            System.out.println();
            System.out.println("Seleccione el método de ordenamiento: ");
            System.out.println("1. Burbuja");
            System.out.println("2. Seleccion");
            System.out.println("3. Insercion");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            if( opcion >= 1 && opcion <= 5 ) {
                boolean conPasos = false;
                String ordenamiento = "A";
                System.out.println("¿Desea ver los pasos? (true/false):");
                conPasos = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
                ordenamiento = scanner.nextLine();
                if(ordenamiento.equals("A") || ordenamiento.equals("D")) {
                    switch (opcion) {
                        case 1:
                            MetodoBurbuja burbuja = new MetodoBurbuja();
                            if(ordenamiento.equals("A")) {
                                burbuja.ordenarDescAsce(arreglo, false);
                            } else {
                                burbuja.ordenarDescAsce(arreglo, true);
                            }
                            imprimirArreglo(arreglo);
                            break;
                        case 2: 
                            MetodoSeleccion seleccion = new MetodoSeleccion();
                            if(ordenamiento.equals("A")) {
                                seleccion.ordenarDescAsce(arreglo, false);
                            } else {
                                seleccion.ordenarDescAsce(arreglo, true);
                            }
                            imprimirArreglo(arreglo);
                            break;
                        case 3: 
                            MetodoInsercion insercion = new MetodoInsercion();
                            if(ordenamiento.equals("A")) {
                                insercion.ordenarDescAsce(arreglo, false);
                            } else {
                                insercion.ordenarDescAsce(arreglo, true);
                            }
                            imprimirArreglo(arreglo);
                            break;
                            case 4: 
                            MetodoBurbujaMejorado burbujaMejorado = new MetodoBurbujaMejorado();
                            if(ordenamiento.equals("A")) {
                                burbujaMejorado.ordenarDescAsce(arreglo, false);
                            } else {
                                burbujaMejorado.ordenarDescAsce(arreglo, true);
                            }
                            imprimirArreglo(arreglo);
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("Opcion invalida, intente nuevamente");
                }
            } else {
                System.out.println("Opcion invalida, intente nuevamente");
            }
            

        } 

        scanner.close(); 
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("Arreglo ordenado-> ");
        for(int j = 0; j < arreglo.length; j++) {
            System.out.print(arreglo[j] + " ");
            System.out.println();
        }
    }
}
