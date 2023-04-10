/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package holamundo;
import java.util.Scanner;
/**
 *
 * @author JAZMIN
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // primero invocamos al scanner junto a una variable.  
        Scanner leer = new Scanner(System.in);
        //despues creamos una variable String para almacenar lo que introduzca por teclado
        String nombre;
        //mostramos un mensaje en pantalla para que usuario sepa que hay que introducir.
        System.out.println("Ingrese un nombre cualquiera.");
        //guardamos los que ingrese el usuario en la variable de string
        nombre = leer.next();
        
        //y por ultimo mostramos por pantalla un saludo personalizado
        System.out.println("Hola mundo! Soy " + nombre + " y este es mi primer programa en java!");
        
    }
    
}
