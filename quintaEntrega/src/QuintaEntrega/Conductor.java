/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo=vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
            public void datosVehiculo(){
        System.out.println("Datos vehiculo: \nPatente: "+vehiculo.getPatente()+"\nModelo: "+vehiculo.getModelo());
    }
    
    
}
