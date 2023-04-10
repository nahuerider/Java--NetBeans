
package holamundo;
import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

/**
 *
 * @author JAZMIN
 */
public class deCelsius_aFarenheit {
    public static void main(String[] args) {
   // primero invocamos al scanner junto a una variable.  
        Scanner leer = new Scanner(System.in);
        //despues creamos una variable String para almacenar lo que introduzca por teclado
        int num1, resultado ;
        
        
        System.out.println("Bienvenido a la calculadora de java de Grados Celsius a grados Farenheit");
        System.out.println("Ingrese un numero cualquiera.");
        //guardamos los que ingrese el usuario en la variable de Int
        num1 = leer.nextInt(); 
        
        //resalizamos la conversion con un calculo
        
        resultado = num1 × 9 / 5 + 32 
        
         System.out.println("La conversion a Farenheit es de : "+ resultado);

           
    }    
}
