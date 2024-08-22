/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_agosto;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        int[] Estaturas = new int [25];
        
        for (int x = 1; x <= 25; x++){
            System.out.println("Porfavor introduzca la estatura del estudiante  "+x+"  en cm totales (ejemplo: 170)");
            Estaturas[x-1]  = scan.nextInt();
            
        }
        
    Arrays.sort(Estaturas); 
    
        System.out.println("El mas bajo del curso es el estudiante:   "+Estaturas[0]);
        System.out.println("El mas Alto del curso es:   "+Estaturas[24]);
    
    
    }
}
