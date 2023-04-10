/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // primero invocamos al scanner junto a una variable.  
        Scanner leer = new Scanner(System.in);
        //despues creamos una variable String para almacenar lo que introduzca por teclado
        int num1, num2, resultado;
        //mostramos un mensaje en pantalla para que usuario sepa que hay que introducir.
        System.out.println("Bienvenido a la calculadora de java");
        System.out.println("Ingrese un numero cualquiera.");
        //guardamos los que ingrese el usuario en la variable de string
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero para la suma");
        //guardamos los que ingrese el usuario en la variable de string
        num2 = leer.nextInt();
        
        resultado = num1 + num2;
        
        //y por ultimo mostramos por pantalla un saludo personalizado
        System.out.println("El resultado de la suma es: " + resultado);

    }
    
}
