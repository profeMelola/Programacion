package exceptionscanner;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class ExceptionScanner {

    private static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        int num = 0;
        
        // El método pedir número devolverá el número 
        // introducido por el usuario. En el caso de que
        // sobrepase el ńumero de intentos se lanzará una excepción
        // indicando ese error.
        int numVeces = 3;
        
        // --------------------------------------------
        try{
            num = pedirNumero(numVeces); //gestionar la excepción
            System.out.println("El número introducido es "+num);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("El número por defecto devuelto es 0");
        }
        finally{
            System.out.println("Y chimpún!!!");
        }
        // -------------------------------------------
        
    }
    
    /**
     * Método que pide por consola al usuario introducir un número 
     * entero.
     * En el caso de que el usuario no escriba correctamente un número entero
     * avisará con un mensaje y volverá a pedir que lo introduzca.
     * Si se supera el número de intentos, lanzará una excepción con el aviso
     * @param numVeces Indica el número de intentos permitidos
     * @return Devuelve el número entero introducido por el usuario
     * @throws Exception 
     */
    public static int pedirNumero(int numVeces) throws Exception{
        boolean error = false;
        int num = 0;
        int cont = 0;
        do{
            System.out.println("Escribe un número entero:");
            try{
                error=false;
                num=sc.nextInt();
            }catch(java.util.InputMismatchException e){
                error=true;
                cont++;
                System.out.println("Oye majete, que no has metido un número entero!!!!!");
                sc.nextLine();
            }
        }while(error && cont < numVeces);
        
        //Si cont == numVeces, entonces creo una Excepción y la propago
        if (cont == numVeces){
            Exception miExcep = new Exception("Has sobrepasado los "+numVeces+" intentos.");
            throw miExcep;
        }
        
        return num;
        
    }
    
}
