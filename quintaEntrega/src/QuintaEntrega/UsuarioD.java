/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class UsuarioD {
    private String nombre;
    private String email;

    public UsuarioD(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    public String datosNombre(){
        return nombre;
    }
    public String datosEmail(){
        return email;
    }
}
