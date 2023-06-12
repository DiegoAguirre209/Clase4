public class MenuSwicht {
    public static void main (String[] args){
    
         int seleccion;
         int num1;
         int num2;

         System.out.println("Ingrese un numero: ");
         num1 = Integer.parseInt(System.console().readLine());
         System.out.println("Ingrese otro numero: ");
         num2 = Integer.parseInt(System.console().readLine());
         

         System.out.println("*** Menu de Opciones***");
         System.out.println("1: Suma");
         System.out.println("2: Resta");
         System.out.println("3: Multiplicacion");
         System.out.println("4: Division");
         seleccion = Integer.parseInt(System.console().readLine());

             switch(seleccion){
            
              case 1:
              System.out.println("El resultado de la suma es: " + (num1 + num2));
                     break;
              case 2:
              System.out.println("El resultado de la resta es= "+ (num1 - num2));
                    break;
              case 3:
              System.out.println("El resultado de la multiplicacion es= " + (num1 * num2));
                    break;
              case 4:
              System.out.println("El resultado de la division es= " + ((double)num1 / (double)num2));
                    break;
                    default:
                    System.out.print("Opcion incorrecta");  
            }
            System.out.print("Fin del programa");  

    }
}
