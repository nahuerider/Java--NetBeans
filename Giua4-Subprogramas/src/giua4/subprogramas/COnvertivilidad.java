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
public class COnvertivilidad {
   
     public static void main(String[] args) {
     
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Bienvenido a la calculadora de convertibilidad");
         System.out.println("ingrese la cantidad de efectivo que quiere convertir");
         int efectivo = leer.nextInt();
         
         System.out.println("Ha ingresado: "+ efectivo);
         
         System.out.println("---Menu---");
         System.out.println("1. Libras");
         System.out.println("2. Dolar");
         System.out.println("3.Yenes");
     
         System.out.println("Seleccione con el numero a que moneda desea convertir");
        int confirma = leer.nextInt(); 
        int resultado=0;
        
            if(confirma ==1){
                  resultado = (int) (efectivo * 0.86);
                  System.out.println("su efectivo convertido a Libra es de: "+ resultado);
            }else if(confirma ==2 ){
                           resultado = (int) (efectivo * 1.286);  
                           System.out.println("su efectivo convertido a Dolar es de: "+ resultado);
            }else if(confirma ==3 ){
                           resultado = (int) (efectivo * 129.852);  
                           System.out.println("su efectivo convertido a Yenes es de: "+ resultado);
            }          else{
                System.out.println("SU opcon elegida no es valida,la computadora explotara");
            }
     }
    
}
