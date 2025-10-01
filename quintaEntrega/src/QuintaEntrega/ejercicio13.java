/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioE13 usu1 = new UsuarioE13("Franco Bert", "francob@gmail.com"); 
        GeneradorQR gqr = new GeneradorQR();
        
        gqr.generar(168486.0, usu1);
        
    }
    
}
