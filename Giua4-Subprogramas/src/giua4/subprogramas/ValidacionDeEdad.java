/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas 
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe
preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package giua4.subprogramas;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class ValidacionDeEdad {

     public static void main(String[] args) {
        //inicio variables
        
        Scanner leer = new Scanner(System.in);
        int correcta=0, incorrecta=0, edad= 0, cantidadLista= 0;
        
        int mayor = 0, menor= 0;
        String confirma, nombre="";
        
        //fin variables
        
        System.out.println("bienvenido a la lista de ALumnos, cuanto alumnos va a registrar? ");
         cantidadLista = leer.nextInt(); //frase inicial
        
            
     //inicio while
        while(cantidadLista !=0){
            
           
        System.out.println("Ingrese otro nombre");
          
        nombre = leer.nextLine();
            
          
         System.out.println("AHora ingrese su edad: ");
         edad = leer.nextInt(); //frase inicial
         
        //logica
       
            if(edad >18){ //este if es para que la frase que cumpla los 3 requisitos pedidos, puedan almacenarce en una lista de aprobados.
                mayor ++;
            }else{
                menor ++;
            }//fin else
 
        cantidadLista --;    
            //System.out.println("Ahora ingrese su respectiva edad");     
           
        }
      //fin while
     
      
        }//fin main

    //public  y static son fijos, dps sigue el tipo de dato, dps nombre de funcion. entre parentesis, los parametros que  va a recibir
    //public static int validar(int edad){
        
        
        
        //En el cuerpo siempre poner RETURN
        
    //}// fin subprograma 

    
}//fin public main
