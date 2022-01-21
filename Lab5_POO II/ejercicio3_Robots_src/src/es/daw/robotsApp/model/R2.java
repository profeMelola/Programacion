/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.robotsApp.model;

/**
 *
 * @author melola
 */
public class R2 extends Robot{
    private String mensaje;
    
    public R2(String nombre, String color, String mensaje){
        
        //Primera
        super(nombre,color);
        
        // Segunda forma
        /*setNombre(nombre);
        setColor(color);*/
        //this.color = color; //da error porque es privado
        
        this.mensaje = mensaje;
    }
    
    /*
    @Override
    public void mover(){
        System.out.println("R2 se mueve rápido");
    }
    
    @Override
    public void hablar(){
        System.out.println(mensaje);
    }*/
    
    public void reparar(){
        System.out.println("R2 reparando");
    }
    
    public void mover(){
        System.out.println("R2 se mueve rápido");
    }
    
    public void hablar(){
        System.out.println(mensaje);
    } 
    
    /*@Override
    public void parar(){
        System.out.println("parooooooooooooo");
    }*/
    
}
