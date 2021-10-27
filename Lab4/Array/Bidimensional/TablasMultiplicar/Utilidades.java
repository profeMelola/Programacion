package tablasmultiplicararrays;

/**
 *
 * @author melola
 */
public class Utilidades {

    /**
     * cargarTablasMultiplicar
     * @param tablas 
     */
    protected static void cargarTablasMultiplicar(int[][] tablas){
        //recorrer las filas
        for(int i=0;i<tablas.length;i++){
            //recorrer las columnas
            for(int j=0;j<tablas[i].length;j++){
                //estoy en una celda!!!!
                tablas[i][j] = (i+1)*j;
            }
        }
    }
    
    /**
     * mostrarTablasMultiplicar
     * @param tablas 
     */
    protected static void mostrarTablasMultiplicar(int[][] tablas){
        //recorrer las filas
        System.out.println("TABLAS EN FORMATO LISTA");
        for(int i=0;i<tablas.length;i++){
            System.out.println("Tabla de multiplicar del "+(i+1));
            //recorrer las columnas
            for(int j=0;j<tablas[i].length;j++){
                //estoy en una celda!!!!
                System.out.println((i+1)+" x "+j+" = "+tablas[i][j]);
            }
        }
    }

    /**
     * mostrarTablasMultiplicarMatriz
     * @param tablas 
     */
    protected static void mostrarTablasMultiplicarMatriz(int[][] tablas){
        //recorrer las filas
        System.out.println("TABLAS EN FORMATO MATRIZ");
        for(int i=0;i<tablas.length;i++){
            //recorrer las columnas
            for(int j=0;j<tablas[i].length;j++){
                //estoy en una celda!!!!
                System.out.print(tablas[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
    
    /**
     * mostrarTablaMultiplicar
     * @param tablas
     * @param numTabla 
     */
    protected static void mostrarTablaMultiplicar(int[][] tablas,int numTabla){
        
        System.out.println("Tabla del "+numTabla);
        
        for(int j=0;j<tablas[numTabla - 1].length;j++){
            System.out.println( numTabla +" x "+j+" = "+tablas[numTabla -1][j]);        
        }
        
    }
    
    protected static void mostrarTablaMultiplicarExtra(int numTabla){
        System.out.println("Tabla del "+numTabla);
        
        for(int j=0;j<=10;j++)
            System.out.println( numTabla +" x "+j+" = "+(numTabla * j));        
    }
    
    
}
