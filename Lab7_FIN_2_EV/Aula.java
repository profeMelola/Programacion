package es.daw.comparadores.model.objetos;

import java.util.ArrayList;

/**
 *
 * @author melola
 */
public class Aula {

    private String curso, siglas, grado, centro;
    private ArrayList<Alumno> listaAlumnos;

    public Aula(String curso, String siglas, String grado, String centro) {
        this.curso = curso;
        this.siglas = siglas;
        this.grado = grado;
        this.centro = centro;
        this.listaAlumnos = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public String getSiglas() {
        return siglas;
    }

    public String getGrado() {
        return grado;
    }

    public String getCentro() {
        return centro;
    }

    // COSAS A TENER EN CUENTA CUANDO UTILIZO COLECCIONES....
    public void setListaAlumnos(ArrayList<Alumno> listaAlumnosOriginal) {
        // Para que no sea el mismo arraylist por referencia....
        ArrayList<Alumno> listaAlumnos = (ArrayList<Alumno>) listaAlumnosOriginal.clone();
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        // Devuelvo una copia arraylist para que no sea el mismo arraylist por referencia
        ArrayList<Alumno> listaAlumnosCopia = (ArrayList<Alumno>) listaAlumnos.clone();
        return listaAlumnosCopia;
    }
    
    public void addAlumno(Alumno a){
        listaAlumnos.add(a);
    }
    /*
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    */
}
