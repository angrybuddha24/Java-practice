package com.java.practice.datastructure.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9 };
        int[] arr2 = new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
