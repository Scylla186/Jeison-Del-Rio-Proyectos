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
public class EJERCICIOS_agosto3T1 {
     public static void main(String args[]) {
	 Scanner scan=new Scanner(System.in);
        int num = 18;
         System.out.println("Bienvenido al programa de validacion de votantes");
         System.out.println("");
         System.out.println("Tenga presente que si quiere cerrar el programa ponga 0 como respuesta");
      
            System.out.println("Bienvenido al programa de validacion de votantes");
         System.out.println("");
       do {
                 System.out.println("Porfavor introduzca su edad");
            num = scan.nextInt();
            
                 if (num >= 18){
                    System.out.println("Usted puede votar");
                }    
                     
                     
                     if (num < 18){
                    System.out.println("Usted no puede votar");
                }
       }while (num < 0 || num > 0);
       
		if (num < 1){
                    System.out.println("El sistema termino");
                }
	}
}


