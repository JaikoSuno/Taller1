package com.ucn.talleres;

public interface SistemaInterface {
    public void agregarLibro(String titulo, String autor, int cantPaginas);
    public void eliminarLibro(String titulo);
    public String desplegarLibros();
}
