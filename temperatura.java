import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
        double [] temperatura =  new double[12];
        double [] humedad = new double[12];
        double temperaturaPromedio = 8.1;
        double humedadPromedio = 72;
        double acumuladorHumedad;
        double acumuladorTemperatura;

        for (int i = 0; i < 12; i ++){
            System.out.println("Ingrese la temperatura");
            temperatura[i] = s.nextDouble();

            System.out.println("Ingrese la humedad");
            humedad[i] = s.nextDouble();
            

          
        }




    }
}
