/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Servicios.Servicios;
import entidades.numeros;

/**
 *
 * @author dpicc
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        numeros n1 = new numeros();
        Servicios s1 = new Servicios();
                System.out.println("el numero 1 es: "+n1.getNum1()+"el numero 2 es : "+n1.getNum2());
                System.out.println("el numero mayor es "+s1.devolverMayor(n1));
                s1.calcularPotencia(n1);
                s1.calcularRaiz(n1);
                
        // TODO code application logic here
    }
    
}
