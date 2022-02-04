package es.daw.seleccion.model;

public class Futbolista extends IntegranteSeleccion {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    //Método propio
    public void entrevista() {
        System.out.println("Da una Entrevista");
    }
    
    //Sobreescribe método de la interface Seleccionable
    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento con la selección(Clase Futbolista)");
    }

    //Sobreescribe método de la superclase participante
    @Override
    public void participar() {
        System.out.println("Juega un Partido (Clase Futbolista)");
    }


    @Override
    public String toString() {
        return "Futbolista{" + "id=" + getId() + ", nombre=" + getNombre() + ", apellidos=" + getApellidos() + ", edad=" + getEdad() + ", edad=" + getEdad() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
