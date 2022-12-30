package com.java.practice.datastructure.string;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseWithRecursion("ABC"));
        System.out.println(reverseWithStringBuilder("ABC"));
        System.out.println(reverseWithStringBuffer("ABC"));
    }

    public static String reverseWithRecursion(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(c[i]);
        }

        return new String(sb);
    }

    public static String reverseWithStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        return new String(sb.reverse());
    }

    public static String reverseWithStringBuffer(String s) {
        StringBuffer sb = new StringBuffer(s);
        return new String(sb.reverse());
    }
}
