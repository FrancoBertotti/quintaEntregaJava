/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente cont1 = new Contribuyente("Franco Bertotti", "60358469464");
        Impuesto imp = new Impuesto(90000.0);
        Calculadora calc = new Calculadora();
        imp.setContribuyente(cont1);
        calc.calcular(imp);
        
        
        
    }
    
}
