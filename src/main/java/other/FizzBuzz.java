package other;

public class FizzBuzz {
    private static final int DIVIDER_1 = 3;
    private static final int DIVIDER_2 = 5;

    public static String createFizzBuzz(int number) {
        if (hasTwoDividers(number))
            return "FizzBuzz";
        if (isDivisible(number, DIVIDER_1))
            return "Fizz";
        if (isDivisible(number, DIVIDER_2))
            return "Buzz";

        return number + "";
    }

    private static boolean hasTwoDividers(int number) {
        return isDivisible(number, DIVIDER_1) && isDivisible(number, DIVIDER_2);
    }

    private static boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }
}
