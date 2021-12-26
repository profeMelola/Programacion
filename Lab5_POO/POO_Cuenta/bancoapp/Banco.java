/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoapp;

/**
 *
 * @author melola
 */
public class Banco {
    
    //atributos
    private String nombre;
    private int numClientes;
    private Cuenta[] cuentas;
    
    //constructores
    /*public Banco(){
        this("nodata",0,null);
    }*/
    
    public Banco(String nombre) {
        //this.nombre = nombre;
        this(nombre,0,null);
    }

    public Banco(String nombre, int numClientes) {
        // primera forma
        /*this.nombre = nombre;
        this.numClientes = numClientes;
        this.cuentas = null;*/

        // segunda forma
        this(nombre,numClientes,null);
        
        
    }

    public Banco(String nombre, int numClientes, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.numClientes = numClientes;
        this.cuentas = cuentas;
    }
    
    // Métodos Getters & Setters

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
    
    //Otros métodos

    @Override
    public String toString() {
        String cadena = "Banco{" + "nombre=" + nombre + ", numClientes=" + numClientes+", cuentas=\n";
        
        int contador = 1;
        for(Cuenta cuenta: cuentas){
            if (cuenta != null){
                cadena +=String.format(" CUENTA <%d>: %s%n",contador,cuenta.toString());
                contador++;
            }
        }  
        cadena += '}';
        return cadena;
    }
    
    
    
}
