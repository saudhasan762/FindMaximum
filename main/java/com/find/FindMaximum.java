package com.find;

public class FindMaximum {


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
}
