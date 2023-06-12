public class EjemploSwicht2 {
    public static void main (String[] args){

        String nombre;
        String seleccion;

       

        System.out.println("Ingrese un nombre: ");
       nombre = System.console().readLine();
        

            switch(nombre){
           
            case "Ricardo":
            System.out.println("Bienvenido " + nombre);
            break;

            case "Susana":
            System.out.println("Bienvenida " + nombre);
                break;

                case "Mirtha":
            System.out.println("Bienvenida " + nombre);
            break;

            case "Carlos Saul":
            System.out.println("Bienvenido " + nombre);
            break;

           
                   default:
                   System.out.print("Opcion incorrecta \n");  
           }
           System.out.print("Fin del programa");  

   


    }
  
    

    
}
