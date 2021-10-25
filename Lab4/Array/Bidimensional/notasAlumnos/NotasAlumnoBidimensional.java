/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalumnobidimensional;

/**
 *
 * @author melola
 */
public class NotasAlumnoBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean error = false; //no hay error
        
        // ---------------------------
        // Control de argumentos
        if (args.length != 1){
            System.out.println("[ERROR] Debes pasar como argumento el nombre del profe");
            error = true;
        }
        else{
            System.out.println(" Bienvenido profesor "+args[0]);
        }
        // -----------------------------------
        
        if (!error){
            // ------------------------
            //primera forma de inicializar (lenta)
            double[][] notas = new double[2][3]; //2 alumnos y tres notas;        
            //alumno 1
            notas[0][0] = 4.5; 
            notas[0][1] = 7;
            notas[0][2] = 3.25;

            //alumno 2
            notas[1][0] = 3.5;
            notas[1][1] = 6;
            notas[1][2] = 9.5;

            // ----------------------
            double[][] notas2 = {{4.5,7,3.25},{3.5,6,9.5}};

            // Pintar el array
            UtilidadesArray.pintaArray(notas);
            UtilidadesArray.pintaArray(notas2);

            // Obtener notas medias de cada alumno
            // Cada fila es un alumno
            for ( int i=0; i<notas.length; i++){
                System.out.println("Nota media del alumno ["+(i+1)+"]: "+Notas.calcularMediaAlumno(notas2[i]));
            }
        }
        
    }
    
}
