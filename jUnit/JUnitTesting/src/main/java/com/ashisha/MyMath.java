package com.ashisha;

public class MyMath {
    public int sum(int[] nums) {
        int sum = 0;
        for(int val:nums) {
            sum += val;
        }
       return sum;
    }
}
