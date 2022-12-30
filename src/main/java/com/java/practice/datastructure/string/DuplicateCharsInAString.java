package com.java.practice.datastructure.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharsInAString {
    public static void main(String[] args) {
findDuplicates();
    }

    public static void findDuplicates() {
        String s = "Shishimaru";
        Set<Character> set = new HashSet<>();
        char[] c = s.toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (i != j && c[i] == c[j]) {
                    set.add(c[j]);
                }
            }
        }
        System.out.println(set);
    }
}
