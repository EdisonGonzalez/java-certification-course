package types;

public class WideningByDefaultWithExceptions {
    public static void main(String[] args) {
        byte by = 1;
        short sh = by;
        // char ch1 = by; // char Cannot be initialized from byte even if it's larger
        // char ch1 = sh; // char Cannot be initialized from byte even if it's larger
        char ch = 'a';
    }
}
