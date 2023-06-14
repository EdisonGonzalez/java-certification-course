package exceptions;

public class TryWithResources {

    public static void main(String[] args) {
        try (Resource resource1 = new Resource("1"); Resource resource2 = new Resource("2")) {
            try(Resource resource3 = new Resource("3")) {
                throw new RuntimeException("We are not ok");
            }
        }
    }

    public static class Resource implements AutoCloseable {

        final String name;

        public Resource(String name) {
            this.name = name;
        }

        @Override
        public void close() {
            System.out.println("close method will be called before throwing any Exception");
            throw new RuntimeException("Expected exception while closing " + name);
        }
    }
}