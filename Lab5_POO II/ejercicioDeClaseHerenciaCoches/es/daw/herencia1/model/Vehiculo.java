/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.herencia1.model;

/**
 *
 * @author melola
 */
public class Vehiculo {
   
   // ATRIBUTOS O PROPIEDADES
   private int km;
   private int ruedas;
 
   // CONSTRUCTORES
   public Vehiculo(int km, int ruedas){
       this.km = km;
       this.ruedas = ruedas;
   }
   
   // SETTERS & GETTERS
   public int getKm(){
      return km;
   }
 
   public void setKm(int km){
      this.km = km;
   }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    // OTRO MÉTODOS. COMPORTAMIENTO
    protected void arrancar(){
      System.out.println("Vehiculo arrancado... ahora te digo el tipo");
    }    
    
}
