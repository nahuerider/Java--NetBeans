/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
   si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package guia3_ejercicioextras;
import java.util.Scanner;
/**
 *
 * @author JAZMIN
 */
public class Guia3_EjercicioExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int num = 0, Dias= 0, Hrs=0, resto=0;
        Scanner leer = new Scanner(System.in);
        //fin variables
        
         System.out.println("Bienvenido al conversor de Minutos a Dias y horas");
         System.out.println("Ingrese una cantidad de minutos que desee transformar");
         num = leer.nextInt(); //frase inicial
        
        //inicio de calculo 
            Dias= num / 1440;
            resto =1440*Dias;
            Hrs=  (num - resto )/60 ;
            
         System.out.println("El resultadode la convercion en DIas es: "+ Dias);
         System.out.println("El resultadode la convercion en Horas es: "+ Hrs);
    }
    
}
