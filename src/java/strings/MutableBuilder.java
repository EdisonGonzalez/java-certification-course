package strings;

public class MutableBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("HavePatience");
    sb.delete(4, 5).insert(4, " P").toString().toUpperCase();
    System.out.println(sb);
  }
}
