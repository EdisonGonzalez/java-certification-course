package interfaces;

//Interfaces have only public static final attributes, and cannot define constructors.
//Methods can be implemented using default and methods can be private.
interface Creator<T> {
    T create();
}

//Abstract classes can non public, static or final attributes; can define constructors and can also implement
//methods.
abstract class Gift {
    public Gift() {
        super();
    }

    public String toString() {
        return "Gift";
    }
}

class Book extends Gift {
    public Book() {
        super();
    }

    public String toString() {
        return "Book";
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
//        Creator<Gift> obj = Gift::new; //Does not compile
//        Creator<Gift> obj = Book::new;
        Creator<Gift> obj = () -> new Gift() {};
        System.out.println(obj.create());
    }
}
