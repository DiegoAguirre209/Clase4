public class Ejemplo3 {
    public static void main(String[] args){
        int num1;
        int num2;
        boolean flag = false;

        System.out.println("Ingrese un numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        if(num1 > num2 ){
                System.out.println("num1 mayor a num2");
            flag = true;
        } else if(num1 < num2){

            System.out.println("num1 es menor a num2");
               

        }  else{ System.out.println("num1 es igual a num2");

}
}
}