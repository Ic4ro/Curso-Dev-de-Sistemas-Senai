package com.mycompany.livros;

public class Books {
    private String titulo;
    private String autor;
    private int pags;
    private double preco;

    public Books(String titulo, String autor, int pags, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
        this.preco = preco;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}