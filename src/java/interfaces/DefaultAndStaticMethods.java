package interfaces;

public class DefaultAndStaticMethods {
    public static void main(String[] args) {
        InterfaceWithStaticAndDefault.staticPrint();
        ImplementingClass implementingClass = new ImplementingClass();
        implementingClass.defaultPrint();
        implementingClass.staticPrint();
        InterfaceWithStaticAndDefault implementation = new ImplementingClass();
//        implementation.staticPrint();
    }
}

interface InterfaceWithStaticAndDefault {
    public static int number = 1;

    public static void staticPrint() {
        System.out.println("on public static method print");
    }

    public default void defaultPrint() {
        System.out.println("on default method print");
        privateVoid();
        System.out.println(number);
    }

    private void privateVoid() {
        System.out.println("doing something on private Method");
    }

//    void packageDefaultVoid() {
//    }

//    static default void unvalidMethod() {}
}

class ImplementingClass implements InterfaceWithStaticAndDefault {
    public void staticPrint() {
        System.out.println("on public method of the implementing class");
    }
}
