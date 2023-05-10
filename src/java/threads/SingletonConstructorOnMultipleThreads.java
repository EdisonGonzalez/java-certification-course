package threads;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingletonConstructorOnMultipleThreads {

    public static void main(String[] args) {
        var es = Executors.newFixedThreadPool(100);
        IntStream.rangeClosed(1, 10000)
                .parallel()
                .forEach(x -> es.submit(Util::get));
        int didNotRun = es.shutdownNow().size(); // es.shutdown() returns void
        System.out.printf("get method was called %s times%n", Util.counter);
        System.out.printf("there were %s tasks that did not run%n", didNotRun);
        System.out.printf("the sum of both numbers is %s", (Util.counter + didNotRun));
        //Line n1
    }
}

class Util {
    int ctr = 0;
    static int counter = 0;
    private static Util obj;
    private Util() {
        ++ctr;
        System.out.printf("The constructor should be called only once, ctr is: %s%n", ctr);
    }
    static synchronized Util get() {
        if(obj == null) obj = new Util();
        counter ++;
        return obj;
    }
}