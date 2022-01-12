package es.daw.bolasJuegoAzar.model;

import java.util.Arrays;

/**
 * Se lanzan las tres bolas, anotando el resultado de la suma de las
 * puntuaciones cada una, y además y se comprobará :
 *
 * Si sale dos veces la misma bola (por ejemplo tirada = 4 4 0 ) multiplica el
 * valor de premio x 2. Si sale tres veces la misma bola (por ejemplo tirada = 4
 * 4 4) anota el valor del premio x3.
 *
 */
public class Tirada {

    private int puntuacion;
    private Bola[] bolas;

    /**
     * En el constructor tenemos que crear la tirada que necesita tres
     * instancias de Bola
     */
    public Tirada() {
        bolas = new Bola[3];
        bolas[0] = new Bola();
        bolas[1] = new Bola();
        bolas[2] = new Bola();
        calcularPuntuacion();

    }

    private void calcularPuntuacion() {
        int premio = 1;
        
        // comprobar si bola.getNumeroBola()  de la primera bola  es igual al de la segunda bola
        if (bolas[0].getNumeroBola() == bolas[1].getNumeroBola()) {
            premio += 1;
            // ahora compruebo si tb es igual a la tercera bola
            if (bolas[1].getNumeroBola() == bolas[2].getNumeroBola()) {
                // las tres soniguales;
                premio += 1;
            }
        } else if (bolas[0].getNumeroBola() == bolas[2].getNumeroBola()
                || bolas[1].getNumeroBola() == bolas[2].getNumeroBola()) {
            premio += 1;
        }
        
        puntuacion = (bolas[0].getPuntuacion() + bolas[1].getPuntuacion() + bolas[2].getPuntuacion()) * premio;

    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "\nTirada{ puntuacion de la tirada =" + puntuacion + ", bolas de la tirada=" + Arrays.toString(bolas) + "}\n";
    }

}
