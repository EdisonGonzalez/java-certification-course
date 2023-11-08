package inheritance;

public class AutoCloseableImplementation implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("closing");
    }

    public static void main(String[] args) {
        try (AutoCloseable implementation = new AutoCloseableImplementation()) {
            System.out.println("I'll do nothing");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (AutoCloseableImplementation implementation = new AutoCloseableImplementation()) {
            System.out.println("I still do nothing");
        }
    }
}
