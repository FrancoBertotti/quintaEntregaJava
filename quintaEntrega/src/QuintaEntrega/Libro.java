/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Libro {
    private String titulo;
    private int isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, int isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void getEditorial() {
        System.out.println("editorial "+editorial.getNombre()+" y su direccion es "+editorial.getDireccion());;
    }

    public void getAutor() {
        System.out.println("nombre: "+autor.getNombre()+" de "+autor.getNacionalidad());
    }
    
    
    
    
    
}
