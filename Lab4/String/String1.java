package strings;

public class String1 {
	public static void main(String[] args) {
		String txt = "This is Java!";
		//With for traditional
		int counter = 0;
		for (int i = 0; i < txt.length(); i++) {
			counter++;
		}
		System.out.println("\tTexto: " + txt + "\tLontitud: \t" + counter);
		//With length() 
		System.out.println("\tTexto: " + txt + "\tLontitud: \t" + txt.length());
	}
}