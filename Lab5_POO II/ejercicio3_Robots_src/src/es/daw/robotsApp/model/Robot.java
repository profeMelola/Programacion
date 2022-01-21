package es.daw.robotsApp.model;

/**
 *
 * @author melola
 */
//public class Robot {        
public abstract class Robot {
    private String nombre;
    private String color;
    
    public Robot(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /*
    // SIN MÉTODO ABSTRACTOS
    public void mover(){
        System.out.println("Robot en movimento...");
    }
    
    public void hablar(){
        System.out.println("Robot hablando...");
    }*/
    
    public final void parar(){
        System.out.println("Oooohh me paran. A dormir");
    }
    
    /*public void hablar(String msg){
        System.out.println("Robot hablando...");
    }*/
    
    
    //MÉTODOS ABSTRACTOS
    public abstract void mover();
    
    public abstract void hablar();
    
}
