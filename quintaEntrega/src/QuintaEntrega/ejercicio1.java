
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular t1 = new Titular("Adrian Ca", 18645135);
        Pasaporte p1 = new Pasaporte("AF4568F5", "15/12/20", "blanca", "png");
        
        System.out.println(t1);
        //t1.setPasaporte(p1);
        System.out.println(p1);
        t1.setPasaporte(p1);
        System.out.println("");
        System.out.println(t1.getPasaporte());
        System.out.println(p1);
        t1.numeroPasaporte();
    }
    
}
