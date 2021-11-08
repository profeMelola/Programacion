package puzzle;

/**
 *
 * @author melola
 */
public class Puzzle {

    /*public static int posicionColumna = 0;
    public static int posicionFila1 = 0;
    public static int posicionFila2 = 0;*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // array bidimensional de 5x5 
        String[] palabras = { "AEREO","CLAVE","FINCA","GALLO","GARRA"};
        
        char[][] puzzleOriginal;
        char[][] puzzleModificado;
        
        /*
         * Posiciones especificadas por el usuario para recolocar el puzzle.
         * Array para guardar en:
         * [0]: posición columna
         * [1]: posición primera fila
         * [2]: posición segunda fila
         *
        */
        int posiciones[];
        
        // 1. Cargar el puzzle original
        puzzleOriginal = Metodos.devuelveTabla(palabras);
        
        // 2. Cargar el puzzle modificado
        puzzleModificado = Metodos.devuelveTablaModifica(puzzleOriginal);
        
        // 3. Mostrar puzzles (original y modificado)
        mostrarPuzzles(puzzleOriginal,puzzleModificado);
        
        // 4. Pedir al usuario las posiciones a cambiar
        int contador = 0;
        do{
            
            // 4.1 PEDIR LAS POSICIONES
            posiciones = Metodos.pedirPosiciones(puzzleModificado[0].length, puzzleModificado.length );
            
            // 4.2 INTERCAMBIAR LAS POSICIONES
            Metodos.intercambiaPosiciones(puzzleModificado,posiciones[0],posiciones[1],posiciones[2]);
                    
            // 4.3 MOSTRAR LOS PUZZLES
            mostrarPuzzles(puzzleOriginal,puzzleModificado);
            
            contador++;
            
        } while( !Metodos.compararTablas(puzzleOriginal,puzzleModificado));
        
        //cuando el puzle modificado es igual al original
        System.out.println("FELICIDADES MAJO!!! HAS GANADO EN "+contador+" INTENTOS!!!");
        
        
    }
    
    public static void mostrarPuzzles(char[][] puzzleOriginal, char[][] puzzleModificado){
        System.out.println("*****************************");
        System.out.println("* PUZZLE ORIGINAL *");
        Metodos.mostrarTabla(puzzleOriginal);
        System.out.println("*****************************");
        System.out.println("* PUZZLE MODIFICADO *");
        Metodos.mostrarTabla(puzzleModificado);
        System.out.println("*****************************");            
    }
    
}
