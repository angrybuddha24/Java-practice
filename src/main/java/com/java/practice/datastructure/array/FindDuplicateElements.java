package com.java.practice.datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(new FindDuplicateElements()
        // .findDuplicateElementsUsingBruteForce(new int[] { 1, 2, 6, 1, 5, 6, 4, 9, 7,
        // 2 })));
        // System.out.println(Arrays.toString(new FindDuplicateElements()
        // .findDuplicateElementsUsingSorting(new int[] { 1, 2, 6, 1, 5, 6, 4, 9, 7, 2
        // })));
        System.out.println(Arrays.toString(new FindDuplicateElements()
                .findDuplicateElementsUsingHashSet(new int[] { 1, 2, 6, 1, 5, 6, 4, 9, 7, 2 })));
    }

    public int[] findDuplicateElementsUsingBruteForce(int[] arr) {
        int[] output = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j != i; j++) {
                if (arr[i] == arr[j]) {
                    output[k] = arr[i];
                    k++;
                }
            }
        }
        return Arrays.stream(output).filter(num -> num != 0).toArray();
    }

    public int[] findDuplicateElementsUsingSorting(int[] arr) {
        int[] output = new int[arr.length];
        int k = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                output[k] = arr[i];
                k++;
            }
        }

        return Arrays.stream(output).filter(num -> num != 0).toArray();
    }

    public int[] findDuplicateElementsUsingHashSet(int[] arr) {

        int k = 0;
        int[] output = new int[arr.length];
        Set<Integer> hashSet = new HashSet<>();
        for (int i : arr) {
            if (!hashSet.add(i)) {
                output[k] = i;
                k++;
            }
        }

        return Arrays.stream(output).filter(num -> num != 0).toArray();
    }

}