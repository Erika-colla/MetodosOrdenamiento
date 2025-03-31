public class MetodoSeleccion {
    public int[] ordenarDescAsce(int[] arreglo, boolean isDes, boolean conPasos){
        if(isDes) {
            ordenarDescSeleccion(arreglo, conPasos);
        } else {
            ordenarAscSeleccion(arreglo, conPasos);
        }
        return arreglo;
    }
    public  void ordenarDescSeleccion(int[] arreglo, boolean conPasos) {
        int conComparaciones = 0;
        int conCambios = 0;
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                conComparaciones++;
                if(conPasos){
                    System.out.println("Comparacion "+ conComparaciones + ": " + arreglo[j] + " > " + arreglo[maxIdx]);
                }
                if (arreglo[j] > arreglo[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                if(conPasos){
                    System.out.println("Intercambia " + arreglo[maxIdx] +" <-> "+ arreglo[i]);
                }
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
                conCambios++;
            }
        }
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios);
        

    }

    public void ordenarAscSeleccion(int[] arreglo, boolean conPasos) {
        int conComparaciones = 0;
        int conCambios = 0;
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                conComparaciones++;
                if(conPasos){
                    System.out.println("Comparacion "+ conComparaciones + ": " + arreglo[j] + " < " + arreglo[maxIdx]);
                }
                if (arreglo[j] < arreglo[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                if(conPasos){
                    System.out.println("Intercambia " + arreglo[maxIdx] +" <-> "+ arreglo[i]);
                }
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
                conCambios++;
            }
        }
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios);
        
    }

}