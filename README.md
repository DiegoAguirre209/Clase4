import clases.peliculas;
import java.util.Scanner;

public class VideoClub{

    public static void main(String[] args){
        
     //alquiler, stock, cantidad de veces q alquilo, pelicula mas alquilada//    
      Scanner s = new Scanner(System.in);
      peliculas[] pelis = new peliculas[3];
      boolean flag = true;

        for (int i = 0; i < 3; i++){
        pelis[i] = new peliculas();  

        }
    
        do{
            System.out.println(" Menu: ");
            System.out.println("1: Cargar peliculas ");
            System.out.println("2: Mostrar pelicula ");
            System.out.println("3: Comprobar estado");
            System.out.println("4: Ver pelicula");
            System.out.println("5: salir");
            switch(Integer.parseInt(s.nextLine())){
                case 1:
                    // cargar
                     for(int i = 0; i < 3; i++){
                            System.out.println("Ingrese nombre de la pelicula");
                            pelis[i].setNombre(s.nextLine());
                            System.out.println("Ingrese genero");
                            System.out.println("1: Accion");
                            System.out.println("2: Drama");
                            System.out.println("3: Documental");
                                switch(Integer.parseInt(s.nextLine())){
                                    case 1:
                                        pelis[i].setGenero("Accion" ); 
                                        break;
                                    case 2:
                                        pelis[i].setGenero("Drama");
                                        break;
                                    case 3:
                                        pelis[i].setGenero("Documental");
                                        break;
                                    default:
                                        pelis[i].setGenero("Drama");
                                }  
                            }
                    break;
                case 2:
                    for(int i = 0; i < 3; i++){
            
                        System.out.println(pelis[i].getNombre() + " genero: "+ pelis[i].getGenero());
                        if(pelis[i].getRebobinado()){
                        System.out.println("Pelicula Rebobinada");    
                        }else{
                            System.out.println("No esta rebobinada");
                        }    
                    }
                    break;
                case 3:
                    System.out.println(pelis[0].getRebobinado());
                    System.out.println(pelis[1].getRebobinado());
                    System.out.println(pelis[2].getRebobinado());
                    break;

                case 4:
                   
                
                case 5: 
                    flag = false;
            }
        }while(flag);
    }
}

