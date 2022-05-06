package com.ucn.talleres;

public class Libro {
    private String titulo;
    private String autor;
    private int cantPaginas;

    public Libro(String titulo, String autor, int cantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
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

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    @Override
    public String toString() {
        return "- Titulo:" + this.titulo + "\n" + "- Author: " +
                this.autor + "\n" + "- Cantidad de paginas: " + this.cantPaginas + "\n";
    }
}
