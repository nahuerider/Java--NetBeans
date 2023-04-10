/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas 
    y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package mayusculas_minuscula;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Mayusculas_Minuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // primero invocamos al scanner junto a una variable.  
        Scanner leer = new Scanner(System.in);
        //despues creamos una variable String para almacenar lo que introduzca por teclado
        String frase1;
        //mostramos un mensaje en pantalla para que usuario sepa que hay que introducir.
        System.out.println("Ingrese una frase cualquiera cualquiera.");
        //guardamos los que ingrese el usuario en la variable de string
        frase1 = leer.nextLine();
        
        //y por ultimo mostramos por pantalla un saludo personalizado, primero en mayuscula
        System.out.println("Hola usuario! Esta es tu frase en mayuscula: " + frase1.toUpperCase() );// TODO code application logic here
        
        //y por ultimo mostramos por pantalla un saludo personalizado, segundo Francia
        System.out.println("Hola usuario! Esta es tu frase en Minuscula: " + frase1.toLowerCase() );// TODO code application logic here
    }
    
}
