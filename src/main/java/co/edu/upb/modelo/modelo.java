package co.edu.upb.modelo;

import java.util.HashMap;

public class modelo {
    private static HashMap<String, String> autorTit = new HashMap<String, String>();
    private static HashMap<String, Integer> tituloCant = new HashMap<String, Integer>();
    private static String titulo;
    private static String autor;
    private static int cantidad;

    public modelo(String titulo, String autor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    public static Object addLibroPorTitulo(String titulo, int cantidad) {
        tituloCant.put(titulo, cantidad);
        return null;
    }

    public static Object addLibroPorAutor(String autor, String libro) {
        autorTit.put(autor, libro);
        return null;
    }

    public static boolean removeLibro(String titulo, int cantidad) {
            tituloCant.remove(titulo);
            return true;
    }
    public static boolean removeLibroAutor(String titulo, String autor) {
            autorTit.remove(titulo);
            return true;
    }
    public  static boolean buscarlibroPorTitulo (String titulo, int cantidad){
        for (String key: tituloCant.keySet()) {
            if(key.equals(titulo)){
                return true;
            }
        }
        return false;
    }
    public static boolean buscarlibroPorAutor (String titulo, String autor){
        for (String key: autorTit.keySet()) {
            if(key.equals(titulo)){
                return true;
            }
        }
        return false;
    }
}
