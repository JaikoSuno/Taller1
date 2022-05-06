package com.ucn.talleres;

import ucn.StdIn;
import ucn.StdOut;

public class Main {

    public static void main(String[] args) {
        SistemaInterfaceImpl biblioteca = new SistemaInterfaceImpl();
        StdOut.println("Bienvenido al Sistema de Andres y Catalina");
        int option;
        do{
            StdOut.println("[1] Agregar Libro");
            StdOut.println("[2] Elminar Libro");
            StdOut.println("[3] Desplegar Libros");
            StdOut.println("[4] Salir");
            option = StdIn.readInt();
            switch (option){
                case 1:
                    StdOut.println("Ingrese el titulo del libro: ");
                    String titulo = StdIn.readLine();
                    StdOut.println("Ingrese el autor del libro: ");
                    String autor = StdIn.readLine();
                    StdOut.println("Ingrese cantidad de paginas del libro: ");
                    int cantPaginas = StdIn.readInt();
                    biblioteca.agregarLibro(titulo, autor, cantPaginas);
                    break;
                case 2:
                    StdOut.println("Ingrese el titulo del libro a eliminar: ");
                    String tituloeliminar = StdIn.readLine();
                    biblioteca.eliminarLibro(tituloeliminar);
                    break;
                case 3:
                    StdOut.println(biblioteca.desplegarLibros());
                    break;
                case 4:
                    break;
                default:
                    option = -1;
                    break;
            }
        }while(option != 4);
    }
}
