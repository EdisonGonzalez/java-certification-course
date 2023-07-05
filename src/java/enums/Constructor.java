package enums;

public class Constructor {
    public static void main(String[] args) {
        //Each Enum value represents an instance of the created Enum class. This means that every one of the
        //values need to be constructed via the class constructor.
        //Sidenote: every instance gets a public final static treatment for usage.
        GenericEnum genericEnum = GenericEnum.VALUE1;
    }
}
