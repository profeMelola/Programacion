package notasalumnos;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class NotasAlumnosFinal {

    //Prueba declarando las variables globales. De esta forma no necesitaría pasaralas como parámetros a la función calcularMedia 
    //static double nota1,nota2,nota3,nota4,nota5,resultado;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // -----------------------------------------------
        // -- VERSIÓN 1
        //double nota1,nota2,nota3,nota4,nota5,resultado;
        /*nota1=5;
        nota2=7;
        nota3=4.5;
        nota4=9;
        nota5=3.75;*/
        // -----------------------------------------------

        // -----------------------------------------------
        // -- VERSIÓN 2
        // Primera forma de inicializar
        /*double[] notas = new double[5];
        notas[0]=5;
        notas[1]=7;
        notas[2]=4.5;
        notas[3]=9;
        notas[4]=3.75;*/
        
        // Segunda forma de inicializar
        //double[] notas = {5,7,4.5,9,3.75};
        // ----------------------------------------------
        double[] notas=null;
        System.out.println("¿Cuántas notas quieres introducir?");
        Scanner sc = new Scanner(System.in);
        int numNotas = sc.nextInt();
        notas= new double[numNotas];
        
        for (int i=0; i < numNotas; i++){
            boolean notaIncorrecta = true;
            do{
                System.out.println("Introduce la nota ("+(i+1)+"): ");
                double nota = sc.nextDouble();
                if (nota < 0 || nota > 10)
                    System.out.println("Has introducido una nota incorrecta. Debe ser entre 0 y 10 (incluidos)");
                else{
                    notas[i] = nota;
                    notaIncorrecta = false;
                }
            }while(notaIncorrecta);
        }
        
        
        // ----------------------------------------------
        double media = 0;
        //media = calcularMedia(nota1,nota2,nota3,nota4,nota5);     
        media = calcularMedia(notas);     
        
        System.out.println("La nota media obtenida es: "+media);
        
        //Formateando a dos decimales
        DecimalFormat df = new DecimalFormat("0.00");  
        df.setRoundingMode(RoundingMode.HALF_UP);  
        System.out.println("La nota media con dos decimales: "+df.format(media));
        
        //Redondeando al entero más próximo
        System.out.println("La nota media redondeada al entero más próximo es: "+Math.round(media));
        
        //Quedándonos con el entero (sin redondear)
        int mediaEntera = (int)media;
        
        System.out.println("La nota media entera obtenida es:"+mediaEntera);
        
        // Cargar en un array de String los textos de las calificaciones
        String[] calificaciones = new String[10];
        inicializaStringTextos(calificaciones);
        
        System.out.println("Mensaje del profesor: "+calificaciones[mediaEntera - 1]);
        
    }
    
    /**
     * calcularMedia
     * @param notas
     * @return 
     */
    public static double calcularMedia(double[] notas){
    //public static double calcularMedia(){
    //public static double calcularMedia(double nota1, double nota2, double nota3, double nota4, double nota5){
        //double media = (nota1 + nota2 + nota3 +nota4 +nota5) / 5;
        
        double suma = 0; //variable que almacena el sumatorio de todas las notas
        double media = 0; //variable que almacena la nota media
        
        for(int i=0; i< notas.length; i++){
            suma += notas[i];
        }
        
        media = suma / notas.length;
        
        return media;
    }
    
    /**
     * 
     * @param calificaciones 
     */
    public static void inicializaStringTextos(String[] calificaciones){
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
    }
}