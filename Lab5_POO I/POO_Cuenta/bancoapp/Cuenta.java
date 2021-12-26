/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoapp;

/**
 *
 * @author melola
 */
public class Cuenta {
    
    //Atributos
    private String titular;
    private double cantidad;
    
    //Constructores
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        
        if (cantidad < 0) this.cantidad = 0;
        else this.cantidad = cantidad;
        
    }

    public Cuenta(String titular) {
        //primera forma
        //this.titular = titular;
        //this.cantidad = 0;
        
        //segunda forma
        this(titular,0);
    }
    
    public Cuenta(){
        //this("anónimo",0);
        this("anónimo",0);
    }
    
    // MÉTODOS GETTERS / SETTERS

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    // Métodos
    public void ingresar(double cantidad){
        if (cantidad > 0)
            this.cantidad += cantidad;
    }
    
    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0)
            this.cantidad = 0;
        else
            this.cantidad -= cantidad;
    }
    
}
