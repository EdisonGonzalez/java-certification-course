package strings;

import java.text.DecimalFormat;
import java.util.List;

public class DecimalFormats {
    public static void main(String[] args) {
        final List<Number> numbers = List.of(1, 10, 101, 1_234, 54_321, 100_000, 1.095, 1.096);
        for (Number i: numbers) {
            System.out.println(new DecimalFormat("#####,###,###.###").format(i));
            System.out.println(new DecimalFormat("#,###,###.##").format(i));
            System.out.println(new DecimalFormat("#,###.#").format(i));
            System.out.println(new DecimalFormat("0,000,000.000").format(i));
            System.out.println(new DecimalFormat("0000,000.00").format(i));
            System.out.println(new DecimalFormat("0000,000.0").format(i));
            System.out.println(new DecimalFormat("#.###E0").format(i));
            System.out.println("---");
        }
    }
}
