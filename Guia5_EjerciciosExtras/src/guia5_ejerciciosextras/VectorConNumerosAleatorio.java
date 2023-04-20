/*
 *Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
 */
package guia5_ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class VectorConNumerosAleatorio {
    public static void main(String[] args) {

     //primero que nada hay que declarar una variable, que se convertira en arregloo mas adelante
    //tipo [] nombre de variable; 
    int[] vector1;
    int nelementos = 0, numUsuario=0;
   
        Scanner leer = new Scanner(System.in);
    System.out.println("Introduzca el largo de elementos que queira tener el Vector");
    nelementos = leer.nextInt();
    
    
    //crear en memoria el tamaño real del vector
    vector1 = new int [nelementos];

         //for de carga:
    for (int i=0; i< vector1.length; i++){
        vector1[i] = (int) (Math.random()*100);
        //con la linea de abajo mostramos como se carga de manera aleatoria
        System.out.println(vector1[i]);
       
   } // FINALIZADA LA CARGA DEL PRIEMR VECTOR
    
    System.out.println("Muy bien, el programa a complpetado el vector con numeros aleatorios del 1 al 100");  
    
    
    
    }//fin main
    
}//fin class
