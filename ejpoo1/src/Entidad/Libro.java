/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dpicc
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void llenarlibro(int isbn,String autor,String titulo, int paginas){
        this.isbn = isbn;
        this.autor= autor;
        this.titulo=titulo;
        this.paginas=paginas;
        
    }
    public void mostrarlibro(){
        System.out.println("El isbn del libro es : "+ isbn);
        System.out.println("El autor del libro es : "+ autor);
        System.out.println("El titulo del libro es : "+ titulo);
        System.out.println("La cantidad de paginas de libro son : "+ paginas );
        
    }
} 
         
