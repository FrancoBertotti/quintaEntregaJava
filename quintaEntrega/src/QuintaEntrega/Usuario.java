/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Usuario {
    private String nombre;
    private Celular celular;
    
    public Usuario(String nombre){
        this.nombre=nombre;
    }
    
    public void setCelular(Celular celular){
        this.celular=celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    public Celular getCelular(){
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

}
