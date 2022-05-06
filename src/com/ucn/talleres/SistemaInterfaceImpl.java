package com.ucn.talleres;

public class SistemaInterfaceImpl implements SistemaInterface{

    private ListaLibros listaLibros;

    public SistemaInterfaceImpl(){
        this.listaLibros = new ListaLibros(100);
    }

    @Override
    public void agregarLibro(String titulo, String autor, int cantPaginas) {
        Libro l = new Libro(titulo, autor, cantPaginas);
        listaLibros.agregarLibro(l);
    }

    @Override
    public void eliminarLibro(String titulo) {
        listaLibros.eliminarLibro(titulo);
    }

    @Override
    public String desplegarLibros() {
        return listaLibros.getLibros();
    }
}
