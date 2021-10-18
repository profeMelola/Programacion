package notasalumnofinal;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class NotasAlumnoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] notas=null; //este es el array de doubles donde se va a guardar las notas. Todavía no sé cuantas notas va a introducir el usuario
        
        System.out.println("¿Cuántas notas quieres introducir?");
        Scanner sc = new Scanner(System.in);
        int numNotas = sc.nextInt();
        
        //controlar si el num de notas introducido es correcto...
        // if (numNotas .......
        
        // inicializo el array
        notas= new double[numNotas];
        
        //bucle para pedir al usuario tantas nota como haya indicado
        for (int i=0; i < numNotas; i++){
            
            boolean notaIncorrecta = true;
            
            do{
                System.out.println("Introduce la nota ("+(i+1)+"): ");
                
                double nota = sc.nextDouble();
                
                //comprobando que la nota va entre 0 y 10
                if (nota < 0 || nota > 10)
                    System.out.println("Has introducido una nota incorrecta. Debe ser entre 0 y 10 (incluidos)");
                else{
                    notas[i] = nota;
                    notaIncorrecta = false;
                }
            }while(notaIncorrecta);
            
        }
        
        //Ya tengo el array de notas inicializado con las notas bien....
        
        // ----------------------------------------------
        double media = 0;
        
        media = calcularMedia(notas);     
        
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
        inicializaStringTextos(calificaciones);
        
        System.out.println("Mensaje del profesor: "+calificaciones[mediaEntera - 1]);
        
    }
    
    /**
     * calcularMedia
     * @param notas
     * @return 
     */
    public static double calcularMedia(double[] notas){
        
        double suma = 0; //variable que almacena el sumatorio de todas las notas
        double media = 0; //variable que almacena la nota media
        
        for(int i=0; i< notas.length; i++){
            //suma += notas[i];
            suma = suma + notas[i];
        }
        
        media = suma / notas.length;
        
        return media;
    }

    /**
     * Este método sirve para....
     * @param calificaciones es un array ....
     * @return ...
     */
    public static void inicializaStringTextos(String[] calificaciones){
    //public static String[] inicializaStringTextos(String[] calificaciones){
        calificaciones[0] = "Debes estudiar mucho mucho más";
        calificaciones[1] = "Debes estudiar mucho más";
        calificaciones[2] = "Debes practicar";
        calificaciones[3] = "Casi apruebas";
        calificaciones[4] = "Aprobado";
        calificaciones[5] = "Bien";
        calificaciones[6] = "Muy bien";
        calificaciones[7] = "Notable";
        calificaciones[8] = "Sobresaliente";
        calificaciones[9] = "Perfecto";
        
        //return calificaciones;
    }
}