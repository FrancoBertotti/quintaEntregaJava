/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    private UsuarioD usuarioD;

    public Documento(String titulo, String contenido, int hash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(hash, fecha);
    }
    
    public void mostrarFirma(){
        System.out.println("La firma digital es: "+firmaDigital.getCodigoHash()+" codigo hash, y su fecha es: "+firmaDigital.getFecha());
    
    }

    public void setUsuarioD(UsuarioD usuarioD) {
        this.usuarioD = usuarioD;
    }
    public void mostrarUsuario(){
        System.out.println("El usuario del documento "+this.titulo+" es: "+usuarioD.datosNombre()+" "+usuarioD.datosEmail());
    }
    
    
}
