package es.daw.comparadores.dao;

import java.util.ArrayList;
import es.daw.comparadores.model.objetos.Alumno;

/**
 *
 * @author melola
 */
public class AlumnoDAO{

    //---------------------------------------------------------------
    //Se mantiene como variable global, simulando una base de datos
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    // --------------------------------------------------------------
    
    public AlumnoDAO(){
        //Cargo los datos como si fuera una base de datos donde se ha volcado la información
        listaAlumnos.add(new Alumno("Natalia", "Grandes", "Antonio", "9999987Y", 28));
        listaAlumnos.add(new Alumno("Otro", "Antón", "Berlín", "99995687Y", 18));
        listaAlumnos.add(new Alumno("As", "Barcelona", "Cáceres", "19995687Y", 5));
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Alumno> select() {
        return (ArrayList<Alumno>) listaAlumnos.clone();
    }

}
