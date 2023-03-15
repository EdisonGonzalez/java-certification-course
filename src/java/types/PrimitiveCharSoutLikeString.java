package types;

public class PrimitiveCharSoutLikeString {
  public static void main(String[] args) {
    int[] arr1 = {10, 100, 1000}; // Line n1
    char[] arr2 = {'x', 'y', 'z'}; // Line n2
    // arr1 = arr2; // Line n3
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " "); // Line n4
      System.out.print(
          arr2[i]
              + " "); // Line n4 / Autobox char to Character, call toString method in object -
                      // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toString--
    }
  }
}
