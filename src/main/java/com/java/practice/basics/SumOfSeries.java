package com.java.practice.basics;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(new SumOfSeries().sumOfSeries(5));
    }

    public int sumOfSeries(int num) {
        
        return (num*(num+1))/2;
    
    }
}
