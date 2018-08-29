package com.mycompany.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest
{
    @Test
    public void shouldReturnNumber() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    public void shouldReturnFizzIfDivisibleBy3() {
        Assert.assertEquals("Fizz", FizzBuzz.getResult(3));
        Assert.assertEquals("Fizz", FizzBuzz.getResult(6));
        Assert.assertEquals("Fizz", FizzBuzz.getResult(9));
    }

    @Test
    public void shouldReturnBuzzIfDivisibleBy5() {
        Assert.assertEquals("Buzz", FizzBuzz.getResult(5));
        Assert.assertEquals("Buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void shouldReturnFizzBuzzIfDivisibleBy15() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(30));
    }

}
