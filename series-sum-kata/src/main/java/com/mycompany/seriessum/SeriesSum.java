package com.mycompany.seriessum;

import java.nio.DoubleBuffer;

/*
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 */
public class SeriesSum {

    public static Double getNthTerm(Integer n) {
        if (Integer.valueOf(n) == 1)
            return Double.valueOf(1);
        return Double.valueOf(1d / (3 * n - 2));
    }

    public static String seriesSum(Integer n) {
        Double sum = Double.valueOf(0);
        for (int i = 1; i <= n; i++) {
            sum += getNthTerm(i);
        }
        return String.format("%.2f", sum);
    }
}
