/*
Realizar un algoritmo que llene un vector con los 100 primeros 
números enteros y los muestre por pantalla en orden descendente.
 */
package guia5_arreglos_ejer;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class ArregloCon100NumEnteros {
 public static void main(String[] args) {
 
     //primero que nada hay que declarar una variable, que se convertira en arregloo mas adelante
    //tipo [] nombre de variable; 
    int[] vector1;
    //crear en memoria el tamaño real del vector
    vector1 = new int [100];

    int contador = 1;
    
        
    //for de carga:
    for (int i=0; i< vector1.length; i++){
        System.out.println("v["+i+"]="+ contador);
        
        vector1[i] = vector1[i] + contador;
        contador ++;
        
   } // FINALIZADA LA CARGA DEL PRIEMR VECTOR
    
    System.out.println("Los valores del vector que tiene el tamañño de"+vector1.length+": "); 
    
     System.out.println("y ahora, te los muestro de manera descendente, porque la consigna me lo pide:");
     
        //for de DEscenso:
    for (int i=0; i< vector1.length; i++){
        System.out.println("v["+i+"]="+ contador);
        
        vector1[i] = vector1[i] + contador;
        contador --;
        
   }
     
     
 }//fin main

    
}//end class
