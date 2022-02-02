package es.daw.seleccioninterface;

import es.daw.seleccioninterface.model.*;
import java.util.ArrayList;

/**
 *
 * @author melol
 */
public class Main {

    public static ArrayList<IntegranteSeleccion> integrantes = new ArrayList<IntegranteSeleccion>();
    public static ArrayList<Participante> participantes = new ArrayList<Participante>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Prueba con participantes que forma parte de la selección 
        integrantes = IntegranteSeleccionDAO.get();
        pruebaSeleccion();
        
        //Prueba con los mismos participantes pero que ya no forman parte de la selección
        participantes = ParticipanteDAO.get();
        pruebaParticipantes();        
    }
    
    private static void pruebaSeleccion() {

        // --------------- CON LA SELECCIÓN ------------------
        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (IntegranteSeleccion integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }

        // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (IntegranteSeleccion integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

        // ENTRENAMIENTO
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (IntegranteSeleccion integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }
        // ----------------------------
        
        // PARTICIPAR
        System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (IntegranteSeleccion integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.participar();
        }
        
        // ----------------------------- MÉTODOS PROPIOS DE CADA PARTICIPANTE ------------------------------
        for (Seleccionable seleccionable : integrantes) {
            if (seleccionable instanceof Entrenador) {
                System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
                // ahora para poder llamar a métodos del objeto, necesito hacer el casting, puesto
                // que la interfaz ya no tiene acceso como tenía la superclase
                System.out.print(((Entrenador) seleccionable).getNombre() + " -> ");

                ((Entrenador) seleccionable).planificarEntrenamiento();
            } else if (seleccionable instanceof Futbolista) {
                System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");

                // ahora para poder llamar a métodos del objeto, necesito hacer el casting, puesto
                // que la interfaz ya no tiene acceso como tenía la superclase
                System.out.print(((Futbolista) seleccionable).getNombre() + " -> ");
                ((Futbolista) seleccionable).entrevista();
            } else if (seleccionable instanceof Masajista) {
                System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
                // ahora para poder llamar a métodos del objeto, necesito hacer el casting, puesto
                // que la interfaz ya no tiene acceso como tenía la superclase
                System.out.print(((Masajista) seleccionable).getNombre() + " -> ");
                ((Masajista) seleccionable).darMasaje();
            }

        }

    }
    
    private static void pruebaParticipantes() {

        // PUESTO QUE LA COLECCION DE participantes está compuesta por objetos que no implementan la interface Seleccionable, no se pueden
        // llamar a los métodos de dicha interface
        // CONCENTRACION
        // VIAJE
        // ENTRENAMIENTO
        System.out.println("\n PARTICIPANTES NO SELECCIONABLES:");

        // Sin embargo, sí que podríamos ejecutar los metodos de la clase padre
        System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (Participante integrante : participantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.participar();
        }

        // ----------------------------- MÉTODOS PROPIOS DE CADA PARTICIPANTE ------------------------------
        for (Participante participante : participantes) {
            if (participante instanceof Entrenador) {
                System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
                // ahora para poder llamar a métodos del objeto, necesito hacer el casting, puesto
                // que la interfaz ya no tiene acceso como tenía la superclase
                System.out.print(((Entrenador) participante).getNombre() + " -> ");

                ((Entrenador) participante).planificarEntrenamiento();
            } else if (participante instanceof Futbolista) {
                System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");

                // ahora para poder llamar a métodos del objeto, necesito hacer el casting, puesto
                // que la interfaz ya no tiene acceso como tenía la superclase
                System.out.print(((Futbolista) participante).getNombre() + " -> ");
                ((Futbolista) participante).entrevista();
            } else if (participante instanceof Masajista) {
                System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
                // ahora para poder llamar a métodos del objeto, necesito hacer el casting, puesto
                // que la interfaz ya no tiene acceso como tenía la superclase
                System.out.print(((Masajista) participante).getNombre() + " -> ");
                ((Masajista) participante).darMasaje();
            }

        }
    }
    
    
}
