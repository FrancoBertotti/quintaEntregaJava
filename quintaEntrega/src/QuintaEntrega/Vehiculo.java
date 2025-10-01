/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor=conductor;
        if (conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    public void datosMotor(){
        System.out.println("Datos motor: \nNumero de Serie: "+motor.getNumeroSerie()+"\nTipo: "+motor.getTipo());
    }
        public void datosConductor(){
        System.out.println("Datos conductor: \nNombre: "+conductor.getNombre()+"\nLicencia: "+conductor.getLicencia());
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
}
