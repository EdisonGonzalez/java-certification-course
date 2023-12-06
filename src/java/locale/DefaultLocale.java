package locale;

import java.util.Locale;

public class DefaultLocale {

  public static void main(String[] args) {
    System.out.println(Locale.getDefault());
    System.out.println(Locale.getDefault(Locale.Category.FORMAT));
    System.out.printf("Formatted number: %,.2f%n", 123456.79);
    System.out.format("Formatted number: %,.2f%n", 123456.79);
    System.out.println("---Setting default locale format to German---");
    Locale.setDefault(Locale.Category.FORMAT, Locale.GERMANY);
    System.out.println(Locale.getDefault());
    System.out.println(Locale.getDefault(Locale.Category.FORMAT));
    System.out.printf("Formatted number: %,.2f%n", 123456.79);
    System.out.format("Formatted number: %,.2f%n", 123456.79);
    System.out.println("---Setting default locale to German---");
    Locale.setDefault(Locale.GERMANY);
    System.out.println(Locale.getDefault());
    System.out.println(Locale.getDefault(Locale.Category.FORMAT));
    System.out.printf("Formatted number: %,.2f%n", 123456.79);
    System.out.format("Formatted number: %,.2f%n", 123456.79);
  }
}
