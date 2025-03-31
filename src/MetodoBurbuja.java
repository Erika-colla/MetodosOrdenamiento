public class MetodoBurbuja {

    public int[] ordenarDescAsce(int[] arreglo, boolean isDes, boolean conPasos) {
        int comparacionesTotales = 0;
        int intercambiosTotales = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (!isDes) {
                    comparacionesTotales++;
                    if (conPasos) {
                        System.out.println(
                                "Comparacion " + comparacionesTotales + ": " + arreglo[i] + " > " + arreglo[j]);
                    }
                    if (arreglo[i] > arreglo[j]) {
                        if (conPasos) {
                            System.out.println("Intercambia " + arreglo[i] + " <-> " + arreglo[j]);
                        }
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                        intercambiosTotales++;
                    } else {
                        if (conPasos) {
                            System.out.println("No hay intercambio");
                        }
                    }
                } else {
                    comparacionesTotales++;
                    if (conPasos) {
                        System.out.println(
                            "Comparacion " + comparacionesTotales + ": " + arreglo[i] + " < " + arreglo[j]);
                    }
                    if (arreglo[i] < arreglo[j]) {
                        if (conPasos) {
                            System.out.println("Intercambia " + arreglo[i] + " <-> " + arreglo[j]);
                        }
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                        intercambiosTotales++;
                    } else {
                        if (conPasos) {
                            System.out.println("No hay intercambio");
                        }
                    }
                }
            }
        }
        System.out.println("Comparaciones Totales -> " + comparacionesTotales);
        System.out.println("Intercambios Totales -> " + intercambiosTotales);
        return arreglo;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
    }

}
