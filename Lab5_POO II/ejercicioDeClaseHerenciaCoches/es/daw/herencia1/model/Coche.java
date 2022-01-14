/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.herencia1.model;

import java.util.Objects;

/**
 *
 * @author melola
 */
public class Coche extends Vehiculo {

    //Campos específicos de Coche
    private int cilindrada;
    private String matricula;

    public Coche(int km, int ruedas, int cilindrada, String matricula) {
        super(km, ruedas);
        this.cilindrada = cilindrada;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Metodos específicos de Coche
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    // OTRO MÉTODOS. COMPORTAMIENTO
    @Override
    public void arrancar() {
        super.arrancar();
        System.out.println("Coche arrancado...");
    }

    public void mostrarDatos() {
        //puedo acceder al atributo matricula
        System.out.println("La matricula del coche es: " + matricula);

        //No puedo acceder al atributo kilometros
        System.out.println("Los km del coche son: " + getKm()); //Error de compilación
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Coche otroCoche = (Coche) obj;

        if (this.matricula.equals(otroCoche.matricula)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

}
