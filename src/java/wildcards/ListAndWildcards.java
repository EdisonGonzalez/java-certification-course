package wildcards;

import java.util.ArrayList;
import java.util.List;

class Level1 {
    protected int number;
    public void method1() {};
}

class Level2 extends Level1 {
    public void method2() {};
}

class Level3 extends Level2 {
    public void method3() {};
}

public class ListAndWildcards {
    public static void main(String[] args) {
        //Not bounded
        final List<?> notBounded = new ArrayList<>(List.of(1, new Level1(), new Level2(), new Level3(), new Object()));
//        notBounded.add(1); cannot add anything to the list.

        //Upper bounded
        final List<? extends Level2> extendNumbers = new ArrayList<>(List.of(new Level2(), new Level3()));
        final List<? extends Level2> extendOtherNumbers = new ArrayList<>(List.of(new Level3()));
        //upper bounded lists cannot be populated by any class because the compiler does not know the actual list type.
//        extendNumbers.addAll(extendOtherNumbers);
//        extendNumbers.add(new Level2());
//        extendNumbers.add(new Level3());
//        extendNumbers.add(new Level1());
//        extendNumbers.add(new Object());
        extendNumbers.get(0).method1(); //upper bounded lists can be read on its upper bound
        extendNumbers.get(0).method2();

        //Lower bounded
        final List<? super Level2> superNumbers = new ArrayList<>(List.of(new Level1(), new Level2(), new Level3(), new Object()));
//        superNumbers.add(new Object()); //Object cannot be added
//        superNumbers.add(new Level1()); //level 1 cannot be added
        superNumbers.add(new Level2());
        superNumbers.add(new Level3());
//        superNumbers.get(0).method1(); //cannot use any method besides object methods.
        superNumbers.forEach(System.out::println);

        //Generic
        TypedClass<Integer> typedClass = new TypedClass<>();
        List<Integer> integers = List.of(1, 2, 3);
        typedClass.thisOneCompiles(integers, 4);
//        typedClass.thisOneCompiles(integers, new Number()); Number is not an Integer
    }
}

class TypedClass<T extends Number> {

    public void thisOneCompiles(List<T> tlist, T otherT) {
        tlist.add(otherT);
        System.out.println(tlist);
    }
}
