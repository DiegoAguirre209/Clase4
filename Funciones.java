public class Funciones {
    public static void main(String[] args){  //funcion principal
    

        int[][] matrizNull = new int[3][3];
        int [][] matrizNoNull = {{1,2,3},   //{{1,2,3},{4,5,6},{7,8,9}}; // dos formas
                                    {4,5,6},
                                    {7,8,9}}; 
        int num1;
        int num2;                            

        for(int i = 0; i < 3; i ++){ //inicializaion de la matriz
            for(int j = 0; j < 3; j ++){
                matrizNull[i][j] = (int)(Math.random() * 10);
            }    
        } 
        System.out.println("Ingrese un numero");    
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese un numero");    
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println(" La suma de los numeros es: " + (num1 + num2));

        HolaMundo();
    } 
    //aca comienzala declaracion de funciones
    public static void HolaMundo(){
    System.out.println("Hola Mundo");
    }
    public static int SumaDosNumeros(){

    }
}