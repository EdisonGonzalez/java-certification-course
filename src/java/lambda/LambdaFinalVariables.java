package lambda;

import java.util.function.Consumer;

public class LambdaFinalVariables {

  static class Wrapper {
    int j = 1;
    void increase() {
      j +=1;
    }

    @Override
    public String toString() {
      return String.valueOf(j);
    }
  }

  public static void main(String[] args) {
    int i = 1;
    var wrapper = new Wrapper();
    final Runnable runnableInt = () -> System.out.println(i);
    runnableInt.run();
//    i++; //cannot change value of i since is being used in a lambda;
    final Runnable runnableWrapper = () -> System.out.println(wrapper);
    runnableWrapper.run();
    wrapper.increase();
//    wrapper = new Wrapper(); //cannot change value of wrapper since is being used in a lambda;
    System.out.println(wrapper);
  }
}
