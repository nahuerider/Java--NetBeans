/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados 
y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor
o igual al 7 de sus notas del curso.

 */
package guia5_ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class PromedioAlumnos {
    public static void main(String[] args) {

     //primero que nada hay que declarar una variable, que se convertira en arregloo mas adelante
    //tipo [] nombre de variable; 
    int[] vector1;
    String name="";
    int nelementos = 0, numUsuario=0, tp1=0,tp2=0,integrador=0,integrador2=0,cantidadDesaprovados=0,cantidadAprovados=0;
   int promediotp1=0,promediotp2=0,promedioInt=0,promedioInt2=0,promedioFinal=0;
        Scanner leer = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de Alumnos: ");
    nelementos = leer.nextInt();
    
    
    //crear en memoria el tamaño real del vector
    vector1 = new int [nelementos];

         //for de carga:
    for (int i=0; i< vector1.length; i++){
       

        
        System.out.println("Introduzca la nota del primer Parcial :");
        tp1=leer.nextInt();
            promediotp1= tp1*10/100; 
        
        System.out.println("Introduzca la nota del segundo Parcial :");
        tp2=leer.nextInt();
            promediotp2= tp2*15/100;
        
        System.out.println("Introduzca la nota del primer Integrador :");
        integrador=leer.nextInt();
            promedioInt= integrador*25/100;
            
        System.out.println("Introduzca la nota del segundo Integrador :");
        integrador2=leer.nextInt();
            promedioInt2= integrador2*50/100;
            
        
        
            
         promedioFinal = promedioInt + promedioInt2 +promediotp1 + promediotp2 ;
         System.out.println("EL promedio final de alumno en posicion "+i+" es de : "+promedioFinal);
         if(promedioFinal>=0 &&promedioFinal<=6){
             System.out.println("El alumno esta desaprobado!");
             cantidadDesaprovados ++;
         }else if(promedioFinal>=7 &&promedioFinal<=10){
             System.out.println("EL alumno esta aprovado");
             cantidadAprovados++;
         }else{
             System.out.println("el promedio del alumno esta fuera de rango, no esta aprovado ni desaprovado. simplemente no dan los numeros");
         }
         
         System.out.println("Continue la carga:");
         
   } // FINALIZADA LA CARGA DEL PRIEMR VECTOR
    
        System.out.println("ha finalizado la carga de alumnos con sus notas");
        System.out.println("La cantidad de alumnos aprovados es de: " +cantidadAprovados);
        System.out.println("La cantidad de alumnos Desaprovados es de: " +cantidadDesaprovados);

    }//end main
}//und class
