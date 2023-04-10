/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentacondicionales;
import java.util.Scanner;
/**
 *
 * @author JAZMIN
 */
public class EncuentaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion; //creo la variable
        Scanner leer = new Scanner(System.in); //creo el escaner con unan variable
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");//le pido al usuario un digito
        opinion = leer.nextInt();// guardo el digito del usuario en la variable
        
        //eventos: 
        if (opinion >= 1 && opinion <= 5){
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no te halla gustado la pelicula, para la proxima ni vengas");
                    break;
                case 3:
                    
                    System.out.println("Has calificado a la pelicula como intermedia");
                    break;
                case 4:
                    
                    System.out.println("Has clasificado a la pelkcula como muy buena");
                    break;
                case 5:
                    
                    System.out.println("Has calificado como excelente, le diste la maxima clasificacion");
                    break;
            }
            
        }else if(opinion == 0){        
            System.out.println("Nos sentimos apenados, que no te halla gustado la pelicula, colocaste 0 estrellas, tan mala era ?");
                    
            }else if (opinion < 0 ){
                System.out.println("no aceptamos opiniones en negativo, si no le gusto coloque 0 cero.");
            }else {
                System.out.println("sos boludo? pusiste un numero afuera del rango, tenias que poneer del 1 al 5 la ptmadre");
                System.out.println("Por personas comovos , el shampoo trae isntrucciones");
            }
        System.out.println("Hasta la proxima! ");
    }
    
}
