package com.mycompany.exponential;

public class ExponentialFinder
{
    @Author(value = "Sam")
    public static double calculate(int a, int b) {

        if(b >= 0) {
            return calculateForPositiveIndex(a, b);
        } else
            return 1d/calculateForPositiveIndex(a,Math.abs(b));
    }

    private static double calculateForPositiveIndex(int a, int b) {
        if(b == 0)
            return 1;
        else if(b == 1)
            return a;
        else if(isEven(b))
            return calculate(a, b/2)*calculate(a, b/2);
        else
            return calculate(a,b/2)*calculate(a, (b/2 + 1));
    }

    private static boolean isEven(int b) {
        return b%2 == 0;
    }
}
