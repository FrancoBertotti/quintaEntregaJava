/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class CodigoQR {
    private double valor;
    private UsuarioE13 usuario;

    public CodigoQR(double valor) {
        this.valor = valor;
    }

    public void setUsuario(UsuarioE13 usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public String getUsuarioNombre() {
        return usuario.getNombre();
    }
   
    public String getUsuarioEmail() {
        return usuario.getEmail();
    }
    
}
