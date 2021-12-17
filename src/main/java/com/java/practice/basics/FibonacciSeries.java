package com.java.practice.basics;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FibonacciSeries().fibonacciSeries(15)));
    }

    public int[] fibonacciSeries(int num) {
        int[] series = new int[num];
        series[0] = 0;
        series[1] = 1;
        int temp = 0;
        int i = 0;
        while (i != (num - 2)) {
            temp = series[i] + series[i + 1];
            series[i + 2] = temp;
            i++;
        }

        return series;
    }
}
