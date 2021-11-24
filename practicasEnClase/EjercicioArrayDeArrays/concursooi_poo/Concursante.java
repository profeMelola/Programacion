/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concursooi_poo;

/**
 *
 * @author melola
 */
public class Concursante {
    
    String nivel;
    String nombre;
    float notaFinal;
    
    public Concursante(String nivel, String nombre){
        this.nivel = nivel;
        this.nombre = nombre;
        this.notaFinal = 0; //por defecto
    }
    
    public void setNotaFinal(float notaFinal){
        this.notaFinal = notaFinal;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Concursante{" + "nivel=" + nivel + ", nombre=" + nombre + ", notaFinal=" + notaFinal + '}';
    }
    
    
}
