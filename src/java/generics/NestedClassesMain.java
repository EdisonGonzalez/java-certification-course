package generics;

public class NestedClassesMain {

    public static void main(String[] args) {
        new StaticGenericFields.StaticNestedClass<>("string");
        new StaticGenericFields<>("string").new NestedClass().getT();
    }
}
