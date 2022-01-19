/**
 * EJEMPLO DE COMPARACI�N DE DOS INSTANCIAS DE UNA CLASE QUE TIENE
 * IMPLEMENTADO EL M�TODO EQUALS
 */
package es.daw.herenciaObject.toString;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Persona s� que tiene implementado el m�todo equals
		PersonaV3 rafaNadal = new PersonaV3("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		PersonaV3 otroRafaNadal = new PersonaV3("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		PersonaV3 rogerFederer = new PersonaV3("Roger", "Federer", LocalDate.of(1981, 8, 8));

		System.out.println(rafaNadal); //Invocamos impl�citamente a .toString
		System.out.println(otroRafaNadal);
		System.out.println(rogerFederer);

	}

}
