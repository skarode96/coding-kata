package com.mycompany.app;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SplitNumberProblemSolver
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLength = reader.readLine();
        String input = reader.readLine();
        final String result = solve(input);
        System.out.println(result);
    }

    static Pair<String, String> split(final String input, final int index) {
        if (index < 0 || index > input.length())
            throw new IllegalArgumentException("index out of bounds");
        final String substring1 = input.substring(0,index);
        final String substring2 = input.substring(index);
        return new Pair<>(substring1, substring2);
    }

    static String addPair(Pair<String, String> pair) {
        final String key = pair.getKey();
        final String value = pair.getValue();
        StringBuilder val1 = new StringBuilder(key);
        StringBuilder val2 = new StringBuilder(value);
        if(key.length() > value.length()) {
            StringBuilder temp = val1;
            val1 = val2;
            val2 = temp;
        }
            final char[] val1CharArray = val1.reverse().toString().toCharArray();
            final char[] val2CharArray = val2.reverse().toString().toCharArray();
            final StringBuilder sum = new StringBuilder();
            int carry = 0;
            int a1;
            int a2;
            for (int i=0; i< val2CharArray.length ; i++) {
                a1 = Integer.parseInt(String.valueOf(val2CharArray[i]));
                if(i>=val1CharArray.length)
                    a2 = 0;
                else
                    a2 = Integer.parseInt(String.valueOf(val1CharArray[i]));
                sum.append((a1 + a2 + carry)%10);
                carry = (a1 + a2 + carry)/10;
            }
            if(carry != 0)
                sum.append(carry);
            return sum.reverse().toString();

    }

    static boolean isPairValid(final Pair<String, String> pair) {
        return !pair.getKey().startsWith("0") && !pair.getValue().startsWith("0");
    }

    static String solve(final String input) {
        String minimum = input;
        minimum = solveFirstHalf(input, minimum);
        minimum = solveSecondHalf(input, minimum);
        return minimum;
    }

    private static String solveSecondHalf(final String input, String minimum) {
        for (int i=input.length(); i>=input.length()/2; i--) {
            minimum = getMinimum(input, minimum, i);
        }
        return minimum;
    }

    private static String solveFirstHalf(final String input, String minimum) {
        for (int i=1; i<input.length()/2; i++) {
            minimum = getMinimum(input, minimum, i);
        }
        return minimum;
    }

    private static String getMinimum(final String input, String minimum, final int i) {
        final String additionOfPair;
        final Pair<String, String> split = split(input, i);
        if (isPairValid(split)) {
            additionOfPair = addPair(split);
            final BigInteger bigIntMinValue = new BigInteger(minimum);
            final BigInteger bigIntAdditionVal = new BigInteger(additionOfPair);
            if (bigIntAdditionVal.compareTo(bigIntMinValue) < 0) {
                minimum = additionOfPair;
            }
        }
        return minimum;
    }
}
