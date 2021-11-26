/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_concesionario;

/**
 *
 * @author melola
 */
public class Concesionario {
    
    //ATRIBUTOS
    private String identificador;
    private String nombre;
    private String localidad;
    private int telefono;
    private String contacto;
    static String convenio = "Carglass";
    
    //CONSTRUCTORES

    public Concesionario(String identificador, String nombre, String localidad, int telefono, String contacto) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.localidad = localidad;
        this.telefono = telefono;
        this.contacto = contacto;
    }
    
    //GETTERS & SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "identificador=" + identificador + ", nombre=" + nombre + ", localidad=" + localidad + ", telefono=" + telefono + ", contacto=" + contacto + '}';
    }
    
    
    
}
