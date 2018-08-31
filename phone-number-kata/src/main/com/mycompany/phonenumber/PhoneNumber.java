package com.mycompany.phonenumber;

/* problem statement
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
*/

public class PhoneNumber
{
    public static String createNumber(int[] arr) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(arr).boxed().toArray());
    }
}
