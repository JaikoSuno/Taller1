package com.ucn.talleres;

public class ListaLibros {
    private Libro[] listaLibros;
    private int cantActual;
    private int cantMax;

    public ListaLibros(int cantMax) {
        this.listaLibros = new Libro[cantMax];
        this.cantActual = 0;
        this.cantMax = cantMax;
    }

    public int getCantActual() {
        return this.cantActual;
    }

    public int getCantMax(){
        return this.cantMax;
    }

    public void agregarLibro(Libro l){
        if(this.cantActual < this.cantMax){
            if(!existeLibro(l.getTitulo())){
                this.listaLibros[cantActual] = l;
                this.cantActual ++;
            }
        }
    }

    public boolean eliminarLibro(String titulo){
        int pos = -1;
        for(int i=0; i < this.cantActual; i++){
            if(titulo.equalsIgnoreCase(listaLibros[i].getTitulo())){
                pos = i;
                break;
            }
        }
        // Libro no encontrado
        if(pos == -1){
            return false;
        }else{
            for(int k = pos; k < this.cantActual - 1; k++){
                this.listaLibros[k] = this.listaLibros[k + 1];
            }
            this.cantActual --;
            return true;
        }
    }

    public boolean existeLibro(String titulo) {
        for (int i = 0; i < this.cantActual; i++) {
            if (titulo.equalsIgnoreCase(this.listaLibros[i].getTitulo())) {
                return true;
            }
        }
        return false;
    }

    public String getLibros(){
        String msj = "";
        for(int i = 0; i < this.cantActual; i++){
            msj += this.listaLibros[i].toString() + "\n";
        }
        return msj;
    }
}
