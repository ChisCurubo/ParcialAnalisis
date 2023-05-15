package co.edu.upb.controlador;

import co.edu.upb.modelo.modelo;

public class controlador {

    public void addLibroPorTitulo(String titulo, int cantidad){
        modelo.addLibroPorTitulo(titulo, cantidad);
    }
    public void addLibroPorAutor(String autor, String libro){
        modelo.addLibroPorAutor(autor, libro);
    }
    public void removeLibro(String titulo, int cantidad){
        modelo.removeLibro(titulo, cantidad);
    }
    public void buscarlibroPorTitulo (String titulo, int cantidad){
        modelo.buscarlibroPorTitulo(titulo, cantidad);
    }
    public void buscarLibroPorAutor(String autor, String libro){
        modelo.buscarlibroPorAutor(autor, libro);
    }
    public void removelibroAutor(String autor, String libro){
        modelo.removeLibroAutor(autor, libro);
    }

}
