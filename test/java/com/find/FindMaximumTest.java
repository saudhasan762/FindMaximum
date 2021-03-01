package com.find;


import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void checkMaximumNumber_FirstPosition(){
        FindMaximum findMax = new FindMaximum();
        int result = findMax.findMaximum(20,15,5);
        Assert.assertEquals(20,result);
    }

    @Test
    public void checkMaximumNumber_SecondPosition(){
        FindMaximum findMax = new FindMaximum();
        int result = findMax.findMaximum(5,20,15);
        Assert.assertEquals(20,result);
    }

    @Test
    public void checkMaximumNumber_ThirdPosition(){
        FindMaximum findMax = new FindMaximum();
        int result = findMax.findMaximum(15,5,20);
        Assert.assertEquals(20,result);
    }
}
