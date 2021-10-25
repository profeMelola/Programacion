/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contarvocales;

/**
 *
 * @author melola
 */
public class ContarVocales2 {

	public static void main(String[] args) {
		
		int[] vocales = new int[5];
		String frase = "esta es mi frase de prueba";
                
                char caracter;
		for(int i=0;i<frase.length();i++){
			caracter = Character.toLowerCase(frase.charAt(i));

			switch (caracter) {
			case 'a':
				vocales[0]++;
				break;
			case 'e':
				vocales[1]++;
				break;
			case 'i':
				vocales[2]++;
				break;
			case 'o':
				vocales[3]++;
				break;
			case 'u':
				vocales[4]++;
				break;
			default:
				break;
			}
		}

		
                System.out.println("*********************\n");
                System.out.println("a)\t" + vocales[0] + "\n");
                System.out.println("e)\t" + vocales[1] + "\n");
                System.out.println("i)\t" + vocales[2] + "\n");
                System.out.println("o)\t" + vocales[3] + "\n");
                System.out.println("u)\t" + vocales[4] + "\n");
        

	}
}