/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giua4.subprogramas;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Giua4Subprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //¿como llamr a las funciones?
        
       //primero creamos una variable, y a esta le hacemos el llmado a la funcion y le damos parametros 
       int resultado =  suma(10,10);
       //dps, si todo esta bien, mostramos en pantalla
        System.out.println(resultado);
      
        //cuando es un archivo string, el codigo es ams corto, simplemente lo invocamos y le ponemos el valor adentro del parentesis
       saludoPersonalizado("Manolo");
      
       // si quiero cargar el nombre por teclado usamos.
       
       Scanner leer = new Scanner(System.in);
       String nombre = leer.next();
       saludoPersonalizado(nombre);
    }//fin main
    
    //inicio de sub programa
    //public  y static son fijos, dps sigue el tipo de dato, dps nombre de funcion. entre parentesis, los parametros que  va a recibir
    public static int suma(int a, int b){
        
        //logica
        int resultado = a + b;
        
        
        //En el cuerpo siempre poner RETURN
        return resultado; 
    }
        
     
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre+ ", hagarramelo con las manos");
    }

    private static String nextline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
    

