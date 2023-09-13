package scopes;

public class UnreachableCode {

    public static void main(String[] args) {
//        throw new RuntimeException(); //code bellow throws becomes unreachable, generating compilation error.
        final boolean flag = false; //Line n1
//        While loop becomes unreachable because flag is final, generating compilation error.
//        while(flag) {
//            System.out.println("Good Morning!"); //Line n2
//        }
        System.out.println("I'm compiling ok");
    }
}
