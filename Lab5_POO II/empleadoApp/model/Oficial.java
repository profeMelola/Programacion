/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.empleadoApp.model;

/**
 *
 * @author melol
 */
public class Oficial extends Operario {

    public Oficial() {
    }

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }

}
