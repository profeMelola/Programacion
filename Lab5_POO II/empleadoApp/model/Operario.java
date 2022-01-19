package es.daw.empleadoApp.model;

/**
 *
 * @author melol
 */
public class Operario extends Empleado{

    //constructor con un parámetro
    public Operario(String nombre) {
        super(nombre);
    }

    //constructor por defecto
    public Operario() {
    }

    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
