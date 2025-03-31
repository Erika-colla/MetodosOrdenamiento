public class MetodoBurbujaMejorado {

    public int[] ordenarDescAsce(int[] arreglo, boolean isDes, boolean conPasos) {
        if (!isDes) {
            ordenarAsc(arreglo, conPasos);
        } else {
            ordenarDes(arreglo, conPasos);
        }
        return arreglo;
    }

    public int[] ordenarAsc(int[] arreglo, boolean conPasos) {

        int n = arreglo.length; 
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                contComparaciones++;
                if (conPasos) {
                    System.out.println("Comparacion " + contComparaciones + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                }
                if (arreglo[j] > arreglo[j + 1]) {
                    if (conPasos) {
                        System.out.println("Intercambia " + arreglo[j] + " <-> " + arreglo[j+1]);
                    }
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[i + 1] = aux;
                    contCambios++;
                }else {
                    if (conPasos) {
                        System.out.println("No hay intercambio");
                    }
                }
            }

        }

        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Intercambios Totales -> " + contCambios);

        int[] respuestas = { contComparaciones, contCambios };
        return respuestas;
    }

    public int[] ordenarDes(int[] arreglo, boolean conPasos) {

        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                contComparaciones++;
                if (conPasos) {
                    System.out.println("Comparacion " + contComparaciones + ": " + arreglo[j] + " < " + arreglo[j + 1]);
                }
                if (arreglo[j] < arreglo[j + 1]) {
                    if (conPasos) {
                        System.out.println("Intercambia " + arreglo[j] + " <-> " + arreglo[j+1]);
                    }
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[i + 1] = aux;
                    contCambios++;
                }else {
                    if (conPasos) {
                        System.out.println("No hay intercambio");
                    }
                }
            }

        }

        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Intercambios Totales -> " + contCambios);

        int[] respuestas = { contComparaciones, contCambios };
        return respuestas;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}
