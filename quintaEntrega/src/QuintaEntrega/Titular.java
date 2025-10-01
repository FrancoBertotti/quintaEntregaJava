
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    public void numeroPasaporte(){
        System.out.println("El numero de pasaporte es: "+pasaporte.getNumero());
    }
    
}
