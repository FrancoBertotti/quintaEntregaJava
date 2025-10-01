
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String foto, String format){
        this.numero=numero;
        this.fechaEmision=fechaEmision;
        this.foto = new Foto(foto,format);
    }

    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
    public Titular getTitular(){
    return titular;
    }

    public String getNumero() {
        return numero;
    }
    
    
}
