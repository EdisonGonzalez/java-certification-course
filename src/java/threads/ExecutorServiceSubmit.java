package threads;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    private Integer i;

    public MyCallable(Integer i) {
        this.i = i;
    }

    public Integer call() throws Exception {
        return --i;
    }
}

class MyThread extends Thread {
    private int i;

    MyThread(int i) {
        this.i = i;
    }

    public void run() {
        i++;
    }
}

public class ExecutorServiceSubmit {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        var es = Executors.newSingleThreadExecutor(); // Variable 'es' infers to ExecutorService type
        var callable = new MyCallable(10); // Variable 'callable' infers to MyCallable type
        var thread = new MyThread(10); // Variable 'thread' infers to MyThread type

        // Method submit is overloaded in ExecutorService interface to accept both Callable and Runnable

        /* <T> Future<T> submit(Callable<T> task):
        Submits a value-returning task for execution and returns a Future representing the pending results of the task.

        The Future's get method will return the task's result upon successful completion.
         */
        System.out.println(es.submit(callable).get()); //

        /* <T> Future<T> submit(Runnable task, T result):
        Submits a Runnable task for execution and returns a Future representing that task.

        The Future's get method will return the given result upon successful completion.

        and,

        Future<?> submit(Runnable task):
        Submits a Runnable task for execution and returns a Future representing that task.
        The Future's get method will return null upon successful completion.
         */
        int iResult = 0;
        System.out.println(es.submit(thread, iResult).get()); // Return the second argument when task completed, because run returns void
        System.out.println(es.submit(thread).get());
        es.shutdown();
    }
}
