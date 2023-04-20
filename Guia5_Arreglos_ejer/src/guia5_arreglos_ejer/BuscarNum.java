/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
    le pida al usuario un número a buscar en el vector.
    El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package guia5_arreglos_ejer;
import java.util.Scanner;
/**
 *
 * @author JAZMIN
 */
public class BuscarNum {
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
    System.out.println("Introduzca un numero entero, para verificar si se encuentra en la lista o no");
    
    numUsuario = leer.nextInt();
    
    //inicia for de comparacion y validacion
   int contador= 0;
      for (int i=0; i< vector1.length; i++){
            if(numUsuario == vector1[i]){ 
                contador++;
                System.out.println("El numero ingresado:"+ numUsuario + " se repite en la posicion: "+vector1[i]);
                
            }else{
                
            }
        }
     if(contador>=1){
     
         System.out.println("Su numero ingrsado se repite: "+contador );
     }   else{
     System.out.println("El numero ingresado no se encuentra en el vector");
     }
    
    
}//fin main    
}//end class
