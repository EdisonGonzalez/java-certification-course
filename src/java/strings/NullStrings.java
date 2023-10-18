package strings;

public class NullStrings {
    public static void main(String[] args) {
        Object nullObject = null;
        String string = nullObject + " hardcoded text: every null object gets printed as null";
        System.out.println(string);
    }
}
