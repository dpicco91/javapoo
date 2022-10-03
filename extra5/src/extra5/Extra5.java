/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author dpicc
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mesSecreto[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Scanner leer = new Scanner (System.in);
        String secreto=mesSecreto[(int) (Math.random() * 11)];
        String mes;
    
    do{
        System.out.println("ingrese el mes"); 
        mes = leer.next();
        if (!secreto.equalsIgnoreCase(mes));
        System.out.println("no es el mes");
        System.out.println("ingrese de nuevo");
    
         } while (!secreto.equalsIgnoreCase(secreto));
         
            System.out.println("usted a acertado");
    
    }
}