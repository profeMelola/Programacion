/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.herencia1;

import es.daw.herencia1.model.*;
/**
 *
 * @author melola
 */
public class Herencia1App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo miVehiculo = new Vehiculo(1000,2);
        
        Coche coche = new Coche(40000,4,1500,"4512LMV");
        Coche coche2 = new Coche(40000,4,1500,"4512LMV");
        
        coche.setKm(1000);
        
        System.out.println("KM del coche:"+coche.getKm());
        
        coche.arrancar();
        
        Bicicleta bici = new Bicicleta();
        
        bici.arrancar();
        
        Coche cocheNull = null;
        
        System.out.println("Son iguales coche y coche2:"+(coche == coche2));
        System.out.println("Son iguales coche y coche2:"+coche.equals(coche2));
        System.out.println("Son iguales coche y coche:"+coche.equals(coche));
        System.out.println("Son iguales coche y bici:"+coche.equals(bici));
        System.out.println("Son iguales coche y null:"+coche.equals(cocheNull));
        
    }
    
}
