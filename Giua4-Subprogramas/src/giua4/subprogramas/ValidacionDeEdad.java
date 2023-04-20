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
        int correcta=0, incorrecta=0, edad= 0;
        String cadena, nombre;
        
        //fin variables
        
         System.out.println("Ingrese Nombre y apellido");
         nombre = leer.nextLine();
       
     //inicio while
        while(!nombre.equalsIgnoreCase("no")){
            
            
         System.out.println("AHora ingrese su edad: ");
         edad = leer.nextInt(); //frase inicial
         
         
         
            System.out.println("Ingrese otro nombre");
            System.out.println("Para finalizar escriba: no ");
            nombre = leer.nextLine();
            
            
           
        }
      //fin while
     
      int validar = validar(edad, );
      
         System.out.println("Cantidad de mayores: " + mayor);
         System.out.println("Cadenas incorrectas: "+ menor);
        }//fin main

    //public  y static son fijos, dps sigue el tipo de dato, dps nombre de funcion. entre parentesis, los parametros que  va a recibir
    public static int validar(int edad){
        
        int mayor = 0, menor= 0;
        //logica
       
            if(edad >18){ //este if es para que la frase que cumpla los 3 requisitos pedidos, puedan almacenarce en una lista de aprobados.
                mayor ++;
            }else{
                menor ++;
            }//fin else
        
        
        //En el cuerpo siempre poner RETURN
        return mayor, menor; 
    }// fin subprograma 

    
}//fin public main
