package exceptions;

import java.io.PrintWriter;

public class TryWithNullResource {

    public static void main(String[] args) {
        try(PrintWriter writer = null) {
            System.out.println("HELLO");
        }
    }

    /*Resources are initialized in left-to-right order. If a resource fails to initialize (that is, its initializer
    expression throws an exception), then all resources initialized so far by the try-with-resources statement are
    closed. If all resources initialize successfully, the try block executes as normal and then all non-null resources
    of the try-with-resources statement are closed.
    Resources are closed in the reverse order from that in which they were initialized. A resource is closed only if it
    initialized to a non-null value. An exception from the closing of one resource does not prevent the closing of other
    resources. Such an exception is suppressed if an exception was thrown previously by an initializer, the try block,
    or the closing of a resource.
    https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.20.3
    * */
}
