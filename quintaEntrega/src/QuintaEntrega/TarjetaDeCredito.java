/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaEntrega;

/**
 *
 * @author Franco
 */
public class TarjetaDeCredito {
    private String fechaVencimiento;
    private int numero;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(int numero,String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        this.numero = numero;
    }
    
    public void getBanco(){
        System.out.println("Datos banco: \n Nombre: "+banco.getNombre()+"\n CUIT: "+ banco.getCuit());
    
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
        public void setCliente(Cliente cliente){
        this.cliente=cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);}
        }
        
    public void datosCliente(){
        System.out.println("Cliente: "+cliente.getNombre()+"\nDNI: "+cliente.getDni());
    
    }
}
