package arrays;

/**
 *
 * @author melola
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] notas = new int[]{1,5,3,9,10};
        
        int suma = sumar(notas);
        pintaArray(notas);
        
        System.out.println("La suma de las notas es: "+suma);
        System.out.println("La media de las notas es: "+hacerMedia(notas.length,suma));
        
        //ahora modifico el array por referencia en el método modificoArray
        modificoArray(notas,0,10);

        pintaArray(notas);
        suma = sumar(notas);
        System.out.println("******** Tras la modificación ***********");
        System.out.println("La suma de las notas es: "+suma);
        System.out.println("La media de las notas es: "+hacerMedia(notas.length,suma));
        
    }
    
    public static int sumar(int[] notas){
        int suma=0;
        for (int i=0; i<notas.length;i++){
            suma += notas[i];
        }
        return suma;
    }
    
    public static double hacerMedia(int longitudNotas, int suma){
        return suma/longitudNotas;
        
    }
    
    public static void modificoArray(int[] notas,int posicion, int valor){
        notas[posicion] = valor;
    }
    
    public static void pintaArray(int[] notas){
        System.out.println("***Array:");
        for(int i=0;i<notas.length;i++)
           System.out.println(notas[i]);
    }
    
}
