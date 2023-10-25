package collections;

import java.util.List;

public class UnsupportedOperation {
    public static void main(String[] args) {
        var festivals = List.of("DIWALI", "CHRISTMAS", "EID");
        festivals.removeIf(str -> str.length() == 4);
        System.out.println(festivals);
    }
}
