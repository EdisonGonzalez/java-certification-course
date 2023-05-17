package annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rating {
    /*INSERT*/
    /**
     * Possibilities:
     *
     * 1. byte value() default 2;
     * 2. char value() default 2;
     * 3. int value() default 2;
     *
     * NOTES:
     *
     * 1. Default is required because class Movie use @Rating without value
     * 2. Possible values: primitive, java.lang.Class, String, array of any previous mention
     *
     */
    int value() default 2;
}

@Rating
class Movie {
}

@Rating(10)
class Food {
}
