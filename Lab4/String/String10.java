package strings;

public class String10 {
	public static void main(String[] args) {
		String txt = "ABCD abcd";
		//With for traditional
		for (int i = 0; i < txt.length(); i++) {
			System.out.println("ASCII: " + (int) txt.charAt(i) + " es equivalente a: " + txt.charAt(i));
		}
		//With forEach
		System.out.println("---------------------------------------------");
		for (char charater : txt.toCharArray()) {
			System.out.println("ASCII: " + (int) charater + " es equivalente a: " + charater);
		}
		System.out.println("---------------------------------------------");
	}
}