/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_agosto;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIOS_agosto4T1 {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Bienvenido alanalizador de lista en java (analizador de numero X)");
        int L = 0;
        int vector [] = new int [11];
        System.out.println("porfavor introduzca el valor que quiere saber cuantas veces se repite");
                L = scan.nextInt();
          
      vector[0]=0;
                for (int x = 1; x <= 10; x++) {
                      System.out.println("porfavor introduzca el valor de la posicion: "+x);
                vector[x] = scan.nextInt();
   
                }
               
    Arrays.sort(vector);  
    
    int num = 0;
    for (int x = 1; x <= 10; x++) {
        if (vector[x]==L) {
        num += 1;    
 
        }
        
    }
    if (num <= 1){
        System.out.println("el numero "+L+" no se repite, pero si aparece en la lista 1 vez");
    } else {
        System.out.println("En la lista se repite el numero "+L+", "+num+" veces");
    }
    }            
}
