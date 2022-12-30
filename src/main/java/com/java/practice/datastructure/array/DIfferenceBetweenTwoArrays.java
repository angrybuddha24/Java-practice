package com.java.practice.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIfferenceBetweenTwoArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9};
        Integer[] arr2 = {1, 2, 4, -5, 6, 7, 11, 8};
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        list1.removeAll(list2);
        Integer[] arr3 = new Integer[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            arr3[i] = list1.get(i);
        }
        System.out.println(Arrays.toString(arr3));
    }
}
