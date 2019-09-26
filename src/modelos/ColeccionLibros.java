package modelos;

import java.util.ArrayList;

public class ColeccionLibros {

    private ArrayList<Libro> libros;
    
    public  ColeccionLibros(){
        this.libros= new ArrayList<Libro>();
    }
    
    
    public ArrayList<Libro> Listar(){
        return this.libros;
    }
    
    public boolean Agregar(Libro libro){
        return this.libros.add(libro);
    }
    
    public boolean Modificar(Libro libro){
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getCodigo().equals(libro.getCodigo())){
                libros.get(i).setCodigo(libro.getCodigo()); //línea optativa..El código es el mismo, por lo que va a reemplazar a el mismo código
                libros.get(i).setTitulo(libro.getTitulo());
                libros.get(i).setAutor(libro.getAutor());
                return true;  
            }
        }
        
        return false;
    }
    
    public boolean Eliminar(String codigo){
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getCodigo().equals(codigo)){
                libros.remove(i);
                return true;  
            }
        }
        return false;
    }
}
