package strings;

public class Substring {
    public static void main(String[] args) {
        // ---- Like Iterator ---> POS:  0    1    2    3    4
        String str = new String(new char[]{'W', 'o', 'r', 'd'});
        String subStr1 = str.substring(0, 0);
        String subStr2 = str.substring(0, 1);
        String subStr3 = str.substring(1, 1);
        String subStr4 = str.substring(0, 4);
        System.out.printf("Substring 1: %s, 2: %s, 3: %s, 4: %s \n", subStr1, subStr2, subStr3, subStr4);
        str.substring(0, 5); // StringIndexOutOfBoundsException - endIndex should be maximum equal to the length
    }
}
