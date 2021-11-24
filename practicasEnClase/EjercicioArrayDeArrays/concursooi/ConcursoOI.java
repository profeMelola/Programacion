package concursooi;

/**
 *
 * @author melola
 */
public class ConcursoOI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float[][] notasConcursantes = new float[3][];
        
        notasConcursantes[0] = new float[3]; // 3 concursantes nivel bajo
        notasConcursantes[1] = new float[4]; // 4 concursantes nivel medio
        notasConcursantes[2] = new float[5]; // 5 concursantes nivel alto
        
        System.out.println("1. REGISTRANDO NOTAS (prueba con datos fijos, el el alumno deberá permitir meter los datos por consola");
        //Método para meter notas de todos los concursantes
        Utilidades.registrarNotasConcursantes(notasConcursantes);
        
        System.out.println("2. MOSTRANDO NOTAS....");
        //Método para ordenar notas por nivel y mostrarlas por pantalla en orden descendente
        Utilidades.mostrarNotasTodosNivelesOrdDesc(notasConcursantes);
        
        System.out.println("3. MEJOR NOTA....");
        //Método para obtener mejor nota de todos los nivel
        Utilidades.obtenerMejorNotaTodosNiveles(notasConcursantes);
        
        
        
    }
    
}
