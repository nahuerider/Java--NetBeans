/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_arreglos_ejer;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia5_Arreglos_ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //Declaracion y creacion de un vector
    //tipo[] nombreVector = new tipo [Tamaño];
    
    //primero que nada hay que declarar una variable, que se convertira en arregloo mas adelante
    //tipo [] nombre de variable; 
    int[] vector1;
    //crear en memoria el tamaño real del vector
    vector1 = new int [2]; 
    
    //creamos una segundo vector para poder completar el ejercicio:
    int[] producto = new int [3];
    
    //ahora creamos una amtriz
    //tipo [][] nombreMatriz = {{volaores de la primera matriz}, {valores del seungo vector}};
    int[][] matriz1 = {{4,6,8},{2,1,7}};
    
    //ahora empezamos a cargar el vector, con los numeros del usuario:
    
        System.out.println("Ingrese los valores del vector que tiene el tamañño de"+vector1.length+":");
        Scanner leer = new Scanner(System.in);
        
    //for de carga:
    for (int i=0; i< vector1.length; i++){
        System.out.print("v["+i+"]=");
        vector1[i] = leer.nextInt();
        
   } // FINALIZADA LA CARGA DEL PRIEMR VECTOR
    
    //empezamos a recorrer la matriz y a multiplicarla con los valores del vector, para almacenar el resultado en el ector llamado PRODUCTO.
    
    for(int j=0; j<matriz1[0].length; j++){
        int sum=0;
        //recorro el vector y multiplico
        for(int i = 0; i< vector1.length; i++){
            sum += vector1[i] * matriz1[i][j];
        }
        producto[j]=sum;
    }
    String aux = "";
    
    //mostramos el vector
        System.out.println("* Vector:");
        
        //bucle for "mejorado"
        //for(tipo nombreVariable : arreglo)
        for(int elemento: vector1){
            aux = aux +"  " + elemento;
        }
        System.out.println(aux);
              
    //mostramos la amtriz
        System.out.println("/n* Matriz: ");
        //para cada fila de la amtriz
        for(int[] fila : matriz1){
            aux="";
            for(int elemento : fila){
                aux+= "  "+ elemento;
            }
            System.out.println(aux);
            
        }
    
    //por ultimo mostrar el resultado, osea la nueva matriz cargagada:
    aux="";
        System.out.println("/n* Vector x Matriz");
        for(int elemento: producto){
            aux+="  " + elemento;
        }
        System.out.println(aux);
        
        
    }// fin del main 
    
}
