package com.java.practice.datastructure.string;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "ABCBA";
        if (s.equals(reverseWithStringBuilder(s)))
            System.out.println("The given string is a Palindrome");
        else
            System.out.println("The given string is not a Palindrome");

    }

    public static String reverseWithStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        return new String(sb.reverse());
    }
}
