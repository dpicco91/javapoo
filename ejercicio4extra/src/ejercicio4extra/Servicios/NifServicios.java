/*
 String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

 */
package ejercicio4extra.Servicios;

import ejercicio4extra.Entidades.Nif;
import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dpicc
 */
public class NifServicios {
    String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    Scanner leer=new Scanner(System.in);
    public void CrearNif(Nif n){
        System.out.println("ingrese numero de dni");
        n.setDni(leer.nextLong());
        int num = (int) n.getDni()%23;
        n.setLetra(vector[num]);
        }
    public void mostrar(Nif n){
        String formato = String.format("%08d", n.getDni());
        System.out.println(formato+"-"+n.getLetra());
    }
}
