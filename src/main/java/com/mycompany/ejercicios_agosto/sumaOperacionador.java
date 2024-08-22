/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_agosto;

/**
 *
 * @author Daniel
 */
  
    public class sumaOperacionador {
protected int num;
protected int num1;
 protected int sumant=num+num1;
 
 
 public sumaOperacionador(int num, int num1, int sumant){
        this.num = num;
        this.num1 = num1;
        sumant = num+num1;
        this.sumant = sumant;
    }
 
 public void setNum(int num){
     this.num = num;
 }
 
 public int getNum(){
     return num;
 }
 
  public void setNum1(int num1){
     this.num = num1;
 }
 
 public int getNum1(){
     return num1;
 }
 
 
 public void setSumant(int sumant ){
     this.sumant = sumant;
 }
         
      public int getSumant(){
     return sumant;
 }   
    
 
 
 
}
