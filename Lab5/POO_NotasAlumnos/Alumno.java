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
    
    //6 módulos por 4 notas cada módulo: 1 ev, 2 ev, 3 ev, final
    private int[][] notasModulos; 

    // CONSTRUCTORES
    public Alumno(){
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
        //this.notasModulos = new int[1][1];
        //notasModulos[0][0] = 0;
        this.notasModulos = null;
    }

    //obligatorio
    public Alumno(String nombre, String apellido1) {
        //this.nombre = nombre;
        //this.apellido1 = apellido1;
        this(nombre, apellido1, "");
    }

    public Alumno(String nombre, String apellido1, String apellido) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
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
    
    public void mostrarNotas(int modulo){
        System.out.println(Arrays.toString(notasModulos[modulo - 1]));
    }    
    
    /*public void ordenarNotas(int modulo){
        Arrays.sort(notasModulos[modulo - 1]);
    }*/
    
    public void mostrarNotasOrdenadas(int modulo){
        //int[] notas = notasModulos[modulo].clone();
        int[] notasAux = Arrays.copyOf(notasModulos[modulo-1],notasModulos[modulo-1].length - 1); //Mostrar notas ordenadas de las 3 evaluaciones
        
        Arrays.sort(notasAux);
        System.out.println(Arrays.toString(notasAux));
    }
    
    
    public void mostrarNotasModulo(int modulo){
        System.out.println(Arrays.toString(notasModulos[modulo - 1]));
    }
    
    public void calcularNotaFinal(){
        for (int i=0; i< notasModulos.length; i++){
            int sumaNotas = 0;
            for (int j=0; j < notasModulos[i].length - 1; j++){
                sumaNotas += notasModulos[i][j];
            }
            //La nota final será redondeada
            notasModulos[i][notasModulos[i].length - 1 ] = sumaNotas/ (notasModulos[i].length - 1 );
        }
        
    }
    
    public void calcularNotaFinal(int modulo){
        int sumaNotas = 0;
        for (int j=0; j < notasModulos[modulo - 1].length - 1; j++){
            sumaNotas += notasModulos[modulo - 1][j];
        }
        //La nota final será redondeada
        notasModulos[modulo -1][notasModulos[modulo-1].length - 1 ] = sumaNotas/ (notasModulos[modulo-1].length - 1 );
        
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + '}';
    }

    
    
    
}
