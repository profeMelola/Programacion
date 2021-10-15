package strings;

public class String6 {
	public static void main(String[] args) {
		String txt = "Me gusta programar en Java";
		String txtPartI = txt.substring(0, 18); 
		String txtPartII = txt.substring(18); 
		System.out.println(txtPartI); 
		System.out.println(txtPartII); 
		System.out.println(txtPartI.concat(txtPartII)); 
	}
}