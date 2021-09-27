public class BucleForChar1 {
  public static void main(String args[]) {
    char b = 0x0041;
    System.out.println("Valor de b:"+b);
    for(String a = "A"; !a.equals("ABC"); a += b) {
	    System.out.println(a);
	    b++;
    }
    System.out.println("FUERA DEL BUCLE");
  }
}
