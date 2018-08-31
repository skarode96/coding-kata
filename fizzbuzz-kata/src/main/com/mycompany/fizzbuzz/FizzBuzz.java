package com.mycompany.fizzbuzz;

/*
problem statement: function should return Fizz if number is multiple of 3
                                   return Buzz if number is multiple of 5
                                   return FizzBuzz if number is multiple of 15
 */

public class FizzBuzz
{
    public static String getResult(int value) {
        if(value%15 == 0)
            return "FizzBuzz";
        else if(value %3 == 0)
            return "Fizz";
        else if(value%5 == 0)
            return "Buzz";
        return String.valueOf(value);
    }
}
