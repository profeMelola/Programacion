package es.daw.seleccion.model;

/**
 *
 * @author melol
 */
public class IntegranteSeleccion extends Participante implements Seleccionable {

    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);

    }

    //MÉTODOS A IMPLEMENTAR PORQUE SON DE LA INTERFACE SELECCIONABLE
    public void concentrarse() {
        System.out.println("Concentrarse (Clase Padre)");
    }

    public void viajar() {
        System.out.println("Viajar (Clase Padre)");
    }

    public void entrenar() {
        System.out.println("Entrenar (Clase Padre)");
    }

}
