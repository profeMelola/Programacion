/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author melol
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //¿QUÉ SE VA A PINTAR POR PANTALLA?????
        /*
          Las trazas de un error
          Un 1
          Un 2
          Un 3
          Nada
         */
        System.out.println(devuelveNumero(4));
    }

    public static int devuelveNumero(int num) {
        //public static int devuelveNumero(int num) throws Exception{
        int resultado = 0;
        try {
            if (num % 2 == 0) {
                System.out.println("Es par y lanzo excepcion");
                throw new Exception("Lanzando exception");
            }
            resultado = 1;
        } catch (Exception ex) {
            System.out.println("Recojo excepción " + ex.getMessage());
            resultado = 2;
        } finally {
            // Siempre pasa. Es para limpiar código
            System.out.println("Siempre pasa");
            resultado = 3;
        }

        System.out.println("Fin!!!");
        return resultado;
    }
}
