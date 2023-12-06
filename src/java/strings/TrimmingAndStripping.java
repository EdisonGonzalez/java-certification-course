package strings;

import java.util.Map;

public class TrimmingAndStripping {

  public static void main(String[] args) {
    Map.of("tab", "\u0009",
            "carriage", "\u000B",
            "no-break space", "\u00A0",
            "quad", "\u2000")
        .forEach((key, value) -> {
          final var string = value + key + value;
          print(string.trim());
          print(string.strip());
        });
  }

  static void print(String string) {
    System.out.println("[" + string + "]");
  }
}
