/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debetener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main. 
 */
package giua4.subprogramas;

import static giua4.subprogramas.Giua4Subprogramas.saludoPersonalizado;
import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class CalculadoraSubPrograma {
public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido a la calculadora pero ahora , con Subprogramas");
        

        //¿como llamr a las funciones?
        
       //primero creamos una variable, y a esta le hacemos el llmado a la funcion y le damos parametros 
       int resultado =  suma(10,10);
       //dps, si todo esta bien, mostramos en pantalla
        System.out.println(resultado);
      
        
    }//fin main
    
    //inicio de sub programa
    //public  y static son fijos, dps sigue el tipo de dato, dps nombre de funcion. entre parentesis, los parametros que  va a recibir
    public static int suma(int a, int b){
        
        //logica
        int resultado = a + b;
        
        
        //En el cuerpo siempre poner RETURN
        return resultado; 
    }// fin subprograma 

    
}// fin public class 
