
package es.daw.empleadoApp.model;

import java.util.Objects;

/**
 *
 * @author melol
 */
public class Empleado {
    private String nombre;

    //constructor por defecto
    public Empleado() {
    }

    //constructor con un parámetro
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }



    
    
    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado                                
    @Override
    public String toString() {
        return "Empleado " + nombre;    
    }
}
