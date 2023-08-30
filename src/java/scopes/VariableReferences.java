package scopes;

import java.time.LocalDate;
import java.util.Objects;

public class VariableReferences {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.EPOCH; //immutable
        final String firstValue = "firstValue";
        SuperObject superObject = new SuperObject(firstValue);
        System.out.println("Object created");
        System.out.printf("hash: %s%n", superObject);
        System.out.printf("hash: %s | value: %s%n", Objects.hash(superObject.attribute1), superObject.attribute1);
        final SuperObject memory = superObject;
        doSomething(superObject);
        System.out.println("After the method");
        System.out.printf("hash: %s%n", memory);
        System.out.printf("hash: %s | value: %s%n", Objects.hash(memory.attribute1), memory.attribute1);
        System.out.printf("hash: %s%n", superObject);
        System.out.printf("hash: %s | value: %s%n", Objects.hash(superObject.attribute1), superObject.attribute1);
        System.out.println(memory.equals(superObject));
    }

    private static void doSomething (SuperObject superObject) {
        System.out.println("Inside the method, update attribute");
        superObject.setAttribute1("newValue");
        System.out.printf("hash: %s%n", superObject);
        System.out.printf("hash: %s | value: %s%n", Objects.hash(superObject.attribute1), superObject.attribute1);
        System.out.println("Initialize new object");
        superObject = new SuperObject("Newer attribute");
        System.out.printf("hash: %s%n", superObject);
        System.out.printf("hash: %s | value: %s%n", Objects.hash(superObject.attribute1), superObject.attribute1);
    }


    private static class SuperObject {
        public String attribute1;

        public SuperObject(String attribute1) {
            this.attribute1 = attribute1;
        }

        public void setAttribute1(String attribute1) {
            this.attribute1 = attribute1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SuperObject)) return false;
            return attribute1.equalsIgnoreCase(((SuperObject) o).attribute1);
        }

        @Override
        public int hashCode() {
            return Objects.hash(attribute1);
        }
    }
}
