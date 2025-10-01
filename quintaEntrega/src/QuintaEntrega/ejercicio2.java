/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Alan Ge");
        Bateria b1 = new Bateria("x48135", 6000);
        Celular c1 = new Celular(15348487, "samsung", "a45", b1);
        
        System.out.println("Usuario del numero "+c1.getImei()+" es: "+c1.getUsuario());
        System.out.println("Numero del usuario "+u1.getNombre()+" es: "+u1.getCelular());
        System.out.println("");
        u1.setCelular(c1);
        System.out.println("Usuario del numero "+c1.getImei()+" es: "+c1.getUsuario().getNombre());
        System.out.println("Numero del usuario "+u1.getNombre()+" es: "+u1.getCelular().getImei());
        System.out.println("El celular  "+c1.getImei()+" es: ");
        c1.getBateria();

    }
    
}
