public class Ejemplo4 { //clave de ingreso
    public static void main(String[] args){

        String clave = "clave";
        String claveIngresada;

        System.out.println("Ingrese clave: ");
        claveIngresada = System.console().readLine();
        if(clave.equals(claveIngresada)){
            System.out.print("Bienvenido");
        } else{
            System.out.print("Incorrecta Ingresaste " + claveIngresada);
            //System.out.print("Ingresaste " + claveIngresada);

        }

/* if claveIngresada == clave esto genera un error  */

    }
}
