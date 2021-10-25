package notasalumnobidimensional;

/**
 *
 * @author melola
 */
public class UtilidadesArray {
    
    /**
     * pintaArray: Este método pinta por consola cada celda de la matriz
     * @param miArray 
     */
    protected static void pintaArray(double[][] miArray){
        
        System.out.println(" * Valores del array:");
        //recorre cada fila
        for ( int i=0; i < miArray.length ; i++){
            //recorre cada columna
            for ( int j=0; j<miArray[i].length; j++){
                System.out.print( miArray[i][j] +" ");
            }
            System.out.println("\n");
        }
    }
    
}
