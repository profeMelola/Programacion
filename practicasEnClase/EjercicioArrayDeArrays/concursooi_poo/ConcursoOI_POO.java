/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concursooi_poo;

/**
 *
 * @author melola
 */
public class ConcursoOI_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Concurso COI = new Concurso("Olimpiadas Informáticas");
        
        System.out.println("1. CARGANDO DATOS....");
        //Concursantes nivel bajo
        Concursante cb1 = new Concursante("bajo", "bajo1");
        cb1.setNotaFinal(3);
        Concursante cb2 = new Concursante("bajo", "bajo2");
        cb2.setNotaFinal(4);
        Concursante cb3 = new Concursante("bajo", "bajo3");
        cb3.setNotaFinal(5.7f);
        Concursante[] concursantesNivelBajo = new Concursante[3];
        concursantesNivelBajo[0] = cb1;
        concursantesNivelBajo[1] = cb2;
        concursantesNivelBajo[2] = cb3;
        COI.setConcursantesNivelBajo(concursantesNivelBajo);
        
        //Concursantes nivel medio
        Concursante cm1 = new Concursante("medio", "medio1");
        cm1.setNotaFinal(3.5f);
        Concursante cm2 = new Concursante("medio", "medio2");
        cm2.setNotaFinal(8);
        Concursante cm3 = new Concursante("medio", "medio3");
        cm3.setNotaFinal(5);
        Concursante cm4 = new Concursante("medio", "medio4");
        cm4.setNotaFinal(7);
        Concursante[] concursantesNivelMedio = new Concursante[4];
        concursantesNivelMedio[0] = cm1;
        concursantesNivelMedio[1] = cm2;
        concursantesNivelMedio[2] = cm3;
        concursantesNivelMedio[3] = cm4;
        COI.setConcursantesNivelMedio(concursantesNivelMedio);
        
        //Concursantes nivel alto
        Concursante ca1 = new Concursante("alto", "alto1");
        ca1.setNotaFinal(3.5f);
        Concursante ca2 = new Concursante("alto", "alto2");
        ca2.setNotaFinal(2.8f);
        Concursante ca3 = new Concursante("alto", "alto3");
        ca3.setNotaFinal(5);
        Concursante ca4 = new Concursante("alto", "alto4");
        ca4.setNotaFinal(7);
        Concursante ca5 = new Concursante("alto", "alto5");
        ca4.setNotaFinal(9);
        Concursante[] concursantesNivelAlto = new Concursante[5];
        concursantesNivelAlto[0] = ca1;
        concursantesNivelAlto[1] = ca2;
        concursantesNivelAlto[2] = ca3;
        concursantesNivelAlto[3] = ca4;
        concursantesNivelAlto[4] = ca5;
        COI.setConcursantesNivelAlto(concursantesNivelAlto);
        
        
        //MOSTRAR NOTAS
        System.out.println("2. MOSTRANDO NOTAS DE TODOS LOS NIVELES EN ORDEN DESCENDENTE....");
        COI.mostrarNotasPorNivel(concursantesNivelBajo);
        COI.mostrarNotasPorNivel(concursantesNivelMedio);
        COI.mostrarNotasPorNivel(concursantesNivelAlto);
        
        //OBTENER MEJOR NOTA
        System.out.println("3. OBTENIENDO MEJOR NOTA....");
        COI.obtenerMejorNota(concursantesNivelBajo);
        COI.obtenerMejorNota(concursantesNivelMedio);
        COI.obtenerMejorNota(concursantesNivelAlto);
        
    }
    
}
