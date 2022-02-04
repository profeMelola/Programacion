package es.daw.seleccion.model;

public class Entrenador extends IntegranteSeleccion {

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Método propio
    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }

    //Sobrescribe método de la interface Seleccionable
    @Override
    public void entrenar() {
        System.out.println("Dirige un entrenamiento de la selección (Clase Entrenador)");

    }

    //Sobreescribe método de la superclase Participante
    @Override
    public void participar() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "id=" + getId() + ", nombre=" + getNombre() + ", apellidos=" + getApellidos() + ", edad=" + getEdad() + "idFederacion=" + idFederacion + '}';
    }

}
