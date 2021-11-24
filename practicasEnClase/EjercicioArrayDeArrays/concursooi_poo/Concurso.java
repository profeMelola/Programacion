/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concursooi_poo;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class Concurso {
    
    private Concursante[] concursantesNivelBajo;
    private Concursante[] concursantesNivelMedio;
    private Concursante[] concursantesNivelAlto;
    
    String nombre; //No se puede cambiar por set
    
    public Concurso(String nombre){
        this.nombre=nombre;
        concursantesNivelBajo = null;
        concursantesNivelMedio = null;
        concursantesNivelAlto = null;
    }
    
    public void setConcursantesNivelBajo(Concursante[] concursantesNivelBajo){
        this.concursantesNivelBajo = concursantesNivelBajo;
    }

    public void setConcursantesNivelMedio(Concursante[] concursantesNivelMedio) {
        this.concursantesNivelMedio = concursantesNivelMedio;
    }

    public void setConcursantesNivelAlto(Concursante[] concursantesNivelAlto) {
        this.concursantesNivelAlto = concursantesNivelAlto;
    }

    // Todos los métodos getting
    public Concursante[] getConcursantesNivelBajo() {
        return concursantesNivelBajo;
    }

    public Concursante[] getConcursantesNivelMedio() {
        return concursantesNivelMedio;
    }

    public Concursante[] getConcursantesNivelAlto() {
        return concursantesNivelAlto;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public void mostrarNotasPorNivel (Concursante[] concursantes){
        String nivel = concursantes[0].getNivel(); //todos los concursantes tendrán el mismo nivel
        float[] notas = new float[concursantes.length];

        //Cargar en el array notas las notas de todos los concursantes
        for (var i = 0; i < concursantes.length; i++){
            Concursante concursante = concursantes[i];
            notas[i] = concursante.getNotaFinal();
            
        }
        //ordenar por defecto (ascendente)
        Arrays.sort(notas);
        System.out.println("Concursantes de nivel <"+nivel+"> ordenados por nota (ascendente):"+Arrays.toString(notas));
        
        ordenarPorNotasDesc(notas);
        System.out.println("Concursantes de nivel <"+nivel+"> ordenados por nota (descendente):"+Arrays.toString(notas));
        
    }

    public void obtenerMejorNota (Concursante[] concursantes){
        // Para un futuro... comparación y ordenación de objetos
        String nivel = concursantes[0].getNivel(); //todos los concursantes tendrán el mismo nivel
        float[] notas = new float[concursantes.length];

        //Cargar en el array notas las notas de todos los concursantes
        for (var i = 0; i < concursantes.length; i++){
            Concursante concursante = concursantes[i];
            notas[i] = concursante.getNotaFinal();
            
        }
        //ordenar por defecto (ascendente)
        Arrays.sort(notas);
        System.out.println("Mejor nota del nivel <"+nivel+"> :"+notas[notas.length - 1]);
        //ordenarPorNotasDesc(notas);
        //System.out.println("Mejor nota del nivel <"+nivel+"> :"+notas[0]);
        
        
    }
    
    /**
     * ordenarPorNotasDesc
     * @param notas
     */
    private void ordenarPorNotasDesc(float[] notas) {
        float[] aux = Arrays.copyOf(notas, notas.length);
        
        int i = 0;
        for (int j = aux.length - 1; j >= 0; j--) {
            notas[i] = aux[j];
            i++;
        }
        
    }    
    public void obtenerMejorConcursante (Concursante[] concursantes){
        // Para un futuro... comparación y ordenación de objetos
    }
    
}
