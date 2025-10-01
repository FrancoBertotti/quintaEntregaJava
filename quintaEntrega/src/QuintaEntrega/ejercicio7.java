/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m1 = new Motor("2.0 16v","KI456798EWRGT548080");
        Vehiculo v1 = new Vehiculo("AE 286 RF","Ford Focus");
        Conductor c1= new Conductor("Florencia Ber", "AR598747GT");
        
        v1.setMotor(m1);
        c1.setVehiculo(v1);
        v1.datosMotor();
        v1.datosConductor();
        c1.datosVehiculo();
    }
    
}
