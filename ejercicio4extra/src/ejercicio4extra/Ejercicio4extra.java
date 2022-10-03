/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra;

import ejercicio4extra.Entidades.Nif;
import ejercicio4extra.Servicios.NifServicios;

/**
 *
 * @author dpicc
 */
public class Ejercicio4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    NifServicios ns = new NifServicios();
    Nif n = new Nif();
    ns.CrearNif(n);
    ns.mostrar(n);
    
    
    
    
    
    
    }
}