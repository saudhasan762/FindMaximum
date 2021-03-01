package com.find;


import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void checkMaximumNumber_FirstPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {25,21,12,16,5};
        Assert.assertEquals(array[0], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumNumber_SecondPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {41,55,20,7,50};
        Assert.assertEquals(array[1], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumNumber_ThirdPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {2,4,9,3};
        Assert.assertEquals(array[2], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumNumber_Doubles_FirstPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {11.5,11.0,10.7,10.1};
        Assert.assertEquals(array[0], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumNumber_Doubles_SecondPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {2.5,7.6,6.8,0.2};
        Assert.assertEquals(array[1], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumNumber_Doubles_ThirdPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {25.0,24.6,26.3};
        Assert.assertEquals(array[2], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumString_FirstPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {"Peach","Banana","Apple"};
        Assert.assertEquals(array[0], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumString_SecondPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {"Mango","Peach","Banana","Apple"};
        Assert.assertEquals(array[1], findMax.findMaxGeneric(array));
    }

    @Test
    public void checkMaximumString_ThirdPosition(){
        FindMaximum findMax = new FindMaximum();
        Object[] array = {"Banana","Apple","Peach"};
        Assert.assertEquals(array[2], findMax.findMaxGeneric(array));
    }

}
