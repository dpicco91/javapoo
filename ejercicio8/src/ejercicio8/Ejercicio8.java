/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.Entidades.Entidades;
import ejercicio8.Servicios.CServicios;
import java.util.Scanner;

/**
 *
 * @author dpicc
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        String frase;
       Entidades fr = new Entidades();
       CServicios cs= new CServicios();
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        fr.setFrase(frase);
        fr.setLongitud(frase.length());
        String vector[] = new String[frase.length()];
        for (int i = 0; i < fr.getLongitud(); i++) {
            vector[i] = frase.substring(i, i+1);
            }
        cs.mostrarvocales(fr, vector);
        cs.invertirfrase(fr, vector);
        cs.vecesrepetido(fr, vector);
        cs.medirLongitud(fr, vector);
        cs.unirFrases(fr, vector);
        cs.cambiarVocales(fr, vector);
        }
       
     
     
    }
    

