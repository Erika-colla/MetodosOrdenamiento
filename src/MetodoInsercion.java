public class MetodoInsercion {   
    
    public int[] ordenarDescAsce(int[] arreglo, boolean isDes){
        if(isDes) {
            ordenarAsd(arreglo);
        } else {
            ordenarDes(arreglo);
        }
        return arreglo;
    }

    public void ordenarAsd(int[] arreglo) { 

        int tam = arreglo.length; 
        int conComparaciones = 0;
        int conCambios = 0;

        for (int i = 1; i < tam; i++){
            System.out.println("i: " + i);
            int aux = arreglo [i];
            System.out.println("aux: " + aux);
            int j = i-1;
            System.out.println("j: " + j);

            while (j >= 0 && aux < arreglo[j]) {
                conComparaciones++;
                System.out.println("Compara aux: " + aux + "con arreglo: " + arreglo[j] + " : " + arreglo [j+1]);
                arreglo[j+1] = arreglo[j];
                System.out.println(arreglo[j+1]);
                j = j - 1 ;
                System.out.println(j);
                conCambios++;
            }
            arreglo[j + 1] = aux;
            System.out.println(arreglo[j+1]);
            conCambios++;
        }
        System.out.println("Comparaciones Totales -> " + conComparaciones);
        System.out.println("Intercambios Totales -> " + conCambios);

    }   

    public void ordenarDes(int[] arreglo) { 

        int tam = arreglo.length; 
        int conComparaciones = 0;
        int conCambios = 0;

        for (int i = 1; i < tam; i++){
            System.out.println("i: " + i);
            int aux = arreglo [i];
            System.out.println("aux: " + aux);
            int j = i-1;
            System.out.println("j: " + j);

            while (j >= 0 && aux > arreglo[j]) {
                conComparaciones++;
                System.out.println("Compara aux: " + aux + "con arreglo: " + arreglo[j] + " : " + arreglo [j+1]);
                arreglo[j+1] = arreglo[j];
                System.out.println(arreglo[j+1]);
                j = j - 1 ;
                System.out.println(j);
                conCambios++;
            }
            arreglo[j + 1] = aux;
            System.out.println(arreglo[j+1]);
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
