package es.daw.enumeradosequipo.enumerados;

/**
 * Es muy importante entender que un "Enum" en java es realmente una clase 
 * (cuyos objetos solo pueden ser los definidos en esta clase: PORTERO, …, DELANTERO) 
 * que hereda de la clase "Enum(java.lang.Enum)" y por tanto los enumerados tienen una serie de métodos heredados de esa clase padre
 * @author melol
 */
public enum Demarcacion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}
