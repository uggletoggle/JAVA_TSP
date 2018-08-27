package ejercicio1_poo;

public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int n_paginas; 
    
    public String getISBN(){
        return ISBN;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getPaginas(){
        return n_paginas;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setPaginas(int paginas){
        n_paginas = paginas;
    }
    
    @Override
    public String toString(){
        return "ISBN " + ISBN + " " + titulo + "- Autor: " + autor + " "
                + n_paginas + " paginas";
    }
}
