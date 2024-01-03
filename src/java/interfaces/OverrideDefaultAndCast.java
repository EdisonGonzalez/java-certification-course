package interfaces;

interface Dancer {
    default void dance() {
        System.out.println("DANCER");
    }
}

interface TapDancer extends Dancer {
    void dance();
}

class ConcreteDancer implements Dancer {
    @Override
    public void dance() {
        Dancer.super.dance();
        // Dancer.dance(); // Static call, dance only exist if exist an instance of Dancer interface
    }
}

public class OverrideDefaultAndCast {
    public static void main(String[] args) {
        TapDancer td = () -> System.out.println("TAPDANCER"); //Line n1
        TapDancer td2 = new TapDancer() {
            @Override
            public void dance() {
                System.out.println("TAPDANCER");
            }
        };
        ((Dancer)td).dance(); //Line n2
        ((Dancer)td2).dance();
    }
}

