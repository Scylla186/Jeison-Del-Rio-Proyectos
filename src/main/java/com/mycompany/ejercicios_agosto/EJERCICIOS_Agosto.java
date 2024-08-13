/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_agosto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EJERCICIOS_Agosto {

    public static void main(String[] args) {
 
   
        JOptionPane.showMessageDialog(null, "Bienvenido al programa de tablas de multiplicar");
         String lineases = JOptionPane.showInputDialog( "De cual numero quieres saber las tablas?");
       
       double x = Integer.parseInt(lineases);
        Scanner scan=new Scanner(System.in);
            
        for (int i = 1; i <= 10; ++i){
           double resultado = x*i;
            System.out.println("la multiplicacion de "+x+"*"+i+" es igual a ="+resultado);
        }
           
    }
}
