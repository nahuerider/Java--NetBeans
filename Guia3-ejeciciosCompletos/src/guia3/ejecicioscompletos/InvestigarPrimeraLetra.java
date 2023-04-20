/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 

Nota: investigar la función Substring y equals() de Java.
 */
package guia3.ejecicioscompletos;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class InvestigarPrimeraLetra {

    public static void main(String[] args) {
        String frase = "";
        String letra = "";
        String comparacion ="a";
        Scanner leer = new Scanner(System.in); //creo el escaner con unan variable
        
        System.out.println("Introduzca una frase, que empieze con A sino, el computador explotara ");//le pido al usuario una frase
        frase = leer.nextLine();// guardo la frase del usuario en la variable
        letra= frase.substring(0,1);
        
        System.out.println("TLa primera letra de la cadena ingresada es : " + letra );
        
        if(comparacion.equalsIgnoreCase(letra)){
            System.out.println("correcto, su primera letra es una A ");
        }else {
                System.out.println("Incorrecto, introdujiste una diferente a 'A' .");
                System.out.println("Inicio de autodestruccion: 10 %, por favor no apage el computador");
            }
        System.out.println("Hasta la proxima! ");    
}

    
}
