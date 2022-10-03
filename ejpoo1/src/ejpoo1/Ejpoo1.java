/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejpoo1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author dpicc
 */
public class Ejpoo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1 = new Libro ();
        

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el isbn del libro");
       int isbn = scan.nextInt();


        System.out.println("Ingrese el autor del libro");
        String autor = scan.next();

        System.out.println("Ingrese el titulo del libro");
        String titulo = scan.next();

        System.out.println("Ingrese la cantidad de paginas del libro");
        int paginas = scan.nextInt();

        l1.llenarlibro(isbn, autor, titulo, paginas);
         
        l1.mostrarlibro();
        // TODO code application logic here
    }
    
}
