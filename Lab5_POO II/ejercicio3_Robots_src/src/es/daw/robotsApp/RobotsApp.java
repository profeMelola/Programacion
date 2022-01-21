package es.daw.robotsApp;

/*import es.daw.robotsApp.model.R2;
import es.daw.robotsApp.model.TresPO;*/

import es.daw.robotsApp.model.*;

/**
 *
 * @author melola
 */
public class RobotsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Robot miRobot = new Robot("mari","verde"); //No me deja por ser clase abstracta
        TresPO c3po = new TresPO("c3po","dorado","español");
        R2 r2d2 = new R2("R2D2","blanco y azul","Sálvanos Obi wan, eres nuestra últimia esperanza");
        
        c3po.hablar();
        c3po.mover();
        c3po.traducir();
        c3po.parar();

        
        r2d2.hablar();
        r2d2.mover();
        r2d2.reparar();
        r2d2.parar();
        
        miRobot.parar();
        
        
        
    }
    
}
