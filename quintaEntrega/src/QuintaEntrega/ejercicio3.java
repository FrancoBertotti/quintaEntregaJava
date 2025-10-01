/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial edit = new Editorial("El nuevo s", "25 de mayo 596");
        Libro lib = new Libro("El gato en la caja", 1564815646, edit);
        Autor aut = new Autor("Maria Perez", "Uruguay");
        
        lib.setAutor(aut);
        System.out.print("El autor del libro "+lib.getTitulo()+" es: ");
        lib.getAutor();
        System.out.print("La editorial del libro "+lib.getTitulo()+" es: ");
        lib.getEditorial();
    }
    
}
