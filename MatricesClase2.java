public class MatricesClase2 {
    
    public static void main(String[] args){

        int[][] matrizNull = new int[2][2];
       

        for(int i = 0; i < 2; i ++){ //inicializaion de la matriz
            for(int j = 0; j < 2; j ++){
                matrizNull[i][j] = (int)(Math.random() * 10);
                
                System.out.print("\nMatriz: " + matrizNull[i][j]);
            } 
                
   
        }
              
    }    


}
