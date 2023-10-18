package scopes;

public class UnreachableCode {

    public static void main(String[] args) {
//        throw new RuntimeException(); //code bellow throws becomes unreachable, generating compilation error.
        final boolean finalFlag = false; //Line n1
        boolean flag = true;
//        While loop becomes unreachable because flag is final, generating compilation error.
//        while(finalFlag) {
//            System.out.println("Good Morning!"); //Line n2
//        }

        int number;
        if (!finalFlag) System.out.println("This line is always executed");
        if (flag) {
            System.out.println("This line is also always executed, but compiler does not know it");
            number = 1;
        }
//        This line causes compilation error because compiler does not know number will always be initialized
//        System.out.println(number);
        System.out.println("I'm compiling ok");
    }
}
