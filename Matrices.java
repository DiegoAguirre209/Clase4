public class Matrices {
    public static void main(String[] args){

        int[][] matrizNull = new int[3][3];
        int [][] matrizNoNull = {{1,2,3},   //{{1,2,3},{4,5,6},{7,8,9}}; // dos formas
                                 {4,5,6},
                                 {7,8,9}}; 

        for(int i = 0; i < 3; i ++){ //inicializaion de la matriz
            for(int j = 0; j < 3; j ++){
                matrizNull[i][j] = (int)(Math.random() * 10);
            }    
        }
    }    
}
