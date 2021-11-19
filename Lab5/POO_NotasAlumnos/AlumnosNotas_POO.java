/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnosnotas_poo;

/**
 *
 * @author melola
 */
public class AlumnosNotas_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Pepe","Martínez");
        Alumno alumno2 = new Alumno("Sandra","González","Díaz");

        int[][] notas = new int[6][4]; //6 módulos por 4 notas cada módulo: 1 ev, 2 ev, 3 ev, final
        
        //Inicializo unas notas para el alumno 1 a modo de ejemplo (sin pedir por consola)
        int[][] notasAlum2 = {{5,4,6,0},{8,5,7,0},{1,2,3,0},{7,8,9,0},{5,4,6,0},{8,5,7,0}};
        alumno2.setNotasModulos(notasAlum2);
        System.out.println("NOTAS DEL ALUMNO 2");
        alumno2.mostrarNotas();
        
        alumno2.ordenarNotas(1);
        System.out.println("NOTAS ORDENADAS DEL MÓDULO 2, DEL ALUMNO 2 ");
        alumno2.mostrarNotasModulo(1);
        
    }
    
}
