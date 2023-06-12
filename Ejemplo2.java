import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        boolean flag = false;

        
            System.out.print("ingrese un numero: ");
            num1 = s.nextInt();
            System.out.print("ingrese otro numero: ");
            num2 = s.nextInt();
            if(num1 > num2 ){
                System.out.println("num1 mayor a num2");
            
            }else if(num1 < num2){

            System.out.println("num1 es menor a num2");    

            }  else{ System.out.println("num1 es igual a num2");
       
            }

    }
} 

