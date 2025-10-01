/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Reproductor rep = new Reproductor();
        Cancion can1 = new Cancion("Zafar");
        Artista art1= new Artista("La vela puerca", "Rock");
        
        can1.setArtista(art1);
        rep.reproducir(can1); 
    }
    
}
