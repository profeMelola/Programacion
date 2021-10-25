/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnobidimensional;

/**
 *
 * @author melola
 */
public class Notas {
    
    /**
     * calcularMedia
     * @param notas
     * @return 
     */
    protected static double calcularMediaAlumno(double[] notasAlumno){
        double media = 0;
        double sumatorio = 0;
        
        for (double nota: notasAlumno){
            sumatorio += nota;
            //sumatorio = sumatorio + nota;
        }
        
        media = sumatorio / notasAlumno.length;
        
        return media;
    }
}
