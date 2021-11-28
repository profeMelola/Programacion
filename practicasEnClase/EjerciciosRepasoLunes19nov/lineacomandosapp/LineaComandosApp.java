/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lineacomandosapp;

/**
 *
 * @author melol
 */
public class LineaComandosApp {

    static final int NUMEROS = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int suma = 0;
        
        System.out.println("args.length:"+args.length);
        for (int i = 0; i < args.length; i++) {

            suma += Integer.parseInt(args[i]);

        }

        System.out.format("La suma es %d\n", suma);

    }

}
