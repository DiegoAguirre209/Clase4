import java.util.Scanner;
public class EjemplosSwitchCase {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroMes;

        System.out.println("Ingrese numero del mes");
        numeroMes = s.nextInt();

       /* if(numeroMes == 1){
            System.out.println("El mes de enero");  

        } else if (numeroMes == 2){
            System.out.println("El mes de febrero"); 
           
        }
        else if (numeroMes == 3){
            System.out.println("El mes de marzo"); */

            switch(numeroMes){
                case 1: 
                        System.out.println("El mes de enero");
                        break;
                case 2: 
                        System.out.println("El mes de febrero");
                        break;   
                case 3: 
                        System.out.println("El mes de marzo");
                        break;  
                case 4: 
                        System.out.println("El mes de abril");
                        break;
                case 5: 
                        System.out.println("El mes de mayo");
                        break;   
                case 6: 
                        System.out.println("El mes de junio");
                        break;  
                case 7: 
                        System.out.println("El mes de julio");
                        break;
                case 8: 
                        System.out.println("El mes de agosto");
                        break;   
                case 9: 
                        System.out.println("El mes de Septiembre");
                        break;       
                case 10: 
                        System.out.println("El mes de octubre");
                        break;
                case 11: 
                        System.out.println("El mes de noviembre");
                        break;   
                case 12: 
                        System.out.println("El mes de diciembre");
                        break;            
                 default:
                        System.out.print("El numero es incorrecto");       

            }
           
        }
        
    }


