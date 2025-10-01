/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("Aprendiendo Java", 12.35);
        EditorVideo ed = new EditorVideo();
        
        ed.exportar("mp4", p1);
    }
    
}
