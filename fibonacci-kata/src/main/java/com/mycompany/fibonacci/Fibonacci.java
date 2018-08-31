package com.mycompany.fibonacci;

public class Fibonacci {
    public static int getNthTerm(int i) {
        validateArgument(i);
        return isArgumentBetweenZeroAndTwo(i) ? i - 1 : getNthTerm(i - 1) + getNthTerm(i - 2);
    }

    private static void validateArgument(int i) {
        if (isArgumentInvalid(i))
            throw new IllegalArgumentException();
    }

    private static boolean isArgumentInvalid(int i) {
        return i <= 0 ? true : false;
    }

    private static boolean isArgumentBetweenZeroAndTwo(int i) {
        return i <= 2 && i > 0 ? true : false;
    }
}
