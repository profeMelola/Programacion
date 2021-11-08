package copiararrays;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class CopiarArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array1 = new String[]{"uno","dos","tres","cuatro","cinco","seis","siete"};
        
        String[] array2 = new String[3];
        String[] array3 = new String[4];
        
        // ---------------------------------------------
        // COPIANDO CON System.arraycopy
        System.arraycopy(array1, 0, array2, 0, 3);
        System.arraycopy(array1, 3, array3, 0, 4);
        
        System.out.println("array 1:"+Arrays.toString(array1));
        System.out.println("array 2:"+Arrays.toString(array2));
        System.out.println("array 3:"+Arrays.toString(array3));
        
        // ------------------------------------------------
        // COPIANDO con Arrays.copyOf
        String[] array4 = new String[array1.length];
        array4 = Arrays.copyOf(array1, array1.length);
        System.out.println("array 4:"+Arrays.toString(array4));
        
        String[] array5 = new String[3];
        array5 = Arrays.copyOf(array1, array5.length);
        System.out.println("array 5:"+Arrays.toString(array5));
        
        String[] array6 = new String[4];
        array6 = Arrays.copyOf(array1, array6.length);
        System.out.println("array 6:"+Arrays.toString(array6));     
        
        String[] array7 = new String[4];
        array7 = Arrays.copyOfRange(array1, 3, array1.length);
        System.out.println("array 7:"+Arrays.toString(array7)); 
        
        
        
        
        
        
    }
    
}
