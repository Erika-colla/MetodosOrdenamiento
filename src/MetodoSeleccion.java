public class MetodoSeleccion {
    public int[] ordenarDescAsce(int[] arreglo, boolean isDes){
        if(isDes) {
            ordenarDescSeleccion(arreglo);
        } else {
            ordenarAscSeleccion(arreglo);
        }
        return arreglo;
    }
    public  void ordenarDescSeleccion(int[] arreglo) {
        int conComparaciones = 0;
        int conCambios = 0;
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Busca el índice del valor mayor
                System.out.println("Comparacion" + arreglo[j] + "> " + arreglo[maxIdx]);
                if (arreglo[j] > arreglo[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Intercambia los valores si es necesario
            if (maxIdx != i) {
                System.out.println("Intercambia " + arreglo[maxIdx] +" <-> "+ arreglo[i]);
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios);

    }

    public void ordenarAscSeleccion(int[] arreglo) {
        int conComparaciones = 0;
        int conCambios = 0;
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Busca el índice del valor mayor
                System.out.println("Comparacion" + arreglo[j] + "> " + arreglo[maxIdx]);
                if (arreglo[j] < arreglo[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Intercambia los valores si es necesario
            if (maxIdx != i) {
                System.out.println("Intercambia " + arreglo[maxIdx] +" <-> "+ arreglo[i]);
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios);
    }

}