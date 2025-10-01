/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioD u1=new UsuarioD("Ariel Deb","arb@gmail.com");
        Documento d1=new Documento("El perro","lorem ipsum",124657165,"19/06/23");
        d1.setUsuarioD(u1);
        d1.mostrarFirma();
        d1.mostrarUsuario();
        
    }
    
}
