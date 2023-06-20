package scopes;

public class NestedClasses {
    public static void main(String[] args) {
        Outer.StaticClass staticClass = new Outer.StaticClass();
        Outer.StaticClass staticClass2 = new Outer.StaticClass();
        staticClass2.augment();
        staticClass.printSomething();
        staticClass2.printSomething();
        Outer outer = new Outer();
        Outer.NotStaticClass notStaticClass = new Outer(). new NotStaticClass();
        Outer.NotStaticClass notStaticClass2 = outer.new NotStaticClass();
        Outer.NotStaticClass notStaticClass3 = outer.new NotStaticClass();
        System.out.println(Outer.staticNumber);
        Outer.StaticClass.staticMethod();
        notStaticClass2.augment();
        notStaticClass.printSomething();
        notStaticClass2.printSomething();
        notStaticClass3.printSomething();
    }
}

class Outer {
    static {
        System.out.println("static initializer of outer class");
//        Object object = null;
//        object.toString(); any problem during static initialization will throw ExceptionInInitializerError
    }
    int notStaticNumber = 0;
    static int staticNumber = 0;
    static void staticMethod() {
        System.out.println("this is a static method");
    }

    public Outer() {
        System.out.println("constructor of outer class");
    }
    static class StaticClass {
        int counter = 0;
        public void printSomething() {
//            notStaticNumber = notStaticNumber; We do not have access to not static attributes of the parent class
            staticNumber = staticNumber; // we have access to static attributes of the parent class
            System.out.println("I'm a static class: " + counter);
        }

        public static void staticMethod() {
            System.out.println("this is a static method inside the static class");
        }

        public void augment() {
            counter++;
        }
    }

    class NotStaticClass {
        int counter = 0;
        public void printSomething() {
            notStaticNumber = notStaticNumber; // we have access to not static attributes of the parent class
            staticNumber = staticNumber; // we have access to static attributes of the parent class
            System.out.println("I'm not a static class: " + counter);
        }

        public void augment() {
            counter++;
        }
    }
}


