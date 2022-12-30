package com.java.practice.datastructure.array;

import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        minMaxUsingComparison();
        minMaxUsingSort();
    }

    public static void minMaxUsingComparison() {
        int[] arr = { 1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9 };
        int max = -10000;
        int min = 10000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void minMaxUsingSort() {
        int[] arr = { 1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9 };
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
    }
}
