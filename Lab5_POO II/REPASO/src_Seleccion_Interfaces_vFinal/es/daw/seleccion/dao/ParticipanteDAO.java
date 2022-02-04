/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.seleccion.dao;

import es.daw.seleccion.model.Futbolista;
import es.daw.seleccion.model.Participante;
import es.daw.seleccion.model.Masajista;
import es.daw.seleccion.model.Entrenador;
import java.util.ArrayList;

/**
 *
 * @author melol
 */
public class ParticipanteDAO {
    
    public static ArrayList<Participante> participantes = new ArrayList<Participante>();

    public static ArrayList<Participante> select(){

        participantes.add(new Entrenador(1, "Vicente2", "Del Bosque2", 60, 28489));
        participantes.add(new Futbolista(2, "Andres2", "Iniesta2", 29, 6, "Interior Derecho"));
        participantes.add(new Masajista(3, "Raúl2", "Martinez2", 41, "Licenciado en Fisioterapia", 18));

        return participantes;

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
