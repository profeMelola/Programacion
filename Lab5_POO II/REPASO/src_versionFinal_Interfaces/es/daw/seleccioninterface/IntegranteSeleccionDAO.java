/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.seleccioninterface;

import es.daw.seleccioninterface.model.Entrenador;
import es.daw.seleccioninterface.model.Futbolista;
import es.daw.seleccioninterface.model.IntegranteSeleccion;
import es.daw.seleccioninterface.model.Masajista;
import java.util.ArrayList;

/**
 *
 * @author melol
 */
public class IntegranteSeleccionDAO {
    
    public static ArrayList<IntegranteSeleccion> integrantes = new ArrayList<IntegranteSeleccion>();

    public static ArrayList<IntegranteSeleccion> get() {

        integrantes.add(new Entrenador(1, "Vicente", "Del Bosque", 60, 28489));
        integrantes.add(new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho"));
        integrantes.add(new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18));

        return integrantes;
        
    }    
}
