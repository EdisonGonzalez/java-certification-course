package interfaces;

import java.io.IOException;

public class OverrideAndThrows implements FunctionalInterfaceThatThrows{

    @Override
    public void doSomethingMayThrow() {
        System.out.println("I'm doing something");
    }

    public static void main(String[] args) {
        new OverrideAndThrows().doSomethingMayThrow();
        FunctionalInterfaceThatThrows interfaceThatThrows = new OverrideAndThrows();
        try {
            interfaceThatThrows.doSomethingMayThrow(); // Compilation error ensure that is surrounded on try catch
            // , or added to the method signature
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
