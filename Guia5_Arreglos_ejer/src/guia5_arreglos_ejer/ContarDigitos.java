/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5_arreglos_ejer;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class ContarDigitos {
public static void main(String[] args) {

     //primero que nada hay que declarar una variable, que se convertira en arregloo mas adelante
    //tipo [] nombre de variable; 
    int[] vector1;
    int nelementos = 0, numUsuario=0;
   
        Scanner leer = new Scanner(System.in);
    System.out.print("Introduzca el largo de elementos que queira tener el Vector: ");
    nelementos = leer.nextInt();
    
    //crear en memoria el tamaño real del vector
    vector1 = new int [nelementos];

         //for de carga:
    for (int i=0; i< vector1.length; i++){
        vector1[i] = (int) (Math.random()*100000);
        //con la linea de abajo mostramos como se carga de manera aleatoria
        System.out.println(vector1[i]);
       
   } // FINALIZADA LA CARGA DEL PRIEMR VECTOR

     System.out.println("Muy bien, el programa a complpetado el vector con numeros aleatorios del 1 al 100000");
     System.out.println("AHora, les dira cuantos numeros tiene 1, 2,3 ,4 o 5 digitos ");
     
     int contador1= 0,contador2= 0,contador3= 0,contador4= 0,contador5= 0;
      for (int i=0; i< vector1.length; i++){
            if(vector1[i] >=0 && vector1[i] <=9  ){ 
                contador1++;
                
                
            }else if(vector1[i] >=10 && vector1[i] <=99){
                contador2++;
            }else if(vector1[i] >=100 && vector1[i] <=999){
                contador3++;
            }else if(vector1[i] >=1000 && vector1[i] <=9999){
                contador4++;}
            else if(vector1[i] >=10000 ){
                contador5++;}
     
          }
      
      System.out.println("Numeros con un digito en su vector es: "+contador1);
      System.out.println("Numeros con dos digito en su vector es: "+contador2);
      System.out.println("Numeros con tres digito en su vector es: "+contador3);
      System.out.println("Numeros con cuatro digito en su vector es: "+contador4);
      System.out.println("Numeros con cinco digito en su vector es: "+contador5);
}
}