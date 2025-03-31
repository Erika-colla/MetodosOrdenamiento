public class MetodoBurbuja {
    public void ordenarAsendente(int[] arreglo) {

        int n = arreglo.length; //Tamaño arreglo
        for (int i = 0; i<n;i++){
            for (int j= i+1; j<n;j++){
                System.out.println("Comparacion" + arreglo[i] + "> " + arreglo[j]);
                if(arreglo[i] > arreglo[j]){
                  System.out.println("Intercambia " + arreglo[i] +" <-> "+ arreglo[j]);
                  int aux = arreglo[j]; 
                  arreglo[j] = arreglo[i];
                  arreglo[i] = aux; 
                }else{
                    System.out.println("No hay intercambio");
                }
            }
        }
    }

    public int[] ordenarDescAsce(int[] arreglo, boolean isDes){
        int comparacionesTotales = 0;
        int intercambiosTotales = 0;
        for(int i = 0; i < arreglo.length; i++){
            for (int j = i + 1 ;j < arreglo.length; j++){
               if (!isDes){
                    System.out.println("Comparacion" + arreglo[i] + "> " + arreglo[j]);
                    comparacionesTotales++;
                    if (arreglo[i] > arreglo[j]){
                        System.out.println("Intercambia " + arreglo[i] +" <-> "+ arreglo[j]);
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                        intercambiosTotales++;
                    }else{
                        System.out.println("No hay intercambio");
                    }
                } else {
                    System.out.println("Comparacion" + arreglo[i] + "> " + arreglo[j]);
                    comparacionesTotales++;
                    if (arreglo[i] < arreglo[j]){
                        System.out.println("Intercambia " + arreglo[i] +" <-> "+ arreglo[j]);
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                        intercambiosTotales++;
                    }else{
                        System.out.println("No hay intercambio");
                    }
                } 
            }
        }
        System.out.println("Comparaciones Totales -> " + comparacionesTotales);
        System.out.println("Intercambios Totales -> " + intercambiosTotales);
        return arreglo;
    }

    public void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " - ");
        }
    }

    public void ordenarAsendente2(int[] arreglo) {

        int n = arreglo.length; //Tamaño arreglo
        for (int i = 0; i<n;i++){
            for (int j= i+1; j<n;j++){
                System.out.println("i= " + i + " j+"+j);
                if(arreglo[i] > arreglo[j]){
                  int aux = arreglo[j]; 
                  arreglo[j] = arreglo[i];
                  arreglo[i] = aux; 
                }
            }
        }
    }
    
}
