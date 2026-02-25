package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;  
    

    public Libro(){
    };

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;

    };

    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor =  autor;
        this.paginas = paginas;

    };

    public void mostrarDetalles(){
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }

        



}
