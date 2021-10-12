package strings;


public class String2 {
	public static void main(String[] args) {
		String txt = "Java";
		//With for traditional
		for (int i = 0; i < txt.length(); i++) {
			System.out.println(txt.charAt(i));
		}
		//With forEach traditional
		System.out.println("-------------------------");
		for (char character : txt.toCharArray()) {
			System.out.println(character);
		}
	}
}