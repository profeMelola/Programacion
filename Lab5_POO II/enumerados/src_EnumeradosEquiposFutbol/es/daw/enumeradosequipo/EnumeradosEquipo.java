/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.enumeradosequipo;

import es.daw.enumeradosequipo.enumerados.Demarcacion;
import es.daw.enumeradosequipo.enumerados.Equipo;
import es.daw.enumeradosequipo.model.Futbolista;

/**
 *
 * @author melol
 */
public class EnumeradosEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demarcacion delantero = Demarcacion.DELANTERO; //Instancia de un enum de la clase Demarcación
        delantero.name(); //Devuelve un String con el nombre de la constante (DELANTERO)
        delantero.toString(); //Devuelve un String con el nombre de la constante
        delantero.ordinal(); //Devuelve un entero con la posición del enum según está declarada

        delantero.compareTo(Demarcacion.DEFENSA); //compara el enum con el parámetro

        Demarcacion.values(); //Devuelve un array que contiene todos los enum

        // --------------------------------------------
        Demarcacion defensa = Demarcacion.DEFENSA;

        // Devuelve un String con el nombre de la constante
        System.out.println("delantero.name()= " + delantero.name());
        System.out.println("defensa.toString()= " + defensa.toString());

        //  Devuelve un entero con la posición de la constante según está declarada.
        System.out.println("delantero.ordinal()= " + delantero.ordinal());

        // Compara el enum con el parámetro según el orden en el que están declaradas las constantes. 
        System.out.println("delantero.compareTo(defensa)= " + delantero.compareTo(defensa));
        System.out.println("delantero.compareTo(delantero)= " + delantero.compareTo(delantero));

        // Recorre todas las constantes de la enumeración
        for (Demarcacion d : Demarcacion.values()) {
            System.out.println(d.toString() + " - ");
        }
        
        
        // ------------------------------
        Equipo villareal = Equipo.VILLAREAL;
        
        System.out.println("villareal.name()= "+villareal.name());
        System.out.println("nombre club: "+villareal.getNombreClub());
        System.out.println("puesto liga: "+villareal.getPuestoLiga());
        villareal.setPuestoLiga(99);
        System.out.println("puesto liga2: "+villareal.getPuestoLiga());
        
        // -------------------------
        Futbolista casillas = new Futbolista("Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
        Futbolista capdevila = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
        Futbolista iniesta = new Futbolista("Iniesta", 6, Demarcacion.CENTROCAMPISTA, Equipo.BARÇA);
        Futbolista navas = new Futbolista("Navas", 22, Demarcacion.DELANTERO, Equipo.SEVILLA); 
        
        System.out.println(casillas.toString());
        System.out.println(capdevila);
        System.out.println(iniesta);
        System.out.println(navas);
        
    }

}
