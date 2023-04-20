/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas 
enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final
de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia3.ejecicioscompletos;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class dispositivoRS232 {
 
     public static void main(String[] args) {
        //inicio variables
        
        Scanner leer = new Scanner(System.in);
        int correcta=0, incorrecta=0;
        String cadena;
        
        //fin variables
        
         System.out.println("Ingrese una frase de 5 caracteres");
         System.out.println("el primer caractere tiene que ser una X y la ultima una O: ");
         cadena = leer.nextLine(); //frase inicial
       
     //inicio while
        while(!cadena.equals("&&&&&")){
        
            int longitud = cadena.length(); //saco la longitud de caracteres
            
            if(cadena.substring(0,1).equalsIgnoreCase("x") && (cadena.endsWith("o")) && (longitud <= 5)){ //este if es para que la frase que cumpla los 3 requisitos pedidos, puedan almacenarce en una lista de aprobados.
                correcta ++;
            }else{
                incorrecta ++;
            }//fin else
            
            System.out.println("Ingrese otra cadena de caracteres correcta");
            System.out.println("Para finalizar escriba: &&&&& ");
            cadena = leer.nextLine();
        }
      //fin while
     
         System.out.println("Cadenas correctas: " + correcta);
         System.out.println("Cadenas incorrectas: "+ incorrecta);
        }//fin main
     
        
       }//fin class
     
