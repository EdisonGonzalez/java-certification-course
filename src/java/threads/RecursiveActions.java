package threads;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RecursiveActions {

  private static class Adder extends RecursiveAction {
    private final int from;
    private final int to;
    int total = 0;

    public Adder(int from, int to) {
      this.from = from;
      this.to = to;
    }

    @Override
    protected void compute() {
      if ((to - from) <= 4) {
        int sum = 0;
        for(int i = from; i <= to; i++) {
          sum += i;
        }
        total+=sum;
      } else {
        int mid = (from + to) / 2;
        Adder first = new Adder(from, mid);
        Adder second = new Adder(mid + 1, to);
        invokeAll(first, second);
        total += first.total + second.total;
      }
    }
  }

  public static void main(String[] args) {
    final var adder = new Adder(1, 100_000_000);
    var pool = new ForkJoinPool(8);
    pool.invoke(adder);
    final var start = System.nanoTime();
    System.out.println(adder.total);
    System.out.printf("Time elapsed = %s", new DecimalFormat(",###").format(System.nanoTime() - start));
  }
}
