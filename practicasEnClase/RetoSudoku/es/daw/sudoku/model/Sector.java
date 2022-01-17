package es.daw.sudoku.model;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author melol
 */
public class Sector {
    private int[][] sector;
    private int dim;
    private int dimTotal;
    
    public Sector(int dim, int dimTotal){
        this.dim = dim;
        this.dimTotal = dimTotal;
        this.sector = generarSectorAleatorio();
    }

    public int[][] getSector() {
        return sector;
    }

    public void setSector(int[][] sector) {
        this.sector = sector;
    }
    
    
    public int[][] generarSectorAleatorio(){
        int[][] sector = new int[dim][dim];
        
        //Creo array para guardar los números del 1 a dim*2
        int[] numeros = new int[dimTotal];
        
        //cargo el array con los valores de orden: del 1 a dim*2
        for (int i=0; i < numeros.length; i++) numeros[i] = i+1;
        
        //Genero entero aleatorio entre 1 y dim*2
        Random rd = new Random();
        int aleatorio = rd.nextInt(dimTotal+1)+1;
        
        //bucle
        int contador = 0;
        int fila = 0;
        int col = 0;
        while(contador  < numeros.length){
            //busco si el aleatorio está en el array de alumnos
            int indice = Arrays.binarySearch(numeros, aleatorio);
            
            //si lo encuentra
            if (indice > 0 ){
                //quito esa posición del array de alumnos poniéndolo a 0
                numeros[indice] = 0;
                
                if (col == dim){
                    col = 0;
                    fila++;
                }
                
                sector[fila][col] = aleatorio;
                col++;
                contador++;
            }
            
            //ordeno el array de posiciones de los números para buscar el número mayor
            Arrays.sort(numeros);
            
            //genero el número aleatorio en base al número mayor
            if (numeros[numeros.length-1] > 0)
                aleatorio = rd.nextInt(numeros[numeros.length-1])+1;
        }
        
        return sector;
        
    }
    
    /**
     * pintaSector
     * @return 
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sector.length; i++)
            sb.append(Arrays.toString(sector[i]));
        
        return "Sector{" + "sector=" + sb.toString() + '}';
    }
    
    
   
 
}
