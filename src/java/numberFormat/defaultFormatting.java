package numberFormat;

import java.text.NumberFormat;

public class defaultFormatting {
    public static void main(String [] args) {
        var nf = NumberFormat.getIntegerInstance();
        System.out.println(nf.format(-1.5).equals(nf.format(-2.5)));
        System.out.println(nf.format(0.5)); //0 counts as even in this case
    }
}
