/**
 * 
 */
package tiposdatos;


public class TiposDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * LITERALES
		 */
		
		//Valor booleano VERDADERO
		boolean resultado = true;
		//Letra C
		char letraMayuscula = 'C';
		//Número 100
		byte by = 100;
		//Número 1000
		short sh = 1000;
                //short sh1 = 1000000; //da error
		//Número 1000000
		int in = 1000000;
                //int in2 = 10000000000; //da error
		
		//Valor 26, en decimal
		int decVal = 26;
		//Valor 26, en hexadecimal
		int hexVal = 0x1a;
		//Valor 26, en binario
		int binVal = 0b11010;
		
		String s = "Hola Mundo";
		
		/*
		 * TIPOS DE DATOS NUM�RICOS
		 */
		
		//TIPOS DE DATOS ENTEROS
		//[-128,127]
		byte b = 28;
		//[-32768,32767]
		short corto = 3458;
		//[-2^31,(2^31)-1]
		int i = 33456;
		//[-2^63,(2^63)-1]
		long l = 3_000_000_000L;
		
		// --------------------------------------------
		//TIPOS DE DATOS REALES
		//Precisión simple
		float f = 0.25f;
                //float f2 = 0.25; //Esto da error
                float f3 = 010; //en binario
                float f4 = 0xff; //en hexadecimal
                
		//Precisión doble
		double Pi = Math.PI;
		double d = 0.25;
                double d2 = 0.25d;

                // ----------------------------------
		//OPERADORES NUMÉRICOS
		int x = 7;
		int y = 5;
		
		//Suma
		int z = x + y;
		System.out.print("Suma ");
		System.out.println(z);
		
		//Resta
		z = x - y;
		System.out.print("Resta ");
		System.out.println(z);
		
		//Multiplicación
		z = x * y;
		System.out.print("Multipliación ");		
		System.out.println(z);
		
		
		//División (entera)
		z = x / y;
		System.out.print("División entera ");		
		System.out.println(z);
		
		//División (no entera)
		double j = Pi/f;
		System.out.println("División con decimales ");
		System.out.println(j);
				
		//Resto
		z = x % y;
		System.out.print("Módulo o resto ");		
		System.out.println(z);
		
		//Incremento
		z = x++;
		System.out.print("Incremento ");		
		System.out.println(z);
		System.out.println(x);
		
		// ---------------------- INTERESANTE DECIMALES -----------------------
		System.out.println("************** EJEMPLOS DECIMALES ****************");
                int num1 = 5;
		int num2 = 9;
		
		System.out.println("* División con decimales (double):"+(double)num1/num2);
                System.out.println("* División con decimales (int):"+num1/num2);
                
                //En este caso no hace falta forzar un casting
                //Cualquier operación aritmética entre dos tipos de datos distintos, 
                //produce como resultado un tipo de datos igual al tipo mayor:
                float float1= 0.25f;
                System.out.println("* División con decimales (float):"+((num1+num2)*float1));
                // -----------------------------------------------------------
                
		// -----------------------------------------------------------
		//OPERADORES A NIVEL DE BITS
                System.out.println("*********** OPERADORES A NIVEL DE BITS******************");
		int bitmask = 0b0011; 
		int val = 0b1111; 
		
		int res = val & bitmask; //0011
		System.out.print("AND ");
		System.out.println(Integer.toBinaryString(res));
		
		res = val ^ bitmask; //1100
		System.out.print("OR exclusivo ");		
		System.out.println(Integer.toBinaryString(res));
				
		res = val | bitmask; //1111
		System.out.print("OR inclusivo ");
		System.out.println(Integer.toBinaryString(res));
		
		// 0b1111
		
		res = val << 1; //11110
		System.out.print("left shift ");		
		System.out.println(Integer.toBinaryString(res));
				
		res = val >> 2; //0011
		System.out.print("Signed rigth shift ");		
		System.out.println(Integer.toBinaryString(res));
		
		
		res = (-val) >> 2; //11111111111111111111111111111100
		System.out.print("Signed rigth shift ");		
		System.out.println(Integer.toBinaryString(res));
				
		res = val >>> 1; //111
		System.out.print("Unsigned rigth shift ");		
		System.out.println(Integer.toBinaryString(res));
		
		res = ~val; //11111111111111111111111111110000
		System.out.print("Inverso o complementario ");
		System.out.println(Integer.toBinaryString(res));
                // -----------------------------------------------------------         
		
                
                // EJEMPLOS DE CASTING IMPLÍCITO
                System.out.println("********* EJEMPLO DE CASTING IMIPLÍCITO ***************");
                //Ambos literales son literales de int, pero cumplen el rango de cada tipo
                byte varPequena = 127; 
                short varGrande = 12365;

                //Convierto de literal int a variable long
                long enteroGrande = 24556;

                //Convierto de tipo long a tipo float
                float decimalSimple = enteroGrande;

                //Convierto de float a double
                double decimalDoble = decimalSimple;

                //Convierto de literal float a double
                double decimalDoble2 = 3.14F;  
                System.out.println("* varPequena: "+varPequena);
                System.out.println("* varGrande: "+varGrande);
                System.out.println("* enteroGrande: "+enteroGrande);
                System.out.println("* decimalSimple: "+decimalSimple);
                System.out.println("* decimalDoble: "+decimalDoble);
                System.out.println("* decimalDoble2: "+decimalDoble2);
                
                System.out.println("********* EJEMPLO DE CASTING EXPLÍCITO ***************");
                //una variable int ocupa 4 bytes, short 2 bytes
                //int entero = 13;
                int entero = 1_000_000_000;
                //int entero_error = 10_000_000_000;
                System.out.println("* entero: "+entero);
                short enteroPequeno = (short)entero;
                //short enteroPequeno = entero; //da error
                System.out.println("* enteroPequeno: "+enteroPequeno);

                long numeroLargo = 13;
                System.out.println("* numeroLargo: "+numeroLargo);                
                entero = (int)numeroLargo;
                System.out.println("* entero: "+entero);
                
                double decimal = 23423.234234;
                System.out.println("* decimal: "+decimal);
                entero = (int) decimal;
                System.out.println("* entero: "+entero);
                
                System.out.println("************* EJEMPLO CON CHARS *****************");
                //Casting implícito
                char letraA = 65; //valor ASCII -> 'A'
                System.out.println("* letraA: "+letraA);
                int valorA = letraA;
                System.out.println("* valorA :"+valorA);

                int valorB = 'B'; //entero ASCII -> 66
                System.out.println("* valorB: "+valorB);

                //Casting explícito
                char letraB = (char)valorB; //convierto de int a char    
                System.out.println("* letraB: "+letraB);
                
                // ------------------- PÉRDIDA DE DATOS --------------
                System.out.println("************ EJEMPLO DE PÉRDIDA DE DATOS ***********");
                int entero2byte = 263; 
                System.out.println("* entero2byte: "+entero2byte);
                byte numeroByte = (byte)entero;
                System.out.println("* numeroByte: "+numeroByte);
                
                //--------------- UNICODE ---------------
                // https://javautodidacta.es/tipos-primitivos-en-java-2/
                System.out.println("************* UNICODE **************");
                char caracter1 = 'Я';
		char caracter2 = 1071; //DECIMAL
		char caracter3 = 0b10000101111; //BINARIO
		char caracter4 = 02057; //OCTAL
		char caracter5 = 0x042F; //HEXADECIMAL
		char caracter6 = '\u042F'; //UNICODE
		char caracter7 = '4';
 
		System.out.println(caracter1);  // я
		System.out.println(caracter2);  // я
		System.out.println(caracter3);  // я
		System.out.println(caracter4);  // я
		System.out.println(caracter5);  // я
		System.out.println(caracter6);  // я
		System.out.println(caracter7);  // 4                
                
	}
}
