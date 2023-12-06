package scopes;

import java.util.function.Consumer;

public class ClassInsideMethod {

  public void print(int x) {
    class Inner {
      public void getX() {
//        System.out.println(++x); //cannot use x because it is not effectively final
        System.out.println(x);
      }


    }
//    final Consumer<Void> lambda = unused -> System.out.println(++x); //same thing}
    final Consumer<Void> lambda = unused -> System.out.println(x);
    Inner inner = new Inner();
    inner.getX();
  }
}
