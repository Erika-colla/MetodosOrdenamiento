public class MetodoBurbujaMejorado {

    public int[] ordenarDescAsce(int[] arreglo, boolean isDes){
        if(isDes) {
            ordenarAsc(arreglo);
        } else {
            ordenarDes(arreglo);
        }
        return arreglo;
    }

        public int[] ordenarAsc(int[] arreglo) {

        int n = arreglo.length; //Tamaño arreglo
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
               // System.out.println("Comparaciones:"+"-> "+ arreglo[j] + ">" + arreglo[j+1]);
                contComparaciones++;
                System.out.println("Comparacion" + arreglo[i] + "> " + arreglo[j]);
                if(arreglo[j] > arreglo[j+1]){
                  int aux = arreglo[j]; 
                  arreglo[j] = arreglo[j+1];
                  arreglo[i + 1] = aux; 
                  contCambios++;
                }
            }
            //System.out.println("Estado Actual -> ");
            //imprimirArreglo(arreglo);
        
            }
            System.out.println("Comparaciones Totales -> " + contComparaciones);
            System.out.println("Intercambios Totales -> " + contCambios);
            int[] respuestas = {contComparaciones, contCambios};
            return respuestas;
        }

        public int[] ordenarDes(int[] arreglo) {

            int n = arreglo.length; //Tamaño arreglo
            int contComparaciones = 0;
            int contCambios = 0;
    
            for (int i = 0; i < n - 1; i++){
                for (int j = 0; j < n - 1; j++){
                    System.out.println("Comparaciones:"+"-> "+ arreglo[j] + ">" + arreglo[j+1]);
                    contComparaciones++;
    
                    if(arreglo[j] < arreglo[j+1]){
                      int aux = arreglo[j]; 
                      arreglo[j] = arreglo[j+1];
                      arreglo[i + 1] = aux; 
                      contCambios++;
                    }
                }
                //System.out.println("Estado Actual -> ");
                //imprimirArreglo(arreglo);
            
                }
                System.out.println("Comparaciones Totales -> " + contComparaciones);
                System.out.println("Intercambios Totales -> " + contCambios);
                int[] respuestas = {contComparaciones, contCambios};
                return respuestas;
            }
    
        
        public void imprimirArreglo(int[] arreglo){
            for(int i = 0; i < arreglo.length; i++){
                System.out.print(arreglo[i] + " - ");
            }
        }
    }



