package multiplicacionrecursiva;

import javax.swing.JOptionPane;

/**
 *
 * @author melola
 */
public class MultiplicacionRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tablaCadena = JOptionPane.showInputDialog("Introduce la tabla que quieres mostrar");
        String numVecesCadena = JOptionPane.showInputDialog("Introduce el número de multiplicadores");
        
        int tabla = Integer.parseInt(tablaCadena);
        int numVeces = Integer.parseInt(numVecesCadena);
        
        multiplicar(tabla, numVeces);
        
        System.out.println("CHIN PUM!!!");
    }
	
    public static void multiplicar(int tabla, int numVeces){
        
            if( numVeces > 1){
                    multiplicar(tabla, numVeces-1);
            }
            
            System.out.println("\t" + tabla + " x " + numVeces + " = " + (tabla * numVeces) );
    }
    
    
    
}
