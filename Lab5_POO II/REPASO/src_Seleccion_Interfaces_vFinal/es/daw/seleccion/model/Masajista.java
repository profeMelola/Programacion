package es.daw.seleccion.model;

public class Masajista extends IntegranteSeleccion {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //Método propio
    public void darMasaje() {
        System.out.println("Da un Masaje");
    }

    // Sobreescribe método de la interface Seleccionable
    @Override
    public void entrenar() {
        System.out.println("Da asistencia a la selección (Clase Masajista)");
    }
    
    //Sobreescribe método de la superclase participante
    @Override
    public void participar() {
        System.out.println("Da asistencia médica (Clase Masajista)");
    }
    
    @Override
    public String toString() {
        return "Masajista{" + "id=" + getId() + ", nombre=" + getNombre() + ", apellidos=" + getApellidos() + ", edad=" + getEdad() + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }

}
