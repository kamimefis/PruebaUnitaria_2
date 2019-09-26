package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Libro libro= new Libro("Lib001", "Título", "Autor");
        ColeccionLibros instance= new ColeccionLibros();  
        instance.Agregar(libro);
        boolean esperado= true;
        libro= new Libro("Lib001", "Título2", "Autor2");
        boolean obtenido= instance.Modificar(libro);
        Assert.assertEquals(esperado, obtenido); 
    }
    
    
}
