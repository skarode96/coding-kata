package com.mycompany.seriessum;

/*
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 */

import org.junit.Assert;
import org.junit.Test;

public class SeriesSumTest {
    @Test
    public void getFirstTermOfSeries() {
        Assert.assertEquals(Double.valueOf(1), SeriesSum.getNthTerm(1));
    }

    @Test
    public void getSecondTermOfSeries() {
        Assert.assertEquals(Double.valueOf(1d / 4), SeriesSum.getNthTerm(2));
    }

    @Test
    public void getNthTermOfSeries() {
        Assert.assertEquals(Double.valueOf(1d / 7), SeriesSum.getNthTerm(3));
        Assert.assertEquals(Double.valueOf(1d / 10), SeriesSum.getNthTerm(4));
        Assert.assertEquals(Double.valueOf(1d / 13), SeriesSum.getNthTerm(5));
        Assert.assertEquals(Double.valueOf(1d / 16), SeriesSum.getNthTerm(6));
    }

    @Test
    public void getSumOfFirstNthTerm() {
        Assert.assertEquals("1.77", SeriesSum.seriesSum(9));
        Assert.assertEquals("1.94", SeriesSum.seriesSum(15));
    }

}
