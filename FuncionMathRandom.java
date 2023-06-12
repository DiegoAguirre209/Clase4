import javax.sql.rowset.spi.SyncFactory;

public class FuncionMathRandom {
    public static void main (String[] args){
    int [] vectorRandom = new int[50];
   // vectorRandom[i] = new int[50];

        for(int i= 0; i < vectorRandom.length; i ++){
           vectorRandom[i] = (int)(Math.random()*10)+1; 
        // System.out.println((int)(Math.random()*11)+50); //casting int - +50 numeros de 50 a 999
    }

        for(int i= 0; i < vectorRandom.length; i ++){

        System.out.print(" " + vectorRandom[i] + " ");
    }
    //System.out.print(vectorRandom[i] + " ");


    }
    
}
