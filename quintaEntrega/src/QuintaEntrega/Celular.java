/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Celular {
    private int imei;
    private Usuario usuario;
    private String marca;
    private String modelo;
    private Bateria bateria;

    
    
    public Celular(int imei, String marca, String modelo, Bateria bateria){
        this.imei=imei;
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    public Usuario getUsuario(){
        return usuario;
    }

    public int getImei() {
        return imei;
    }
    
    public void getBateria(){
        System.out.println("La bateria es modelo: "+ bateria.getModelo()+" y la capacidad es de: "+ bateria.getCapacidad());
    }
}
