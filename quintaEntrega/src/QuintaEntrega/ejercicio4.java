/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco b1 = new Banco("Santander", 216746894);
        TarjetaDeCredito tarj = new TarjetaDeCredito(16584456,"12/2035");
        Cliente c1 = new Cliente("Pablo Card", 39656489);
        
        tarj.setBanco(b1);
        tarj.getBanco();
        tarj.setCliente(c1);
        tarj.datosCliente();
    }
    
}
