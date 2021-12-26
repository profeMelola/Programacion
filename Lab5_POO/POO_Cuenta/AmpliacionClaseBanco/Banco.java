/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaapp;

/**
 *
 * @author melola
 */
public class Banco {
    
    private String nombre;
    private int numClientes;
    private Cuenta[] cuentas;
    
    
    public Banco(String nombre){
        //this.nombre=nombre;
        this(nombre, 0, null);
    }
    
    public Banco(String nombre, int numClientes){
        //this.nombre=nombre;
        //this.numClientes=numClientes;
        this(nombre, numClientes, null);
    }

    public Banco(String nombre, int numClientes, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.numClientes = numClientes;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", numClientes=" + numClientes + '}';
    }
    
}
