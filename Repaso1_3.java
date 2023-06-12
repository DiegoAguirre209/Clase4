public class Repaso1_3 {
    public static void main (String[] args){
        boolean flag;
        //flag=true;
        //if(flag){
          //  System.out.println("Flag es verdadero");
        //}else{
          //  System.out.println("Flag es falso");
        
        int variableComparacion;
        int variableUsuario;
        variableComparacion = 10;
        System.out.println("Ingrese un numero");
        variableUsuario = Integer.parseInt(System.console().readLine());  
        if(variableUsuario == variableComparacion){
            System.out.println("El numero ingresado es igual a 10");
        }else if(variableUsuario < variableComparacion){
            System.out.println("El numero ingresado es menor a 10");   
        }else{
            System.out.println("El numero ingresado es mayor a 10");
        }
        System.out.println("Fin de ejecucion");
        }
              
        
    }
