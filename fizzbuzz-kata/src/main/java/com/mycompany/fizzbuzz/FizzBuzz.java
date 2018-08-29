package com.mycompany.fizzbuzz;

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
