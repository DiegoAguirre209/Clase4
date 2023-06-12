public class BuclesEj2 {
    public static void main(String[] args){
        boolean flag = true;
        int numeroIngresado;
        int acumulador = 0;

        do{
            System.out.println("Ingrese un numero ");
            numeroIngresado = Integer.parseInt(System.console().readLine());
                if(numeroIngresado == -1){
                    System.out.println("Flag cambiado");
                    flag = false;

           
          
                }else{
               
                

                acumulador = acumulador + numeroIngresado;
            
        }while(flag);     
        System.out.println(acumulador);   


    }

}

}

