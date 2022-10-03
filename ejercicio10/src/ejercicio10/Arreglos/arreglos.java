/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.Arreglos;

import java.util.Arrays;

/**
 *
 * @author dpicc
 */
public class arreglos {
   
    private final int vector50[] = new int [50];
    private final int vector20[] = new int [20];
    

   public void programa(arreglos a1){
  
       
       for (int i = 0; i < 50; i++) {
           vector50[i] =  (int) (Math.random()*10);
          
       }
       
      
       for (int i = 0; i < 50; i++) {
           System.out.print("[" + vector50[i] + "]" );
       }
       Arrays.sort(vector50);
       System.out.println("");
       System.out.println("----------------------------");
       System.out.println("Array ordenado");
       for (int i = 0; i < 50; i++) {
           System.out.print("[" + vector50[i] + "]" );
       }
       System.out.println("");
        System.arraycopy(vector50, 0, vector20, 0, 10);
       for (int i = 0; i < 10; i++) {
           vector20[i+10]=9 ;
       }
       System.out.println("-----------------------------");
       for (int i = 0; i < 20; i++) {
           System.out.print("[" + vector20[i] + "]" );
       }
   }
}
    
           
    

