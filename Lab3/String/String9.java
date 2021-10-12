package strings;

public class String9 {
	public static void main(String[] args) {
		String txt = "Jeve mola";
		String txtModified = "";
		//With for traditional
		txtModified = "";
		System.out.println("---------------------------------------------");
		for (int i = 0; i < txt.length(); i++) {
			if(txt.charAt(i) == 'e') {
				txtModified += 'a';
			}else {
				txtModified += txt.charAt(i);
			}
		}
		System.out.println("Texto original: \t" + txt);
		System.out.println("Texto reemplazado: \t" + txtModified);
		System.out.println("---------------------------------------------");
		//With forEach traditional
		txtModified = "";
		for (char character : txt.toCharArray()) {
			if(character == 'e') {
				character = 'a';
			}
			txtModified += character;
		}
		System.out.println("Texto original: \t" + txt);
		System.out.println("Texto reemplazado: \t" + txtModified);
		//With replace
		System.out.println("---------------------------------------------");
		System.out.println("Texto original: \t" + txt);
		System.out.println("Texto reemplazado: \t" + txt.replace('e', 'a'));
		System.out.println("---------------------------------------------");
	}
}