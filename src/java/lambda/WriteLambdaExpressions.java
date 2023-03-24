package lambda;

public class WriteLambdaExpressions {
    public interface Operator {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        //Operator opr = (int x, y) -> x + y; // Failed: Cannot resolve symbol y
        Operator opr2 = (x, y) -> { return x + y; };
        //Operator opr3 = (x, y) ->  return x + y; // Failed: Cannot use return with braces
        Operator opr4 = (int x, int y) -> { return x + y; };
        Operator opr5 = (x, y) -> x + y;
        //Operator opr6 = (int x, var y) -> x + y; // Failed: Cannot use different types of parameters
        Operator opr7 = (var x, var y) -> x + y;
        Operator opr8 = Integer::sum; // ----> Remember lambda expression can be converter to method reference and vice-versa
        //Operator opr9 = x, y -> x + y; // Failed: Lambda expression always required parenthesis
    }
}
