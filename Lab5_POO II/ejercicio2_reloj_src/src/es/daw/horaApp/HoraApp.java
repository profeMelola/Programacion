/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.horaApp;

import es.daw.horaApp.model.Hora;
import es.daw.horaApp.model.HoraExacta;
import java.util.Scanner;

/**
 *
 * @author melol
 */
public class HoraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * PARTE I
         */
        System.out.println("* PARTE I:");
        Hora h = new Hora(11, 30); //las 11:30
        System.out.println("1. Hora inicializada: "+h);
        for (int i = 1; i <= 61; i++) { //incrementamos 61 minutos
            h.inc();
        }
        System.out.println("2. Hora incrementada 61 minutos: "+h); //mostramos
        
        System.out.println("3. Escriba una hora para cambiar:");
        int hora = new Scanner(System.in).nextInt();
        
        boolean cambio = h.setHora(hora); //cambiamos la hora
        
        if (cambio) {
            System.out.println("\tLa hora cambiada es: "+h);
        } else {
            System.out.println("\tLa hora no se pudo cambiar");
        }
        
        /*
         * PARTE II
         */
        System.out.println("* PARTE II:");
        HoraExacta he = new HoraExacta(11, 15, 23); 
        System.out.println("1. Hora exacta inicializada: "+he);
        for (int i = 1; i <= 61; i++) {
            he.inc();
        }
        System.out.println("2. Hora incrementada 61 segundos: "+he);
        
        System.out.println("3. Escriba los segundos a cambiar: ");
        int segundos = new Scanner(System.in).nextInt();
        if (he.setSegundos(segundos)) {
            System.out.println("\tLa hora exacta cambiada es: "+he);
        } else {
            System.out.println("\tNo es posible cambiar los segundos");
        }        
        
        /*
         * PARTE III
         */
        System.out.println("* PARTE III:");
        HoraExacta a = new HoraExacta(1, 2, 3);
        System.out.println("HoraExacta (a): "+a);
        HoraExacta b = new HoraExacta(1, 2, 3);
        System.out.println("HoraExacta (b): "+b);
        HoraExacta c = new HoraExacta(10, 20, 30);
        System.out.println("HoraExacta (c): "+c);
        System.out.println("");
        System.out.println("¿Es a igual que b? ");
        System.out.println(a.equals(b));
        System.out.println("¿Es a igual que c? ");
        System.out.println(a.equals(c));                 
    }

}
