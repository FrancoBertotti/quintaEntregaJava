/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class GeneradorQR {
    //private UsuarioE13 usuario;
    //private CodigoQR qr;
    
    
    public void generar(double valor, UsuarioE13 usuario) {
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario);
        System.out.println("QR valor: $"+qr.getValor()+", Usuario: "+qr.getUsuarioNombre()+" email: "+qr.getUsuarioEmail());
        
    }
}
