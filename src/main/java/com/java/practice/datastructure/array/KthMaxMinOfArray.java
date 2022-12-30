package com.java.practice.datastructure.array;

import java.util.Arrays;

public class KthMaxMinOfArray {
    public static void main(String[] args) {
        kthMaxMinOfArrayUsingSort();
    }

    public static void kthMaxMinOfArrayUsingSort(){
        int[] arr = { 1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9 };
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        System.out.println(arr[arr.length - k]);
    }
}
