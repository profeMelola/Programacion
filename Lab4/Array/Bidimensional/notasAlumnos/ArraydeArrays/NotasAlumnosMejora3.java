package notasalumnosmejora3;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class NotasAlumnosMejora3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("* Indica el número de alumnos de los que vas a guardar la nota:");
        
        int numAlumnos = sc.nextInt();
        
        double[][] notasAlumnos = new double[numAlumnos][];
        
        Notas.crearMatrizNotas(notasAlumnos,sc);
        
        Notas.guardarNotasAlumnos(notasAlumnos, sc);
        
        Notas.pintaNotasAlumnos(notasAlumnos);
        
        System.out.println("***** NOTA MEDIA\n"+Notas.obtenerNotaMediaAlumno(notasAlumnos, sc));
        
        Notas.obtenerTodasLasNotasMedias(notasAlumnos);
        
        
    }
    
}
