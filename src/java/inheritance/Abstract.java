package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A {}

class B extends A {}

abstract class Super {
  abstract List<A> get() throws IndexOutOfBoundsException;
}

abstract class Sub extends Super {
  /*
   Few things to keep in mind:
   1. There are 2 rules related to return types of overriding method:
      A. If return type of overridden method is of primitive type, then overriding method should use same primitive type.
      B. If return type of overridden method is of reference type, then overriding method can use
      same reference type or its sub-type (also known as covariant return type).

   2. In case of overriding, if overridden method declares to throw any RuntimeException or Error,
   overriding method may or may not throw any RuntimeException but overriding method must not throw any checked exceptions.

   3. In generics syntax, Parameterized types are not polymorphic, this means even if B is subtype of A,
   List<B> is not subtype of List<A>. Remember this point. So below syntax are NOT allowed:
       List<A> list = new ArrayList<B>(); OR ArrayList<A> list = new ArrayList<B>();
  */
  // abstract ArrayList<B> get(); // Error
  // abstract List<B> get(); // Error
  abstract List<A> get() throws ArrayIndexOutOfBoundsException;
  // abstract ArrayList<A> get() throws Exception; // Error
}

public class Abstract extends Sub {
  @Override
  List<A> get() throws ArrayIndexOutOfBoundsException {
    return Collections.emptyList();
  }

  public static void main(String[] args) {
    var abs = new Abstract();
    System.out.println(abs.get());
  }
}
