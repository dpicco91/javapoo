/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.numeros;

/**
 *
 * @author dpicc
 */
public class Servicios {
    numeros n1 = new numeros ();
    
    public int devolverMayor(numeros n1){
        if (n1.getNum1()>n1.getNum2()){
            return n1.getNum1();
            
        }else{
            return n1.getNum2();
        }
        
    }
    public void calcularPotencia(numeros n1){
        int potencia;
        if (n1.getNum1()>n1.getNum2()){
            potencia=(int)Math.pow(n1.getNum1(), n1.getNum2());
            
        }else{
            potencia=(int)Math.pow(n1.getNum2(),n1.getNum1());
            System.out.println("el resultado es : "+ potencia);
        }
    }
    public void calcularRaiz (numeros n1){
        
        if (n1.getNum1()> n1.getNum2()){
            int absoluto= Math.abs(n1.getNum2());
            int raiz = (int) Math.sqrt(absoluto);
               System.out.println("La raiz cuadrada del numero es " + raiz);
        }else{
            int absoluto= Math.abs(n1.getNum1());
            int raiz = (int) Math.sqrt(absoluto);
            System.out.println("La raiz cuadrada del numero es " + raiz);
        }
        
    }
 }
        