/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.seleccion.dao;

import es.daw.seleccion.model.Entrenador;
import es.daw.seleccion.model.Futbolista;
import es.daw.seleccion.model.IntegranteSeleccion;
import es.daw.seleccion.model.Masajista;
import java.util.ArrayList;

/**
 *
 * @author melol
 */
public class IntegranteSeleccionDAO {
    
    public static ArrayList<IntegranteSeleccion> integrantes = new ArrayList<IntegranteSeleccion>();

    public static ArrayList<IntegranteSeleccion> select() {

        integrantes.add(new Entrenador(1, "Vicente", "Del Bosque", 60, 28489));
        integrantes.add(new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho"));
        integrantes.add(new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18));

        return integrantes;
        
    }  
    
    /*
    public static Participante select(String id){
    }
    
    public static void insert(Participante p){
    }
    
    public static void update(Participante p){
        
    }
    */    
}
