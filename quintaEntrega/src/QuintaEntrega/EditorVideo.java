/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        Render rend = new Render(formato);
        rend.setProyecto(proyecto);
        System.out.println("Proyecto: "+rend.getProyectoNombre()+", duracion: "+rend.getProyectoDuracion()+"min, formato de video: "+rend.getFormato());    
    }
    
}
