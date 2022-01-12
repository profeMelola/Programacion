package es.daw.bolasJuegoAzar.model;

import java.util.Arrays;

/**
 *
 * @author natali
 */
public class Ronda {

    private Tirada[] tiradas;
    private int puntuacion;

    public Ronda() {
        
        // En una ronda se hacen 3 tiradas
        tiradas = new Tirada[3];
        tiradas[0] = new Tirada();
        tiradas[1] = new Tirada();
        tiradas[2] = new Tirada();
        
        // Calcular la puntuación de cada ronda
        calcularPuntuacion();
        
    }
    
    public void calcularPuntuacion(){
        puntuacion = tiradas[0].getPuntuacion() + tiradas[1].getPuntuacion()
                +tiradas[2].getPuntuacion();
    }

    @Override
    public String toString() {
        return "\nPuntuación total de la ronda=" + puntuacion +"\nTIRADAS=" + Arrays.toString(tiradas);
    }
    
    

}
