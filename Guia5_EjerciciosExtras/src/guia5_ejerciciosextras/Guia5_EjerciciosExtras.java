/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.

 */
package guia5_ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia5_EjerciciosExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

         int tamañoVector=0,numUsuario=0 ,sumaTotal=0;
            //primero que nada hay que declarar una variable, que se convertira en arregloo mas adelante
            //tipo [] nombre de variable; 
            int[] vector1;
        
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el largo de elementos que queira tener el Vector");
        tamañoVector = leer.nextInt();
    
        //crear en memoria el tamaño real del vector
        vector1 = new int [tamañoVector];

         //for de carga:
        for (int i=0; i< vector1.length; i++){
            System.out.print("Ahora,introduzca un numero para almacenar y cargar en la posicion "+i +" :  ");
        vector1[i] = leer.nextInt();
        sumaTotal = sumaTotal + vector1[i];
        
   } // FINALIZADA LA CARGA DEL PRIEMR VECTOR
  
        System.out.println("Finalizo la carga del vector: ");
        for (int i=0;i<vector1.length; i++){
            System.out.print(" "+vector1[i]+" + ");
        }
        
         System.out.println("el resultado de todos los digitos es de: "+ sumaTotal);
        // TODO code application logic here
    }//fin main
    
}//fin class
