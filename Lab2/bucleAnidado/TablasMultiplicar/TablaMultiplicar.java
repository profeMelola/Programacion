package tablamultiplicar;

/**
 *
 * @author melola
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //bucle para recorrer las 9 tablas de multiplicar
        for (int i= 1; i<= 9; i++){
            System.out.println("**** Tabla del "+i);
            for(int j=0; j<=10; j++){
                System.out.println(i + "X" + j + "=" + (i*j));
            }
        }
        
    }
    
}
