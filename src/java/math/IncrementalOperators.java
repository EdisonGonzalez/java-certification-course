package math;

public class IncrementalOperators {

    public static void main(String[] args) {
        int i = 0;
        if (i++ == i++) System.out.println("This if clause is always false");

        i=0;
        int j = i; i = i+1; int k = i; i = i+1; boolean b = j == k;
        System.out.printf("%s==%s? -> %s%n", j, k, b);

        i=0;
        if (++i == ++i) System.out.println("This if clause is always false");

        i=0;
        i = i+1; int l = i; i = i+1; int m = i; boolean c = l == m;
        System.out.printf("%s==%s? -> %s%n", l, m, c);

        if (i == i++) System.out.println("This if clause is always true");
    }
}