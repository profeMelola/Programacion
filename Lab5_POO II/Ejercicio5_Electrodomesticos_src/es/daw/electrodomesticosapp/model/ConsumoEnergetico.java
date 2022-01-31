/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package es.daw.electrodomesticosapp.model;

/**
 *
 * @author melol
 */
public enum ConsumoEnergetico {
    A(100),B(80),C(60),D(50),E(30),F(10);
    
    private int precio;

    private ConsumoEnergetico(int precio){
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }
    
    
}
