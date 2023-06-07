package math;

public class FloatDivision {
    public static void main(String[] args) {
        final float numerator = 0;
        final float dividend = 0;
        var result = numerator/dividend; //not a number Float.NaN
        System.out.println(result);
        int notANumber = (int)Float.NaN;
        int infiniteInt = (int) (1/dividend);
        long infiniteLong = (long) (1/dividend);
        System.out.println(notANumber);
        System.out.println(infiniteInt);
        System.out.println(infiniteLong);
        assert Integer.MAX_VALUE == infiniteInt;
        assert Long.MAX_VALUE == infiniteLong;
    }
}
