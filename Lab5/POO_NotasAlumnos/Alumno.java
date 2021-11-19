/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnosnotas_poo;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class Alumno {
    private String nombre;
    private String apellido1,apellido2;
    private int[][] notasModulos;

    // CONSTRUCTORES
    public Alumno(){
        this.nombre = "nadie";
        this.apellido1 = "";
        this.apellido2 = "";
        this.notasModulos = new int[1][1];
        notasModulos[0][0] = 0;
    }

    public Alumno(String nombre, String apellido1) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    public Alumno(String nombre, String apellido1, String apellido) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    public Alumno(String nombre, String apellido1, int[][] notasModulos) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.notasModulos = notasModulos.clone();
    }    
    
    // GETTERS AND SETTERS DE LOS ATRIBUTOS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int[][] getNotasModulos() {
        return notasModulos;
    }

    public void setNotasModulos(int[][] notasModulos) {
        this.notasModulos = notasModulos.clone();
    }

    
    public void mostrarNotas(){
        for (int i=0; i< notasModulos.length; i++){
            System.out.println(Arrays.toString(notasModulos[i]));
        }
    }
    
    public void ordenarNotas(int modulo){
        Arrays.sort(notasModulos[modulo]);
    }
    
    public void mostrarNotasModulo(int modulo){
        System.out.println(Arrays.toString(notasModulos[modulo]));
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + '}';
    }

    
    
    
}
