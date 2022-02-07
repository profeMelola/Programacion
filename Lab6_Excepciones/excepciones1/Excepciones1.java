package excepciones1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author melola
 */
public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // -------- PROBANDO CON EXCEPCIONES DE TIPO UNCHECKED -----------
        
        int a = 2, b = 0;

        try {
            
            // -----------------------------------------
            // Generando exception ArithmeticException
            b = 1;//para que no se produzca el error
            int c = a / b;
            
            // --------------------------------------
            //Generando exception NullPointerException
            //String cadena = null;
            String cadena = "";//para que no se produzca el error
            cadena.chars();
            
            // -------------------------------------
            //Generando excepciones: null + outOfBound
            //String[] mensajes = {"En un lugar ",null," de cuyo nombre "," no quiero acordarme"};
            /*String[] mensajes = {"En un lugar "," de la Mancha "," de cuyo nombre "," no quiero acordarme"};
            
            for(int i=0; i<=mensajes.length;i++)
                System.out.println(mensajes[i].toLowerCase());
            */
            // -----------------
            String cadena1 = "12";
            String cadena2 = "0";
            String respuesta = "";
            // http://programacion.codeandcoke.com/doku.php?id=bloque3:excepciones
            
            // ---------------
            String str = "   12   ";
            int numero = Integer.parseInt(str);
            
            
        } catch (ArithmeticException e){
            System.err.println("1. Mensaje de la excepción: " + e.getMessage());
            System.out.println("2. Oye, error de división por cero!!!!");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            System.err.println("3.Mensaje null y index:"+e.getLocalizedMessage());
        } catch (NumberFormatException e){
            System.out.println("4.NumberException:"+e.getLocalizedMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("[[[[[[Excepción general]]]]]]");
        } finally{
            System.out.println("**** SIEMPRE SIEMPRE PASA POR AQUÍ...");
        }
        
        // -------- PROBANDO CON EXCEPCIONES DE TIPO CHECKED -----------
        writeString2File(); //sin throw
        
        try{
            writeString2File(true); //con throw 
        }catch(FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        }
        
        // --------- PROBANDO CON EXCEPCIONES PROPIAS ----
        try{
            comprobarDiaMes(45);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("FIN!!!!!!!. La aplicación continua la ejecución...");
        
    }

    public static void writeString2File(){
    //public static void writeString2File() throws FileNotFoundException{
        PrintWriter escritor=null;
        try{
            escritor = new PrintWriter("ruta/fichero.txt");
        }catch(FileNotFoundException e){
            /*
            //Imaginad que todas las trazas las he volcado a un fichero de log...
            System.err.println("Error: la ruta del fichero no es correcta");
            e.printStackTrace();*/
            //throw e;
        }finally{
            System.out.println("--> Voy a cerrar el PrintWriter");
            if (escritor != null) escritor.close();
        }
        
        
    }
    
    public static void writeString2File(boolean cualquiercosa) throws FileNotFoundException{
        PrintWriter escritor=null;
        escritor = new PrintWriter("ruta/fichero.txt");
        if (escritor != null) escritor.close();
    }    
    
    
    public static void comprobarDiaMes (int dia) throws Exception{
        if (dia >31 || dia < 1){
            Exception pepito = new Exception("Número de día fuera de rango");
            throw pepito;
        }
    }
}
