/**
 * Practicando con diferentes tipos de datos
 */
package tiposdatos;


public class TiposDatosLogicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	//OPERADORES LÓGICOS CONDICIONALES
	int valor1 = 1;
        int valor2 = 2;
		
        //PRIMEROS PASOS CON SENTENCIAS CONDICIONALES
        if((valor1 == 1) && (valor2 == 2))
            System.out.println("valor1 es 1 AND valor2 es 2");
        if((valor1 == 1) || (valor2 == 1))
            System.out.println("valor1 es 1 OR valor2 es 1");
		
        // ------------------------------------------
        //OPERADOR "TERNARIO"
	/* EJEMPLO
	  Caso 1 (simple):
	  
	  if (x>y)
   		mayor = x;
	   else
   		mayor = y;
	
	  Caso 2 (ternario):
	  	mayor=(x>y)?x:y;
	  */
	
	// ¿Qué valor pensáis que va a contener result?
        int result;
        boolean someCondition = false;
        result = someCondition ? valor1 : valor2;
        System.out.println(result);
	// ------------------------------------------
        
        
        //OPERADORES LÓGICOS RELACIONALES
        if(valor1 == valor2)
            System.out.println("valor1 == valor2");
        if(valor1 != valor2)
            System.out.println("valor1 != valor2");
        if(valor1 > valor2)
            System.out.println("valor1 > valor2");
        if(valor1 < valor2)
            System.out.println("valor1 < valor2");
        if(valor1 <= valor2)
            System.out.println("valor1 <= valor2");

	}
}
