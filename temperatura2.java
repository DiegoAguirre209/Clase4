import java.util.Scanner;

public class temperatura2 {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
        double [] temperatura =  new double[12];
        double [] humedad = new double[12];
        double temperaturaPromedio = 8.1;
        double humedadPromedio = 72;
        double acumuladorHumedad;
        double acumuladorTemperatura;
        //int [] array = new int[12];
        int nTemp = temperatura.length;
        int nHum = humedad.length;
        //int tmp;

        
        for (int i = 0; i < 12; i ++){
            System.out.println("Ingrese la temperatura");
            temperatura[i] = s.nextDouble();
            System.out.println("Ingrese la humedad" + i + 1);
            humedad[i] = s.nextDouble(); 
        }

            for(int i = 0; i < nTemp - 1 ; i ++){      //bucle para acceder a los elementos del array
                for (int j = 0; j < nTemp - i - 1 ;j++){ //bucle compara los elementos adyacentes
    
                    if(temperatura[j] > temperatura[j + 1]){  //cambiar de menor a mayor 
                        double tmp = temperatura[j];
                        temperatura[j] = temperatura[j + 1];
                        temperatura[j + 1] = tmp;
                    }
                }

                for (int j = 0; j < nHum - i - 1 ;j++){ //bucle compara los elementos adyacentes
    
                    if(humedad[j] > humedad[j + 1]){  //cambiar de menor a mayor 
                        double tmp = humedad[j];
                        humedad[j] = humedad[j + 1];
                        humedad[j + 1] = tmp;
                    }
                }
            }

            //System.out.println();
            System.out.println("Ordenada la Temperatura");
               for(int i = 0; i < nTemp; i++){
                System.out.print(temperatura[i] + "  ");

            System.out.println();
            System.out.println("Ordenada la Humedad");
               for(int i = 0; i < nHum; i++){
                System.out.print(humedad[i] + "  ");

        }
    }
}
}