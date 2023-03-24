package compare;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        char [] arr1 = {'A'};
        char [] arr2 = {'A', 'A', 'A', 'A'};
        /*
         * NOTE: There isn´t compare method for collection List
         */
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.compare(arr2, arr1));
    }
}
