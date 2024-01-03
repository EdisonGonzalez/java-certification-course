package math;

public class DoubleNullPointerException {
  public static void main(String[] args) {
    //var arr = new Double[2];
    Double num = null;
    //System.out.println(arr[0] + arr[1]);
    //System.out.println(num.doubleValue()); // NullPointerException
    System.out.println(num.toString()); // NullPointerException
  }
}
