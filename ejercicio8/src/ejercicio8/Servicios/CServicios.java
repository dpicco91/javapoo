/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.Servicios;

 ;

import ejercicio8.Entidades.Entidades;
import java.util.Scanner;

public class CServicios {
 Entidades fr = new Entidades ();
 Scanner leer = new Scanner (System.in);
 
 public void mostrarvocales(Entidades fr, String vector[]){
    int contador=0;
     for (int i = 0; i < fr.getLongitud(); i++) {
         if (vector[i].equalsIgnoreCase("a")){
             contador++;
         }  else if (vector [i].equalsIgnoreCase("e")){
             contador++;
             
         }else if (vector[i].equalsIgnoreCase("i")){
             contador++;
         } else if (vector [i].equalsIgnoreCase("o")){
             contador++;
         } else if (vector [i].equalsIgnoreCase("u")){
             contador++;
         }       
     }
     System.out.println("la cantidad de vocales en su frase es de : "+ contador);
 }
 public void invertirfrase(Entidades fr, String vector[]){
     String invertido[] = new String[fr.getLongitud()];
     for (int i = 0; i <fr.getLongitud(); i++) {
         invertido [i]=vector[(fr.getLongitud()-1)-i];
         }
     for (int i = 0; i <fr.getLongitud(); i++) {
         System.out.print(invertido[i]);
         
     }
     System.out.println(" ");
 }
 public void vecesrepetido(Entidades fr, String vector[]){
     String letra;
     int cont =0;
     System.out.println("ingrese la vocal a buscar");
     letra=leer.next();
     for (int i = 0; i <fr.getLongitud(); i++) {
         if (letra.equalsIgnoreCase(vector[i])){
             cont++;
         }
         if (cont==0){
             System.out.println("su letra no esta en la frase");
             
         }else {
             System.out.print("la letra"+ letra +"se repite "+ cont +"veces");
         }
     }
     
 }
 public String medirLongitud(Entidades fr, String vector[]){
        String frase2;
        System.out.println("Ingrese otra frase para comparar");
        frase2 = leer.nextLine();
        if (frase2.length()> fr.getLongitud()){
            System.out.println("La nueva frase es mas larga");
            
        }else if (frase2.length()< fr.getLongitud()){
            System.out.println("La frase original es mas larga");
        }else{
            System.out.println("Las frases tienen la misma longitud");
        }
     return frase2;
    }
    public void unirFrases(Entidades fr, String vector[]){
        String resultante;
        resultante = fr.getFrase().concat(medirLongitud(fr,vector));
        System.out.println(resultante);
    }
     public void cambiarVocales (Entidades fr, String vector[]){
         String letra;
         System.out.print("ingrese una letra para reemplaar la a");
         letra = leer.next();
         for (int i = 0; i <fr.getLongitud(); i++) {
             if (vector [i].equalsIgnoreCase("a")){
                 vector[i]=letra;
             }
             
         }
         for (int i = 0; i <fr.getLongitud(); i++) {
             System.out.println(vector[i]);
             
             
         }
         System.out.println(" ");
         
     }
   public Boolean contieneLetra(Entidades fr, String vector[]){
        String letra;
        Boolean esta = false;
        System.out.println("Ingrese la letra a buscar");
        letra = leer.next();
        for (int i = 0; i < fr.getLongitud(); i++) {
            if (vector[i].equalsIgnoreCase(letra)){
                esta=true;
                break;
            }
        }
     return esta;   
    }

        
}        
          

         
     
 
      
          
    
 

         
         
      
      
 

 

