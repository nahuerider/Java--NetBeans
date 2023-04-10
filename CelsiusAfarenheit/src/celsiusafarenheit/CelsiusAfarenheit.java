/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusafarenheit;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class CelsiusAfarenheit {

    /**
     * @param args the command line arguments
     */
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
        
        resultado = 32 + (9 * num1 / 5);

         System.out.println("La conversion a Farenheit es de : "+ resultado);        

// TODO code application logic here
    }
    
}
