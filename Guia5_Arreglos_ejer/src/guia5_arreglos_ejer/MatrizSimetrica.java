/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5_arreglos_ejer;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author JAZMIN
 */
public class MatrizSimetrica {
    

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    boolean simetria = true;
    
    //tipo [][] nombreMatriz = {{volaores de la primera matriz}, {valores del seungo vector}};
    int matriz1[][], nFilas,nCol;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));

     matriz1 = new int[nFilas] [nCol]  ;//pedimos al usuario que carge numeros de filas y Columnas
     
     System.out.print("Digite la matriz, ");//le pedimos que la carge:
     for(int i=0; i<nFilas;i++){
         for(int j=0;j<nCol;j++){
             System.out.print("Matriz["+i+"]["+j+"]= ");
             matriz1[i][j] = entrada.nextInt();
         }
     
     }// fin de carga de matriz
     
     if (nFilas == nCol){ //primero verificamos que sea un cuadraro, con filas y columnas iguales
     
         int i,j;
         
         i=0;
         while(i<nFilas && simetria== true){
             j=0;
             while(j<i && simetria == true){
                 if(matriz1[i][j] != matriz1[j][i]){ // si los elementro son diferentes, no es simetrica
                     simetria = false; 
                 }
                 j++;
             }
             i++;
         }
       if(simetria == true){
           System.out.println("La matriz es simetica");
       
       }  else{
           System.out.println("La matriz no es simetrica0"
                   + "");
       }
         
     } else {
         System.out.println("La matriz no se puede transpasar, ya que no es simetrica");
         System.out.println("la cantidad de FIlas y de Columnas no son iguales");
     }
     
     
     
     

    //mostramos la amtriz
        System.out.println("/Matriz A: ");
        //para cada fila de la amtriz
        for(int[] fila : matriz1){
            String aux="";
            for(int elemento : fila){
                aux+= "  "+ elemento;
            }
            System.out.println(aux);
            
        }
    

    


}//fin main
}//fin class
