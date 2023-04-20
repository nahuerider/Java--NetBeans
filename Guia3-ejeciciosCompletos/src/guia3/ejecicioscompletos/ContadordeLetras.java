/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package guia3.ejecicioscompletos;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class ContadordeLetras {
public static void main(String[] args) {
        String frase = "";
        Scanner leer = new Scanner(System.in); //creo el escaner con unan variable
        
        System.out.println("Introduzca una frase, tiene que tner menos de 8 caracteres sino, el computador explotara ");//le pido al usuario una frase
        frase = leer.nextLine();// guardo la frase del usuario en la variable
        System.out.println("la cantidad de letras de tu frase es de: "+ frase.length());
        
        //evento
            if (frase.length()<= 8){
                System.out.println("Correcto, usted introduzco una frase menor a 8 caracteres. Felicitaciones");
            
            
        } else if (frase.length()>= 8){
                System.out.println("Incorrecto, introdujiste una frase muy larga.");
                System.out.println("Inicio de autodestruccion: 10 %, por favor no apage el computador");
            }
        System.out.println("Hasta la proxima! ");    
}
}   