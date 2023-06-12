import java.util.Scanner;
public class GeneradorBanderas {
    public static void main (String[] args){
        //String[] color = {"\033[31mrojo", "\033[33m amarillo", "\033[32mverde", "\033[37mblanco", "\033[34mazul", "\033[30mnegro"};
        String[] color = {"\033[31m███████", "\033[33m███████", "\033[32m██████", "\033[37m██████", "\033[34m█████", "\033[30m█████"};
        Scanner s = new Scanner(System.in);
        int franjas;

        System.out.println("Generado de Banderas");
        System.out.println("Cuantas franjas tiene la bandera");
        franjas = s.nextInt();
        System.out.println("-------------");
            
                for (int i = 0; i < franjas; i ++ ){
                System.out.println(color[(int) (Math.random() * 6)]);
                System.out.println("-------------");   
                //System.out.println(color[5]);

            }

    }
    
}
