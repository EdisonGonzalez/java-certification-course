package generics;

public class StaticGenericFields<T> {
//    static T t; //T type cannot be static because the assignation of the T type will be done upon construction.

    private final T t;

    public StaticGenericFields(T t) {
        this.t = t;
    }

    public static <R> StaticGenericFields<R> of(R r) {
        return new StaticGenericFields<>(r); //In this specific instance of the class T will be equal to R;
    }

    class NestedClass {
//        static T t; //static generic fields are also not available on nested classes

        public T getT() {
            return t;
        }
    }

    static class StaticNestedClass<U> {
        public final U u;

        StaticNestedClass(U u) {
            this.u = u;
        }
    }
}
