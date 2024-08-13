/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_agosto;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class ejercicio_agosto2T1 {
    
     public static void main(String[] args) {
         
         ArrayList<Integer> numeros = new ArrayList<>();
         int positivos = 0;
         int negativos = 0;
         int ceros = 0;
         int X = 0;
          System.out.println("cuantos numeros quiere saber si son positivos o negativos?");
             Scanner scan=new Scanner(System.in);
           X=scan.nextInt();
           int M = 0;
      for (int i = 1; i <= X; ++i){
          System.out.println("Introduzca valor del espacio: "+i);
            M=scan.nextInt();
          Integer f=X;
         numeros.add(M);
          Integer L;
          L = numeros.get(i-1);
          if (L>0){
              System.out.println("El numero es positivo");
              positivos += 1;
          } else { 
          if (L<0){
              System.out.println("El numero es negativo");
                  negativos += 1    ;
          } else {
              System.out.println("El numero es 0"); 
          ceros+=1;
          }
          }
      }
           System.out.println("La cantidad de ceros es: "+ceros);
          System.out.println("La cantidad de positivos es: "+positivos);
          System.out.println("La cantidad de negativos es: "+negativos);  
     }
}
