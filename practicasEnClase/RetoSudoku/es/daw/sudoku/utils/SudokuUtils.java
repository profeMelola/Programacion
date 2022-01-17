package es.daw.sudoku.utils;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author melol
 */
public class SudokuUtils {
    
    public static final String RED = "\033[31m";
    public static final String RESET = "\u001B[0m";
    
    /**
     * Crear sector cambiando columnas
     * @param sector1
     * @return 
     */
    public static int[][] crearSectorCambiaCols(int[][] sector1, int dim) {
        int[][] sector2 = new int[dim][dim];

        
        for (int fila = 0; fila < dim; fila++) {
            if (dim == 3){
                sector2[fila][0] = sector1[fila][2];
                sector2[fila][1] = sector1[fila][0];
                sector2[fila][2] = sector1[fila][1];
            }else if (dim == 2){
                    sector2[fila][0] = sector1[fila][1];
                    sector2[fila][1] = sector1[fila][0];
            }

        }
        
        return sector2;

    }
    
    /**
     * 
     * @param sector1
     * @return 
     */
    public static int[][] crearSectorCambiaColsChungo(int[][] sector1, int dim) {
        int[][] sector2 = new int[dim][dim];

        for (int fila = 0; fila < dim; fila++) {
            for (int col = 0; col < dim; col++){
                if (fila < (dim - 1))
                    sector2[col][fila] = sector1[col][fila++];
                else
                    sector2[col][fila] = sector1[col][0];
            }
        }
        return sector2;

    }

    /**
     * Crear sector cambiando filas
     * @param sector1
     * @return 
     */
    public static int[][] crearSectorCambiaFilas(int[][] sector1, int dim) {
        //este es el nuevo sector a crear
        int[][] sector2 = new int[dim][dim];
        
        if (dim == 3){
            sector2[0] = sector1[2].clone();
            sector2[1] = sector1[0].clone();
            sector2[2] = sector1[1].clone();
        }else if (dim == 2){
            sector2[0] = sector1[1].clone();
            sector2[1] = sector1[0].clone();
        }

        return sector2;

    }
    
    /**
     * 
     * @param sector 
     */
    public static void pintaSector(int[][] sector){
        for (int i = 0; i < sector.length; i++)
            System.out.println(Arrays.toString(sector[i]));
        System.out.println("");
    }
    
    /**
     * 
     * @param tablero2D
     * @return 
     */
    public static int[][] copiarSudokuBidi(int[][] tablero2D){
        int[][] tablero2DCopia = new int[tablero2D.length][tablero2D[0].length];
        
        for(int i=0; i< tablero2D.length;i++){
            for(int j=0; j<tablero2D[i].length;j++){
                tablero2DCopia[i][j] = tablero2D[i][j];
            }
        }
        
        return tablero2DCopia;
        
    }
    
}
