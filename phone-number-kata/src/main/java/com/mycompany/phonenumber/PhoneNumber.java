package com.mycompany.phonenumber;

public class PhoneNumber
{
    public static String createNumber(int[] arr) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(arr).boxed().toArray());
    }
}
