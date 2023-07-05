package strings;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        //If the regex is the same word as the original, the result will be empty
        //If the regex is a substring of the original word, the result will at least have a length of 1
        //If the regex does not match a substring on the original word, the result will be an array with the original word only
        final String myString = "aeiou-aeiou";
        final String subString = "eio";
        final String subString2 = "aeio";
        final String subString3 = "eiou";
        final String otherString = "aeiou";
        System.out.println(Arrays.asList(myString.split(subString)));
        System.out.println(Arrays.asList(myString.split(subString2)));
        System.out.println(Arrays.asList(myString.split(subString3)));
        System.out.println(Arrays.asList(myString.split(otherString)));
        System.out.println(Arrays.asList(myString.split(myString)));
        System.out.println(Arrays.asList(myString.split("bcd")));
    }
}
