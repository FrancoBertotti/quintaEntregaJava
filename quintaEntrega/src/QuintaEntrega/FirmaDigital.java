/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class FirmaDigital {
    private int codigoHash;
    private String fecha;

    public FirmaDigital(int codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public int getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
}
