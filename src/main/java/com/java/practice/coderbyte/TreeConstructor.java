package com.java.practice.coderbyte;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TreeConstructor {
    //Base logic is that, in a binary tree, a num can be a parent of max 2 nodes

    public String treeConstructor(String[] strArr) {
        // code goes here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i].substring(1, strArr[i].length() - 1);
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            int child = Integer.parseInt(stringTokenizer.nextToken());
            int par = Integer.parseInt(stringTokenizer.nextToken());
            if (map.containsKey(par)) {
                int count = map.get(par);
                map.put(par, count + 1);
            } else {
                map.put(par, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " +
            entry.getValue());
            if (entry.getValue() > 2) {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(
                new TreeConstructor().treeConstructor(new String[] { "(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)" }));
    }

}
