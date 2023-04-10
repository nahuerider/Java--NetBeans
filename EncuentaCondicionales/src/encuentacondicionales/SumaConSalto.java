/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentacondicionales;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class SumaConSalto {
     public static void main(String[] args) {
        int num; //creo la variable
        Scanner leer = new Scanner(System.in); //creo el escaner con unan variable
        
        do{
            System.out.println("Ingrese un numero entero positivo ");
            num = leer.nextInt();
            if(num>1000){
                System.out.println("Este programa podria tardar, ¿estas seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")){
                    break;
                }
            }
        }while (num <= 0 || num > 1000);
            int j,suma;
            for(int i=1; i<=num; i++){
                if (i%2 != 0)
                    continue;
                suma = 0;
                j=1;
                while(j<=i){
                    suma += j ;
                    j ++;
                }
                System.out.println("la suma de los " + i + "numeros naturales es : "+ suma);
            }
}
   }
     