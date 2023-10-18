package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NeverendingCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Void> future = es.submit(new Caller());
        System.out.println(future.get());
        Future<String> stringFuture = es.submit(new Runner(), "I'm done");
        System.out.println(stringFuture.get());
        System.out.println("the program won't end until ExecutorService is shutDown");
        es.shutdown();
    }

    public static class Caller implements Callable<Void> {
        @Override
        public Void call() throws Exception {
            System.out.println("starting call execution...");
            return null;
        }
    }

    public static class Runner implements Runnable {
        @Override
        public void run() {
            System.out.println("I'm running the method...");
        }
    }
}
