/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.empleadoApp;

import es.daw.empleadoApp.model.*;

/**
 *
 * @author melol
 */
public class EmpleadoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo","especialidad");
        
        Tecnico T2 = new Tecnico();
        
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
        System.out.println(T2);
        
        // getClass(): obtener la clase en tiempo de ejecución real del objeto
        System.out.println("* GetClass:");
        System.out.println("E1: "+E1.getClass());
        System.out.println("D1: "+D1.getClass());
        System.out.println("OP1: "+OP1.getClass());
        System.out.println("OF1: "+OF1.getClass());
        System.out.println("T1: "+T1.getClass());
        
    }

}
