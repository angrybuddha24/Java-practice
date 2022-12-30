package com.java.practice.datastructure.string;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "trees";
        String s2 = "steer";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (s1.length() == s2.length() && Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings are anagrams");
        } else {
            System.out.println("The given strings are not anagrams");
        }
    }
}
