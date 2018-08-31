package com.mycompany.fibonacci;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testGetFirstTermOfFibonacci() {
        Assert.assertEquals(0, Fibonacci.getNthTerm(1));
    }

    @Test
    public void testGetSecondTermOfFibonacci() {
        Assert.assertEquals(1, Fibonacci.getNthTerm(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidArgExceptionIfNumberIsLessThanZero() {
        Fibonacci.getNthTerm(-1);
    }

    @Test
    public void shouldReturnNthTermOfFibonacci() {
        Assert.assertEquals(2, Fibonacci.getNthTerm(4));
        Assert.assertEquals(3, Fibonacci.getNthTerm(5));
        Assert.assertEquals(5, Fibonacci.getNthTerm(6));
        Assert.assertEquals(8, Fibonacci.getNthTerm(7));
    }
}
