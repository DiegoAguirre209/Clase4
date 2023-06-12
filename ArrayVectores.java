import java.util.Scanner;
public class ArrayVectores {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int vector[] = new int[10];
        
        for(int i = 0; i < 10; i ++){ //int esta solamente declarada dentro de este for
           System.out.println("Ingrese numero " + i + ": ");
            vector[i] = s.nextInt();
        }
        System.out.println("Valores del vector");
        for(int i = 0; i < 10; i ++){ //int esta solamente declarada dentro de este for
           System.out.println("Indice " + i + ": " + vector[i]);
          
    }
    

}
}
