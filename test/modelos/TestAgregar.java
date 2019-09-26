package modelos;

import org.junit.Assert;
import org.junit.Test;


public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Libro libro= new Libro("Lib001", "Título", "Autor");
        ColeccionLibros instance= new ColeccionLibros();
        boolean esperado= true;
        boolean obtenido= instance.Agregar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
