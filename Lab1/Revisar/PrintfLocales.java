/**
 * Revisar printf: formatting output
 * Revisar clase Locale
 */
import Java.util.Locale;

public class PrintfLocales {

    public static void main(String args[]) {
        System.out.printf("%.2f: Default locale\n", 3.1415926535);
        System.out.printf(Locale.GERMANY, "%.2f: Germany locale\n", 3.1415926535);
        System.out.printf(Locale.US, "%.2f: US locale\n", 3.1415926535);
    }

}
