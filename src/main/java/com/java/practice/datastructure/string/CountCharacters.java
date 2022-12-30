package com.java.practice.datastructure.string;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "aaabbccccdddddddaa";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : map.keySet()) {
            sb.append(c.toString() + map.get(c));
        }
        System.out.println(sb);
    }
}
