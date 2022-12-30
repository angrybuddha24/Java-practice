package com.java.practice.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionIntersectionArray {
    public static void main(String[] args) {
        returnUnion();
        returnIntersection();
    }

    public static void returnUnion() {
        int[] arr1 = { 7, 1, 5, 2, 3, 6 };
        int[] arr2 = { 3, 8, 6, 20, 7 };
        Set<Integer> union = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }
        Integer[] arr3 = new Integer[union.size()];
        int j = 0;
        for (Integer i : union) {
            arr3[j++] = i;
        }
        System.out.println(Arrays.toString(arr3));

    }

    public static void returnIntersection() {
        int[] arr1 = { 7, 1, 5, 2, 3, 6 };
        int[] arr2 = { 3, 8, 6, 20, 7 };
        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection.add(arr1[i]);
                }
            }
        }
        Integer[] arr3 = new Integer[intersection.size()];
        int j = 0;
        for (Integer a : intersection) {
            arr3[j++] = a;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
