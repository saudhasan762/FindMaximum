package com.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum<E> {

    public FindMaximum() {
    }

    public <E> Comparable findMaxGeneric(E[] input){
        List myList = Arrays.asList(input);
        Comparable maximum = Collections.max(myList);
        System.out.println("Maximum value: "+maximum);
        return maximum;
    }

    public int findMaximum_Integer(Integer x, Integer y, Integer z){
        int max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return  max;
    }

    public double findMaximum_Floats(Double x, Double y,Double z){
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
