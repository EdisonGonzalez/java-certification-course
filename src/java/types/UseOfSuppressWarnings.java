package types;

import java.util.ArrayList;
import java.util.List;

public class UseOfSuppressWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Integer> list = create();
    }

    /*INSERT-2*/
    private static List create() {
        return new ArrayList<>();
    }
}
