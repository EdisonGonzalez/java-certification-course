package strings;

/*
 * Please note that Strings computed by concatenation at compile time, will be referred by String Pool during execution.
 * Compile time String concatenation happens when both of the operands are compile time constants, such as literal, final variable etc
 */
public class StringPool {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1; // i1 is a final variable of int type and s1 is a final variable of String type
        // Strings computed by concatenation at run time (if the resultant expression is not constant expression)
        // are newly created and therefore distinct
        String str2 = i2 + s1; // is not a constant expression because i2 is neither of primitive type nor of String type, hence it is computed at run-time and returns a non-pool String object "1:ONE"

        var comp1 = str1 == "1:ONE";
        var comp2 = str2 == "1:ONE";


        System.out.println(comp1);
        System.out.println(comp2);

        assert (comp1);
        assert (!comp2);
    }
}
