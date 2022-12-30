package com.java.practice.datastructure.array;

import java.util.Arrays;

public class ArrayCyclicalRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9 };
        int len = arr.length;
        int[] arr1 = new int[arr.length];
        while (len != 0) {
            for (int i = 1; i < arr.length; i++) {
                arr1[0] = arr[arr.length - 1];
                arr1[i] = arr[i - 1];
            }
            System.out.println(Arrays.toString(arr1));
            arr = arr1;
            arr1 = new int[arr.length];
            len--;
        }

    }
}
