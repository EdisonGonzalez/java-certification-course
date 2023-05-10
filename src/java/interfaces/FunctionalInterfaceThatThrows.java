package interfaces;

import java.io.IOException;

@FunctionalInterface
public interface FunctionalInterfaceThatThrows {

    void doSomethingMayThrow() throws IOException;
}
