/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.astrosapp;

import es.daw.astrosapp.model.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author melol
 */
public class AstrosMain {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Creamos una lista
        Astro[] astrosArray = new Astro[10];
        ArrayList<Astro> astros = new ArrayList<>();

        // Instanciamos planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);

        // Instanciamos satélites
        Satelite luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0, tierra);
        Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000, marte);
        Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460, marte);

        // Añadimos satélites a planetas
        tierra.añadirSatelite(luna);
        marte.añadirSatelite(fobos);
        marte.añadirSatelite(deimos);

        // Añadimos planetas y satélites a la lista
        astrosArray[0] = tierra;
        astrosArray[1] = venus;
        astrosArray[2] = marte;
        astrosArray[3] = luna;
        astrosArray[4] = fobos;
        astrosArray[5] = deimos;
        
        astros.add(tierra);
        astros.add(marte);
        astros.add(luna);
        astros.add(fobos);
        astros.add(deimos);
        
        

        // Menú para elegir astro y mostrar su información. Se repite hasta introducir -1
        int opcion;
        do {
            // Mostramos lista de astros
            //mostrarListaAstros(astrosArray);
            mostrarListaAstros(astros);

            // Pedimos nº de astro a mostrar
            System.out.print("Elige un nº de astro (-1 para salir): ");
            opcion = in.nextInt();
            opcion--;

            // Si nº válido, mostrar info del astro
            /*if (opcion >= 0 && opcion < astros.length) {
                Astro a = (Astro) astros[opcion];
                if (a != null) {
                    a.muestra();
                }
            }*/
            if (opcion >=0 && opcion <astros.size()){
                Astro a = astros.get(opcion);
                if ( a != null) a.muestra();
            }
            
            // Si -1, terminar
            else if (opcion == -1) {
                return;
            } // Si no, mensaje de error
            else {
                System.out.println("Opción incorrecta");
            }

            // Pedimos enter para continuar
            System.out.println("Enter para continuar");
            in.nextLine();
            in.nextLine();

        } while (true);
    }    
   
    // Imprime la lista de astros (solo sus nombres)
    public static void mostrarListaAstros(Astro[] astros) {
        System.out.println("=== LISTA DE ASTROS EN ARRAY NORMAL===");
        int contador = 1;
        for (Astro a : astros) {
            if (a != null) {
                System.out.println("Astro "+contador+" : " + a.getNombre());
                contador++;
            }
        }
    }
    
    public static void mostrarListaAstros(ArrayList<Astro> astros) {
        System.out.println("=== LISTA DE ASTROS EN ARRAYLIST===");
        int contador = 1;
        for(Astro a:astros){
            System.out.println("Astro "+contador+" : "+a.getNombre());
            contador++;
        }
    }
   
}
