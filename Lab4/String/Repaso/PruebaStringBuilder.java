/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebastringbuilder;

/**
 *
 * @author melola
 */
public class PruebaStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PRUEBAS CON STRINGBUILDER ...........
        
        StringBuilder texto = new StringBuilder("Otra prueba");
        
        texto.append(" mas");
        
        System.out.println(texto);
        
        texto.insert(2, "1"); //empieza por 0 
        
        System.out.println("Ahora es: "+texto);
        
        texto.reverse();
        
        System.out.println("Y ahora:"+texto);
        
        System.out.println("Finalmente en mayúsculas:"+texto.toString().toUpperCase());
        System.out.println("");
        
        // -------------------------------
        // PRUEBAS CON STRING .............
        String cadena = "Cadena de ejemplo";
        
        // reemplazar caracteres
        cadena = cadena.replaceAll(" ", "-");
        System.out.println("Cadena con espacios reemplazados:"+cadena);
        
        int indiceBuscar = cadena.indexOf("ejemplo");
        
        System.out.println("indiceBuscar:"+indiceBuscar);
        String nuevaCadena = cadena.substring(0, indiceBuscar);
        
        System.out.println("Nueva cadena:"+nuevaCadena);
        
        nuevaCadena += "ejemplo2";
        
        System.out.println(nuevaCadena);
        
        
        
        
    }
    
}
