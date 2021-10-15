package strings;

public class String4 {
    
	public static void main(String[] args) {
		String txtOrigin = "James Gosling creó Java";
		//With for traditional
		String txtWithOutSpaces = "";
		for (int i = 0; i < txtOrigin.length(); i++) {
			if (txtOrigin.charAt(i) != ' ') {
				txtWithOutSpaces += txtOrigin.charAt(i);
			}
		}
		System.out.println("Texto original: \t" + txtOrigin + "\t\t Texto resultante:\t" + txtWithOutSpaces);
	    	//With method replace
		txtOrigin = "James Gosling creó Java";
		txtWithOutSpaces = txtOrigin.replace(" ","");
		System.out.println("Texto original: \t" + txtOrigin + "\t\t Texto resultante:\t" + txtWithOutSpaces);
		//With replaceAll
		txtOrigin = "James Gosling creó Java";
		txtWithOutSpaces = "";
		txtWithOutSpaces = txtOrigin.replaceAll("\\s+",""); //equals then txt = txt.replaceAll(" ","");
		System.out.println("Texto original: \t" + txtOrigin + "\t\t Texto resultante:\t" + txtWithOutSpaces);
		//With ReplaceAll + Reggex Expression
		//\s — Representa un espacio en blanco.
		txtOrigin = "James Gosling creó Java";
		txtWithOutSpaces = "";
		txtWithOutSpaces = txtOrigin.replaceAll("\\s+",""); //equals then txt = txt.replaceAll(" ","");
		System.out.println("Texto original: \t" + txtOrigin + "\t\t Texto resultante:\t" + txtWithOutSpaces);
	}
}