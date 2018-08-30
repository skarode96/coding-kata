package com.mycompany.phonenumber;


import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest
{
    @Test
    public void tests() {
        Assert.assertEquals("(123) 456-7890", PhoneNumber.createNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
