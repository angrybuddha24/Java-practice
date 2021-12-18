package com.java.practice.datastructure.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MoveZeros().movingZerosToEndOfAnArray(new int[] {12, 0, 7, 0, 8, 0, 3})));
        System.out.println(Arrays.toString(new MoveZeros().movingZerosToFrontOfAnArray(new int[] {12, 0, 7, 0, 8, 0, 3})));
    }

    public int[] movingZerosToEndOfAnArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        int counter = 0;
        for (int i : arr) {
            if(i!=0){
                arr1[counter]=i;
                counter++;
            }
        }
        

        return arr1;
    }

    public int[] movingZerosToFrontOfAnArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        int counter = 0;
        for (int i : arr) {
            if(i==0){
                arr1[i]=0;
                counter++;
            }
        }
        for (int i : arr) {
            if(i!=0){
                arr1[counter]=i;
                counter++;
            }
        }
        

        return arr1;
    }
}
