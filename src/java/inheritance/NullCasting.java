package inheritance;

public class NullCasting {

    public static void doSomething() {
        System.out.println("doing something");
    }

    public static class Child extends NullCasting {
    }

    public static void main(String[] args) {
        NullCasting null1 = null;
        null1.doSomething();
        Child null2 = (Child) null1;
        System.out.println("Null could be casted because NullCasting object is null");
        null2.doSomething();
        NullCasting notNull = new NullCasting();
        try {
            Child null3 = (Child) notNull;
            null3.doSomething();
        } catch (ClassCastException e) {
            System.out.println("Class cast exception is thrown because NullCasting object is not null");
        }
    }
}
