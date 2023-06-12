public class OrdenamientoBurbuja {

    public static void main(String[] args){
    int [] array = {-2, 45, 0, 11, -9};
    int n = array.length;
    int tmp;
    
        System.out.println("Array desordenado");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < n; i ++){      //bucle para acceder a los elementos del array
            for (int j = 0; j < n - i - 1 ;j++){ //bucle compara los elementos adyacentes

                if(array[j] > array[j + 1]){  //cambiar de menor a mayor 
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            } 
        }


        System.out.println();
        System.out.println("Array Ordenado");
           for(int i = 0; i < n; i++){
            System.out.print(array[i] + "  ");
            
        }

    }
   

}

