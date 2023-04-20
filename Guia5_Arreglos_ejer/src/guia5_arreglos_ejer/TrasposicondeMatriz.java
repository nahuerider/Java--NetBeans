/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5_arreglos_ejer;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author JAZMIN
 */
public class TrasposicondeMatriz {
    

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);  
    //tipo [][] nombreMatriz = {{volaores de la primera matriz}, {valores del seungo vector}};
    int matriz1[][] =  new int [3][3];
       
    
     
     System.out.print("Digite la matriz, ");//le pedimos que la carge:
     for(int i=0; i<3;i++){
         for(int j=0;j<3;j++){
             System.out.print("Matriz["+i+"]["+j+"]= ");
             matriz1[i][j] = entrada.nextInt();
         }
     
     }// fin de carga de matriz
     
     
    

    //mostramos la amtriz
        System.out.println("/Matriz A: ");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }

        //se hace cambia fila x columnas, la matriz se transpuesta:
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;i<i;j++){
                aux = matriz1[i][j];
                matriz1 [i][j] = matriz1[j][i];
                matriz1 [j][i] = aux;
            }
        }
//imprimios la matriz trasnpuesta:f
        System.out.println("La matriz transpuesta es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print (matriz1[j][i]+" ");
            }
            System.out.println("");
        }

}//fin main
}//fin class
