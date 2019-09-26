package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionLibros instance= new ColeccionLibros();
        ArrayList<Libro> esperado= new ArrayList<Libro>();
        ArrayList<Libro>obtenido= instance.Listar();
        Assert.assertEquals(esperado, obtenido);       
    }
    
}
