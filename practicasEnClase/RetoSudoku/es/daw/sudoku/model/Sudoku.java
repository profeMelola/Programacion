package es.daw.sudoku.model;

import es.daw.sudoku.utils.SudokuUtils;
import java.util.Arrays;
import es.daw.utils.AleatoriosUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author melol
 */
public class Sudoku {
    
    private final int DIM; //filas y columnas del sector
    private final int DIM_TOTAL; //número filas y columnas del tablero completo
    
    // Tableros
    int tablero[][][][]; //tablero de 4 dimensiones creado aleatoriamente
    int tablero2D[][]; //tablero convertido a 2 dimensiones. Usado para comparar soluciones
    int tableroJugable2D[][]; //tablero con las celdas vacías para poder jugar
    int tableroJugable2DCopia[][]; //copia del tablero jugable para controlar que el usuario eliga la celda adecuada
    
    private int nivelSudoku = 0;
    private int numIntentos = 0;
    private int contadorIntentos = 0;

    // Constructor
    public Sudoku(int dimension) {
        
        this.DIM = dimension;
        DIM_TOTAL = (int)Math.pow(DIM,2);
        
        // Inicializo tableros
        tablero = new int[DIM][DIM][DIM][DIM]; 
        tablero2D = new int[DIM_TOTAL][DIM_TOTAL]; 
        tableroJugable2D = new int[DIM_TOTAL][DIM_TOTAL]; 
        tableroJugable2DCopia = new int[DIM_TOTAL][DIM_TOTAL]; 
                
        // Crear tablero original
        crearTablero();
        
        //Crear tablero bidimensional para jugar (con celdas borradas)
        crearTableroJugable(); 

    }
    
    /**
     * Método para crear el tablero completo siguiendo las reglas de un sudoku
     * 
     */
    private void crearTablero() {
        
        // falta hacer que el primer sector tenga orden aleatorio
        //int sector[][] = {{1, 5, 9}, {2, 7, 4}, {3, 8, 6}};
        Sector sectorObj = new Sector(DIM,DIM_TOTAL); // Al crear sectorObj ya tengo el primer sector con los números aleatorios
        tablero[0][0] = sectorObj.getSector();
        
        for (int a = 0; a < DIM; a++) {
            //System.out.println("***************************************");
            //System.out.println("FILA :"+a);
            //if (a == 0)
            //    SudokuUtils.pintaSector( tablero[0][0]);
            /* para la primera fila en DIM0, ya hemos creado el sector de forma aleatoria, por eso no lo volvemos a crear
            Para el resto de filas, si hace falta crearlo utilizando el patrón del primer sector*/
            if (a != 0) {
                tablero[a][0] = SudokuUtils.crearSectorCambiaCols(tablero[a - 1][0],DIM);
                //SudokuUtils.pintaSector( tablero[a][0]);
            }
            // creamos la DIM1, para cada una de las filas DIM0, creamos los otros dos sectores
            for (int i = 1; i < DIM; i++) {
                tablero[a][i] = SudokuUtils.crearSectorCambiaFilas(tablero[a][i - 1],DIM);
                //SudokuUtils.pintaSector( tablero[a][i]);

            }
            //System.out.println("***************************************");
        }
    }
    
    /**
     * Método que crea el tablero jugable (con celdas vacías)
     */
    private void crearTableroJugable(){
        // convertir en array bidimensional
        convertTablero4D_2_2D();
        
        System.out.println("* SUDOKU ORIGINAL:");
        pintarTablero(tablero2D,true);
        
        // hay que hacer una copia de tablero
        //tableroJugable2D = tablero2D.clone(); // NO ME ESTÁ FUNCIONANDO EL CLONE!!!!!
        //tableroJugable2D[0][0]=666;

        tableroJugable2D = SudokuUtils.copiarSudokuBidi(tablero2D);
        
        // borrar las celdas correspondientes
        ocultarCeldasTablero();
        
        //Copia del tablero limpio original
        tableroJugable2DCopia = SudokuUtils.copiarSudokuBidi(tableroJugable2D);

        System.out.println("");
        System.out.println("* SUDOKU PARA JUGAR:");
        pintarTablero(tableroJugable2D,true);  
    }    
    
    /**
     * convertTablero4D_2_2D 
     * Convierte el tablero de 4 dimensiones en un tablero de 2 dimensiones más fácil de manejar
     */
    private void convertTablero4D_2_2D(){
        int row = 0;
        int col = 0;
        int colTotal = 0;
        int rowTotal = 0;
        
        for (int dim0=0; dim0 < tablero.length; dim0++){
            for (int dim1=0; dim1 < tablero[dim0].length; dim1++){
                row = rowTotal;
                for (int dim2=0; dim2 < tablero[dim0][dim1].length; dim2++){
                    col = colTotal;
                    for (int dim3=0; dim3 < tablero[dim0][dim1][dim2].length; dim3++){
                        /*System.out.println("*************************");
                        System.out.println("col: "+col);
                        System.out.println("row: "+row);
                        System.out.println("colTotal: "+colTotal);
                        System.out.println("rowTotal: "+rowTotal);
                        System.out.println("valor: "+tablero[dim0][dim1][dim2][dim3]);
                        System.out.println("*************************");*/
                        tablero2D[row][col]=tablero[dim0][dim1][dim2][dim3];
                        col++;
                    }
                    row++;
                }
                if (colTotal == DIM_TOTAL)
                    colTotal = 0;
                else
                    colTotal += DIM;
            }
            rowTotal+=DIM;
            colTotal = 0;
        }
        
    }    
    
    /**
     * PintarTablero: devuelve una cadena de texto que representa el tablero de sudoku, para después mostarlo por pantall
     * @param tablero bidimensional
     * @return 
     */
    private String pintarTablero(int tablero[][]) {
        StringBuilder dibujoTablero = new StringBuilder();
        for (int dim0 = 0; dim0 < tablero.length; dim0++) {
            for (int dim1 = 0; dim1 < tablero[0].length; dim1++) {
                dibujoTablero = dibujoTablero.append(" ");
                dibujoTablero = dibujoTablero.append(tablero[dim0][dim1]);
                dibujoTablero = dibujoTablero.append(" ");
            }
            dibujoTablero = dibujoTablero.append("\n");
        }
        return dibujoTablero.toString();
    }    

    /**
     * pintarTablero: muestra directamente el tablero en pantalla
     * @param tablero
     * @param console 
     */
    private void pintarTablero(int tablero[][], boolean console) {
        
        // Pintar lal cabecera
        if (DIM == 3){
            System.out.println("\n\t[ 0 ][ 1 ][ 2 ]  [ 3 ][ 4 ][ 5 ]  [ 6 ][ 7 ][ 8 ]");
            //System.out.println("\t_________________________________________________");
        }
        else if (DIM == 2){
            System.out.println("\t[ 0 ][ 1 ]  [ 2 ][ 3 ]");
            //System.out.println("\t______________________");
            
        }
        pintaValoresTablero(tablero);
        System.out.println("\n");
    }    
        
    /*
     Pinta las celdas
    */
    private void pintaValoresTablero(int tablero[][]){
        for (int dim0 = 0; dim0 < tablero.length; dim0++) {
            System.out.printf("\n[%d]\t",dim0);
            for (int dim1 = 0; dim1 < tablero[0].length; dim1++) {
                //if (tablero[dim0][dim1] == 0) System.out.print(SudokuUtils.RED+"[ "+tablero[dim0][dim1]+" ]"+SudokuUtils.RESET); else 
                System.out.print("[ "+tablero[dim0][dim1]+" ]");
                if ( (dim1+1) % DIM == 0) System.out.print("  ");
            }
        }
        
    }
    
    /**
     * Método par acultar celdas en el tablero y crear el tableroJugable de 2 dimensiones
     */
    private void ocultarCeldasTablero(){
        int col_init = 0;
        int col_end = tableroJugable2D.length;
       
        // Primero se marca a 0 la diagonal. Un 0 es una celda vacía
        for (int i = 0; i < tableroJugable2D.length; i++){
            tableroJugable2D[i][col_init] = 0;
            tableroJugable2D[i][col_end - 1] = 0;
            col_init++;
            col_end--;
        }

        // Por ahora solo tengo controlado que sea de dos o tres dimensiones
        if (DIM==3){
            /*
             * Segundo: en los cuatros sectores restantes borrar solo 1 celda. Mirad GitHub
             * Serían:
             * columnas 3,4,5 de filas 0,1,2 y 6,7,8
             * columnas 0,1,2 y 6,7,8 de fila 3,4,5,
             */
            int col1 = AleatoriosUtil.aleatorioEnteroEnRango(0, 2);
            int col2 = AleatoriosUtil.aleatorioEnteroEnRango(3, 5);
            int col3 = AleatoriosUtil.aleatorioEnteroEnRango(6, 8);
            int fila1 = AleatoriosUtil.aleatorioEnteroEnRango(0, 2);
            int fila2 = AleatoriosUtil.aleatorioEnteroEnRango(3, 5);
            int fila3 = AleatoriosUtil.aleatorioEnteroEnRango(6, 8);

            tableroJugable2D[fila1][col2] = 0;
            tableroJugable2D[fila3][col2] = 0;
            tableroJugable2D[fila2][col1] = 0;
            tableroJugable2D[fila2][col3] = 0;
        }
        
        
    }
    
    /**
     * Método para establecer el nivel del juego elegido por el usuario
     */
    public void setNivel(){
        String nivelS=JOptionPane.showInputDialog("Indica el nivel (0=principiante, 1=medio, 2=avanzado ");
        int nivel=Integer.parseInt(nivelS);
        
        while (nivel != 0 && nivel != 1 && nivel != 2){
            nivelS=JOptionPane.showInputDialog("Nivel incorrecto, escribe de nuevo 0, 1 ó 2");
            nivel=Integer.parseInt(nivelS);
        }

        if (nivel == 1){
            numIntentos=(DIM==2)? 16:19; //if dim es 2, hay 8 celdas vacías. Si dim es 3 hay 19 celdas vacías. Multiplico por 2 al ser nivel 1
        } //solo en el caso de nivel medio pongo el número de intentos al doble de celdas a 0
        
        nivelSudoku = nivel; //inicializo a nivel global el nivel elegido por el usuario
        
        
    }
    
    /**
     * Método recursivo para comprobar que los datos introducidos por el usuario son correctos
     * Se validan dato a dato y se va comprobando el número de oportunidades según el nivel
     */
    private void check(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de fila"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de columna"));
        if (x > (DIM*2 -1) || y > ( DIM*2 - 1)) {
            JOptionPane.showMessageDialog(null, "Los valores para la fila o columna son incorrectos.\nNo pueden ser mayor que "+(DIM*2 -1)+"\nVuelve a intentarlo");
            check();
        }
        else if (tableroJugable2DCopia[x][y] != 0){
            JOptionPane.showMessageDialog(null, "La celda elegida no es un hueco a rellenar.\nVuelve a intentarlo");
            check();
        }else{
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor"));
            if (valor > 0 && valor <= DIM*2){
                contadorIntentos++;
                if (tablero2D[x][y] == valor){
                    tableroJugable2D[x][y] = valor;
                    JOptionPane.showMessageDialog(null, "Correcto!!!!");
                    System.out.println("*************** [ NUM INTENTOS:"+contadorIntentos+" ] **********************");
                    System.out.println("* TABLERO SOLUCIÓN:");
                    pintarTablero(tablero2D,true);
                    System.out.println("* TABLERO PARA JUGAR:");
                    pintarTablero(tableroJugable2D,true);
                    System.out.println("*******************************************************");
                    if( !sudokuResuelto()) check();
                    else JOptionPane.showMessageDialog(null, "Perfecto!!!! Has acertado el SUDOKU machote!!!!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "InCorrecto!!!!");
                    switch (nivelSudoku){
                        case 2:
                            JOptionPane.showMessageDialog(null, "Lo siento, no tienes más oportunidades por ser nivel avanzado.");
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null, "Prueba de nuevo, tienes infinitos intentos por ser nivel principiante");
                            if( !sudokuResuelto())
                                check();      
                            break;
                        case 1:
                            if (numIntentos == 0)
                                JOptionPane.showMessageDialog(null, "Lo siento, no tienes más oportunidades.\nHas consumido todas las oportunidades");
                            else{
                                numIntentos--;
                                JOptionPane.showMessageDialog(null, "Te quedan "+numIntentos+" intentos");
                                if( !sudokuResuelto()) check();
                            }
                            break;

                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Introduce un valor entre 0 y "+DIM+"\nVuelve a intentarlo");
            }
        }
    }
    
    /**
     * Método para comprobar que el sudoku está resuelto por completo
     * @return booleano indicando si el sudoku está completado, por tanto resuelto
     */
    private boolean sudokuResuelto(){
        boolean completo = true;
        for(int i=0; i< tableroJugable2D.length;i++){
            for(int j=0; j<tableroJugable2D[i].length;j++){
                if (tableroJugable2D[i][j] == 0){
                    completo= false;
                    break;
                }
            }
            if (!completo)
                break;
        }
        return completo;
    }
    
    // -------- MÉTODOS PÚBLICOS -----------------
    
    /**
     * Método para mostrar en una ventana las instrucciones de inicio del juego
     */
    public void pintaInfo(){
        StringBuffer sb = new StringBuffer();
        sb.append("                  BIENVENIDO A SUDOKU SAMURAI\nDebes indicar la posición de la fila y columna donde hay un 0 y decir el número que quieres poner.");
        sb.append("\n\n\tDependiendo del nivel tendrás diferente número de oportunidades para resolverlo:\n");
        sb.append("\t - Nivel avanzado: No se permite ningún fallo\n");
        sb.append("\t - Nivel medio: El doble de oportunidades que celdas vacías\n");
        sb.append("\t - Nivel principiante: No tienes límite de oportunidades\n");
        sb.append("\n\nEmpezamos. Suerte!!!!!");
        
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
    
    /**
     * Método para iniciar el juego
     */
    public void initPlay(){
        check();
    }    
    
}
