package lambda;

abstract class Greetings {
    abstract void greet();
}

public class AbstractClassLambda {
    public static void main(String[] args) {
        var obj = new Greetings() {
            @Override public void greet() {
                System.out.println("BELIEVE IN YOURSELF");
            }
        };
//        Greetings obj2 = () -> System.out.println("believe"); //Not allowed on abstract class
        obj.greet();
    }
}