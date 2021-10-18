package notasalumnofinal;

import java.util.Scanner;

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
    public static double calcularMedia(double[] notas){
        
        System.out.println("********** estoy en la nueva clase Notas ***********");
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
    
    public static void rellenarArrayNotas(double[] notas, Scanner sc){
        
        //bucle para pedir al usuario tantas nota como haya indicado
        for (int i=0; i < notas.length; i++){
            
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
        
        
    }
    
}
