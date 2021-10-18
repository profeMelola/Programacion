package notasalumnofinal;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class NotasAlumnoPrincipal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] notas=null; //este es el array de doubles donde se va a guardar las notas. Todavía no sé cuantas notas va a introducir el usuario
        
        // Manejando el array de parámetros de la clase main
        if (args.length == 0 || args.length > 1)
            System.out.println("[ERROR] Este programa necesita SOLO un parámetro. \n El nombre del profe");
        else{
            //for (String arg: args){
                System.out.println("Nombre del profesor:"+args[0]);
            //}
        }
        
        
        
        System.out.println("*************** PROGRAMA NOTAS PRINCIPAL ***********");
        System.out.println("¿Cuántas notas quieres introducir?");
        Scanner sc = new Scanner(System.in);
        int numNotas = sc.nextInt();
        
        //controlar si el num de notas introducido es correcto...
        // if (numNotas .......
        
        // inicializo el array
        notas= new double[numNotas];
        
        // Llamando al método para rellenar las notas del array
        Notas.rellenarArrayNotas(notas,sc);
        //Ya tengo el array de notas inicializado con las notas bien....
        
        // ----------------------------------------------
        double media = 0;
        
        media = Notas.calcularMedia(notas);     
        
        System.out.println("La nota media obtenida es: "+media);
        
        // ---------- DIFERENTES FORMAS DE "FORMATEAR" UN DECIMAL ---------------------
        // REDONDEO, TRUNCAR...
        
        //Formateando a dos decimales
        DecimalFormat df = new DecimalFormat("0.00");  
        //df.setRoundingMode(RoundingMode.HALF_UP);
        
        System.out.println("La nota media con dos decimales: "+df.format(media));
        
        //Redondeando al entero más próximo
        System.out.println("La nota media redondeada al entero más próximo es: "+Math.round(media));
        
        //Quedándonos con el entero (sin redondear)
        //int mediaEntera = (int)media;
        int mediaEntera = (int)media;
        
        System.out.println("La nota media entera obtenida es:"+mediaEntera);
        // ------------------------------------------
        
        // Cargar en un array de String los textos de las calificaciones
        String[] calificaciones = new String[10];
        //calificaciones = inicializaStringTextos(calificaciones);
        Notas.inicializaStringTextos(calificaciones);
        
        System.out.println("Mensaje del profesor: "+calificaciones[mediaEntera - 1]);
        
    }

    
}
