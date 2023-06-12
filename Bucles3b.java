public class Bucles3b{
    public static void main(String[] args){

        int numeroIngresado;
        int contadorPares = 0;
//int i = 0 y en for iria solo int i
System.out.println("** Contador de Pares **");
System.out.println("Ingrese 5 numeros");

        for (int i = 0; i < 5; i ++){
            System.out.println("N° " + (i + 1) + ": ");
            numeroIngresado = Integer.parseInt(System.console().readLine());
            if((numeroIngresado % 2) == 0){
                contadorPares ++;

            }

        }
        System.out.println("Cantidad de pares: " + contadorPares);
    }
}