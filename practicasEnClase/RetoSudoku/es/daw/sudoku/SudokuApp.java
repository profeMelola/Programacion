/*
 * Implementar un sudoku clásico 9x9 en java:
 *
 * Se debe mostrar al usuario el sudoku.
 * El usuario debe ir diciendo la casilla y el número que quiere rellenar.
 * Debemos indicar al usuario si ha acertado con la solución.
*/

package es.daw.sudoku;

//import es.daw.sudoku.utils.*;
import es.daw.sudoku.model.*;

import java.util.Arrays;

/**
 *
 * @author melol
 */
public class SudokuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku(2); //número de sectores. Solo permito 2 o 3 sectores por fila
        sudoku.pintaInfo();
        sudoku.setNivel();
        sudoku.initPlay();
    }
    
}
