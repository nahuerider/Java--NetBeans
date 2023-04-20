/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejerciciosextras;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author JAZMIN
 */
public class sopadeLetras {
    public static void main(String[] args) {
        juego jsdel=new juego();
        String pala= new String("MAESTRO");
        String pala2= new String("TEACHER");
        char alfab[ ] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] sopa = new char[10][10];
        String opciones;opciones="0";
        int opci2;opci2=0;
        while (opci2<3){
          System.out.println("");
          System.out.println("1. NUEVA PALABRA");
          System.out.println("2. BUSQUEDA");
          System.out.println("3. SALIR");
          System.out.println("");
          opciones=JOptionPane.showInputDialog(null,"Teclee la opcion","SOPA DE LETRAS",JOptionPane.QUESTION_MESSAGE);
          opci2=Integer.parseInt(opciones);
          switch (opci2){
        case 1:{
            pala=jsdel.asignar(pala);
            pala2=jsdel.asignar2(pala2);
                break;
        }
        case 2:{
            jsdel.buscar(sopa, alfab, pala, pala2);
            break;
        }
        case 3:{
            JOptionPane.showMessageDialog(null, "Gracias por jugar");
            break;
        }
        }
     
        }
        }
 
    static class juego{
       public String asignar(String pala3){
          pala3=JOptionPane.showInputDialog(null,"Palabra en Español","SOPA DE LETRAS",JOptionPane.QUESTION_MESSAGE);
          pala3=pala3.toUpperCase();
          return (pala3);
       }
       public String asignar2(String pala4){
          pala4=JOptionPane.showInputDialog(null,"Significado en Ingles","SOPA DE LETRAS",JOptionPane.QUESTION_MESSAGE);
          pala4=pala4.toUpperCase();
          return (pala4);
       }
      public void buscar(char[][] sopa2, char[] alfab2, String pala3, String pala4){
          String opcion, opcion2;
          Random r = new Random();
          int x,i,j,p,b;
          p=0;b=0;
         b=r.nextInt(3);
          for (i=0; i<10; i++)
            for (j=0;j<10;j++){
               x= r.nextInt(26);
               sopa2[j][i]=alfab2[x];
        }
    if (b==0) {  
    x= r.nextInt(3);
    for (i=0; i<pala3.length(); i++){
        p=p+1;
        sopa2[x+p][i]=pala3.charAt(i);
    }
    }
    if (b==1) {
        x= r.nextInt(6);
    for (i=0; i<pala3.length(); i++){
        p=p+1;
        sopa2[x][p]=pala3.charAt(i);
    }
    }
    if (b==2) {
        x= r.nextInt(6);
    for (i=0; i<pala3.length(); i++){
        p=p+1;
        sopa2[p][x]=pala3.charAt(i);
    }
    }
    if (b==3) {
        x= r.nextInt(6);
    for (i=0; i<pala3.length(); i++){
        p=p+1;
        sopa2[i][x+p]=pala3.charAt(i);
    }
    }
     for (i=0; i<10; i++){
            for (j=0; j<10; j++)
                System.out.print(sopa2[j][i]+"  ");
            System.out.println();
            }
       
          opcion=JOptionPane.showInputDialog(null,"Palabra buscada","SOPA DE LETRAS",JOptionPane.QUESTION_MESSAGE);
          opcion=opcion.toUpperCase();
          if (opcion.equals(pala3)){
              opcion2=JOptionPane.showInputDialog(null,"Traduccion","SOPA DE LETRAS",JOptionPane.QUESTION_MESSAGE);
              opcion2=opcion2.toUpperCase();
              if (opcion2.equals(pala4))
                  JOptionPane.showMessageDialog(null,"Respuesta correcta ","SOPA DE LETRAS",JOptionPane.INFORMATION_MESSAGE );
              else
                  JOptionPane.showMessageDialog(null,"Respuesta incorrecta ","SOPA DE LETRAS",JOptionPane.INFORMATION_MESSAGE );
          }
              else
              JOptionPane.showMessageDialog(null,"Palabra no encontrada " );
          }
           
         
       }

}