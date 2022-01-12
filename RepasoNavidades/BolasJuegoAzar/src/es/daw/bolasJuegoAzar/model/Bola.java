
package es.daw.bolasJuegoAzar.model;

import java.util.Random;

/**
 *Un juego de azar tiene  3  bolas . 
 * El funcionamiento de las bolas es el siguiente, 
 * al lanzarlas cada bola puede devolver un valor entre 0 y nueve 
 * y además en cada tirada  cada bola tiene un valor de la puntuación 
 * o premio que puede ser desde 0 a 100 puntos. 
 * @author natali
 */
public class Bola {
    
    private int numeroBola;
    private int puntuacion;
    
    
    public Bola(){
      //Random rd = new Random(300); //uso semilla para obtener el mismo resultado aleatorio
      Random rd = new Random();
      this.puntuacion= rd.nextInt(101);
      this.numeroBola= rd.nextInt(10);
    }
    
    // no voy a poner los setter, ya que no debería ser posible cambiar 
    // ni el número de la bola ni la puntuación
    public int getNumeroBola() {
        return numeroBola;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "Bola{" + "numeroBola=" + numeroBola + ", puntuacion=" + puntuacion + "}";
    }
    
    
    
    
    
}
