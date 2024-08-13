/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_agosto;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class EJERCICIOS_agosto5T1 {
     public static void main(String args[]) {
          Scanner scan = new Scanner (System.in);
         int[][] AlumNotas = new int [5][4];
        
         
         
          for (int x = 1; x <= 5; x++) {
                      System.out.println("A continuacion introducira las notas del estudiante "+(x)+"");
                      
           for (int xs = 1; xs <= 3; xs++) {
               System.out.println("Introduzca la nota "+xs+" del estudiante "+x);
                    AlumNotas[x-1][xs-1] = scan.nextInt();
   
                }         
 
                }
           
      for (int x = 1; x <= 5; x++) {
          int A;
          int B;
          int C;
         A = AlumNotas[x-1][0];
         B = AlumNotas[x-1][1];
         C = AlumNotas[x-1][2];
         
                System.out.println(""+A+B+C);
                
                AlumNotas[x-1][3]=((A+B+C)/3);
                
                      System.out.println("el promedio del estudiante "+x+" es: "+AlumNotas[x-1][3]);
                 }   
     }
}
