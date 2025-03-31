public class MetodoInsercion {   
    
    public int[] ordenarDescAsce(int[] arreglo, boolean isDes, boolean conPasos){
        if(isDes) {
            ordenarAsd(arreglo, conPasos);
        } else {
            ordenarDes(arreglo, conPasos);
        }
        return arreglo;
    }

    public void ordenarAsd(int[] arreglo, boolean conPasos) { 

        int tam = arreglo.length; 
        int conComparaciones = 0;
        int conCambios = 0;

        for (int i = 1; i < tam; i++){
            int aux = arreglo [i];
            int j = i-1;
            while (j >= 0 && aux > arreglo[j]) {
                conComparaciones++;
                if(conPasos){
                    System.out.println("Comparacion " + conComparaciones + ": " + aux + " > " + arreglo[j]);
                    System.out.println("Intercambia " + arreglo[j + 1] +" <-> "+  arreglo[j]);
                }
                arreglo[j+1] = arreglo[j];
                j = j - 1 ;
                conCambios++;
            }
            if(j >= 0) {
                conComparaciones++;
                if(conPasos){
                    System.out.println("Comparacion " + conComparaciones + ": " + aux + " > " + arreglo[j]);
                }
            }
            if(conPasos){
                System.out.println("Intercambia " + arreglo[j + 1] +" <-> "+ aux);
            }
            arreglo[j + 1] = aux;
            conCambios++;
        }
        
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios); 
    }   

    public void ordenarDes(int[] arreglo, boolean conPasos) { 

        int tam = arreglo.length; 
        int conComparaciones = 0;
        int conCambios = 0;

        for (int i = 1; i < tam; i++){
           
            int aux = arreglo [i];
            
            int j = i-1;
            

            while (j >= 0 && aux < arreglo[j]) {
                conComparaciones++;
                if(conPasos){
                    System.out.println("Comparacion " + conComparaciones + ": " + aux + " < " + arreglo[j]);
                    System.out.println("Intercambia " + arreglo[j + 1] +" <-> "+  arreglo[j]);
                }
                arreglo[j+1] = arreglo[j];
                
                j = j - 1 ;
                
                conCambios++;
            }
            if(j >= 0) {
                conComparaciones++;
                if(conPasos){
                    System.out.println("Comparacion " + conComparaciones + ": " + aux + " < " + arreglo[j]);
                }
            }
            if(conPasos){
                System.out.println("Intercambia " + arreglo[j + 1] +" <-> "+ aux);
            }
            arreglo[j + 1] = aux;
            
            conCambios++;
        }
        
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios);
        

    }   
    
    
    public void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " - ");
        }
    }
}
