package modelos;

import org.junit.Assert;
import org.junit.Test;


public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo= "Lib001";
        Libro libro= new Libro("Lib001", "Título", "Autor");
        ColeccionLibros instance= new ColeccionLibros();  
        instance.Agregar(libro);
        boolean esperado= true;
        boolean obtenido= instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido); 
    }
    
    
}
