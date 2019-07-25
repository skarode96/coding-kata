package com.mycompany.exponential;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ExponentialFinderTest
{
    @Test
    public void calculateForPositiveIndex() {
        Assert.assertEquals(1.0,ExponentialFinder.calculate(2,0),0.1);
        Assert.assertEquals(2,ExponentialFinder.calculate(2,1),0.1);
        Assert.assertEquals(4,ExponentialFinder.calculate(2,2),0.1);
        Assert.assertEquals(8,ExponentialFinder.calculate(2,3),0.1);
        Assert.assertEquals(16,ExponentialFinder.calculate(2,4),0.1);
        Assert.assertEquals(32,ExponentialFinder.calculate(2,5),0.1);
        Assert.assertEquals(1024,ExponentialFinder.calculate(2,10),0.1);
        Assert.assertEquals(59049,ExponentialFinder.calculate(3,10),0.1);
        Assert.assertEquals(32,ExponentialFinder.calculate(2,5),0.1);
    }

    @Test
    public void calculateForNegativeIndex() {
        System.out.println(ExponentialFinder.calculate(2,-10));
    }

    @Test
    public void calculateForNegativeA() {
        System.out.println(ExponentialFinder.calculate(-2,  -2));
    }

    @Test
    public void test() {
        String name = RandomStringUtils.randomAlphabetic(10);
        System.out.println(name);
    }
 }
