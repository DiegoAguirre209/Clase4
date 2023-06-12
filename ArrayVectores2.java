import java.util.Scanner;
public class ArrayVectores2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int vector[] = new int[10];
        int numeroIngresado;
        
        for(int i = 0; i < 10; i ++){ //int esta solamente declarada dentro de este for
           System.out.println("Ingrese 10 numeros entre 20 y 50 " + i + ": ");
           numeroIngresado = s.nextInt();
            while(numeroIngresado  < 20 || numeroIngresado > 50){
            System.out.println("numero fuera de rango, ingrese nuevamente");
            numeroIngresado = s.nextInt();
            
        }
       
        vector[i] = numeroIngresado;
/* 
System.out.println("Valores del vector");
        for(int i = 0; i < 10; i ++){ //int esta solamente declarada dentro de este for
           System.out.println("Indice " + i + ": " + vector[i]);   */
      
          
    }
    

}
}
