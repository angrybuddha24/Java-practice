package com.java.practice.coderbyte;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.Keymap;

public class MinWindowSubstring {
    public static void main(String[] args) {

    }

    public static String minWindowSubstring(String[] strArr) {
        // code goes here
        String n = strArr[0];
        String k = strArr[1];
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : k.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }
        return strArr[0];
    }
}
