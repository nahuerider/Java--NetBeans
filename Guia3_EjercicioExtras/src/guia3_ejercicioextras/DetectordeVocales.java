/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
Nota: investigar la función equals() de la clase String.
 */
package guia3_ejercicioextras;
import java.util.Scanner;
/**
 *
 * @author JAZMIN
 */
public class DetectordeVocales {
    public static void main(String[] args) {
        //variables
        String letra="";
        Scanner leer = new Scanner(System.in);
        
        //fin variables
        
         System.out.println("Bienvenido al Detector de vocales");
         System.out.println("Ingrese una letra y el deciremos si es una vocal o no");
         letra = leer.nextLine(); //frase inicial
        
        //inicio de calculo 
        
        int longitud = letra.length();
           if (longitud <=1){
               
               if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
               
                   System.out.println("Su letra esa una vocal :D");
               }else{ 
                    System.out.println("Su letra no es una vocal, lo siento");
                        }
               
           }else{
               System.out.println("Colocaste mas de un digito, la computadora se va a Formatear");
               System.out.println("Por favor, no apage el computador");
           } 
            
         
    }
    
}
