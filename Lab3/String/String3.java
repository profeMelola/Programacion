package strings;

public class String3 {
	public static void main(String[] args) {
		String txt = "James Gosling creó Java";
		//With for traditional
		String txtTmp = "";
		for (int i = txt.length()-1; i >= 0 ; i--) {
			txtTmp += (txt.charAt(i));
		}
		System.out.println("\tTexto original: " + txt + "\tRevertido: \t" + txtTmp);
		//With StringBuilder and Reverse()
		StringBuilder stringBuiler = new StringBuilder(txt);
		System.out.println("\tTexto original: " + txt + "\tRevertido: \t" + stringBuiler.reverse());
	}
}