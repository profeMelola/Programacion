/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.herencia1.model;

/**
 *
 * @author melola
 */
public class Bicicleta extends Vehiculo{
    
    private boolean montaña;

    public Bicicleta(int km, int ruedas, boolean montaña){
        super(km,ruedas);
        this.montaña = montaña;
    }
    
    public Bicicleta(boolean montaña){
        super(0,2);
        this.montaña = montaña;
    }
    
    public Bicicleta(){
        super(1000,2);
        this.montaña = true;
    }
    
    public boolean isMontaña() {
        return montaña;
    }

    public void setMontaña(boolean montaña) {
        this.montaña = montaña;
    }
    
    // OTRO MÉTODOS. COMPORTAMIENTO
    @Override
    public void arrancar(){
      System.out.println("Bici arrancado...");
    }     
    
}
