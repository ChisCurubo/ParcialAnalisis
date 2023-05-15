package co.edu.upb.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class modeloTest {
    modelo model;
    @BeforeEach
    void setUp() {
    model = new modelo("El Principito", "Antoine de Saint-Exupéry" , 35);
    }

    @Test
    void addLibroPorTituloTest (){
        Assertions.assertEquals(null, modelo.addLibroPorTitulo("El Principito",35));
    }

    @Test
    void addLibroPorAutorTest (){
        Assertions.assertEquals(null, modelo.addLibroPorAutor("Antoine de Saint-Exupéry","El Principito"));
    }

    @Test
    void  removeLibroTest(){
        Assertions.assertEquals(true, modelo.removeLibro("El Principito",35));
    }

    @Test
    void testGetPlaca(){

    }

    @Test
    void testValidarCarro(){

    }

    @Test
    void testValidarMoto(){

    }


}