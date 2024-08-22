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
public class OPERACIONADOR_INADOR {
    
  
      
      
      
      
         public static void main(String args[]) {
	 Scanner scan=new Scanner(System.in);
        int num = 18;
        int num1 = 19;
         System.out.println("Bienvenido al programa de operaciones (basicas)");
         System.out.println("");
         System.out.println("Tenga presente que si quiere cerrar el programa ponga 0 como respuesta en ambos elementos");
      
            
         System.out.println("");
       do {
                 System.out.println("Porfavor introduzca su primer valor");
            num = scan.nextInt();
             System.out.println("Porfavor introduzca su segundo valor");
            num1 = scan.nextInt();
 
           int   suma;
            int  resta;
            int multiplicacion;
            int x=0;
            sumaOperacionador  sumante = new sumaOperacionador(num, num1, x);
        sumante.setNum(num);
        sumante.setNum1(num1);
           
            resta = num-num1;
            multiplicacion = num*num1;
            
          

            System.out.println("La suma de "+num+" y "+num1+" es: "+sumante.getSumant());
            System.out.println("La resta de "+num+" y "+num1+" es: "+resta);
            System.out.println("La multiplicacion de "+num+" y "+num1+" es: "+multiplicacion);
            
            
            
            
            
       }while (num < 0 || num > 0 || num1 < 0 || num1 > 0);
       
		
                    System.out.println("El sistema termino");
                }
	}



