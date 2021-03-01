package com.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum<E> {
    private E[] myArray;

    public FindMaximum(E[] myArray) {
        this.myArray = myArray;
    }

    public FindMaximum() {
    }

    public <E> Comparable findMaxGeneric(E[] input){
        List myList = Arrays.asList(input);
        Comparable maximum = Collections.max(myList);
        return maximum;
    }

    public int findMaximum(Integer x, Integer y, Integer z){
        int max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return  max;
    }

    public double findMaximum_Doubles(Double x, Double y,Double z){
        double max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public String findMaximum_String(String x, String y,String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}
