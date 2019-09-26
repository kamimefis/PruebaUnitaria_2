package testjunit002;

import java.util.ArrayList;
import modelos.ColeccionLibros;
import modelos.Libro;

public class TestJUnit002 {

    public static void main(String[] args) {
        ColeccionLibros lista=new ColeccionLibros();
        Libro libro;
        String codigo;
        
        libro =new Libro("Lib001", "Titulo 1", "Autor 1");
        lista.Agregar(libro);        
        libro =new Libro("Lib002", "Titulo 2", "Autor 2");
        lista.Agregar(libro);        
        libro =new Libro("Lib003", "Titulo 3", "Autor 3");
        lista.Agregar(libro);        
        ListarLibros(lista.Listar());
        
        System.out.println("******************************");      
        libro =new Libro("Lib003", "Titulo tres", "Autor tres");
        lista.Modificar(libro); 
        ListarLibros(lista.Listar());
        
        System.out.println("******************************");   
        codigo = "Lib002";
        lista.Eliminar(codigo);
        ListarLibros(lista.Listar());
        
    }
    
    public static void ListarLibros(ArrayList<Libro> lista){
        for(Libro obj:lista){
            System.out.println("Codigo : "+obj.getCodigo());
            System.out.println("Titulo : "+obj.getTitulo());
            System.out.println("Autor : "+obj.getAutor());
            System.out.println("------------------------");
        }
    }
    
}
