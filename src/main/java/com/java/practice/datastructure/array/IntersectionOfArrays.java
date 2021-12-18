package com.java.practice.datastructure.array;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
        String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
        new IntersectionOfArrays().intersectionOfTwoArrays(s1, s2);
    }

    public void intersectionOfTwoArrays(String[] arr1, String[] arr2) {
        HashSet<String> hashSet1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<String> hashSet2 = new HashSet<>(Arrays.asList(arr2));
        hashSet1.retainAll(hashSet2);
        System.out.println(hashSet1);
    }
}
