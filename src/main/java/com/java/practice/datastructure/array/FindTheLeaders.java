package com.java.practice.datastructure.array;

import java.util.Arrays;

public class FindTheLeaders {
    public static void main(String[] args) {
        System.out
                .println(Arrays.toString(new FindTheLeaders().findAllTheLeaders(new int[] { 14, 9, 11, 7, 8, 5, 3 })));
    }

    // An element is said to be leader if all the elements on it’s right side are
    // smaller than it. Rightmost element is always a leader.
    public int[] findAllTheLeaders(int[] arr) {
        int[] arr1 = new int[arr.length];
        int max = arr[arr.length-1];
        int count=1;
        arr1[0]=max;
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]>max){
                arr1[count]=arr[i];
                max=arr[i];
                count++;
            }
        }

        return arr1;
    }
}
