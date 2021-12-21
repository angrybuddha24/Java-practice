package com.java.practice.coderbyte;

public class FirstReverse {
    public static void main(String[] args) {
        System.out.println(FirstReverse.firstReverse("I Love Code"));
    }

    public static String firstReverse(String str) {
        // code goes here  
        StringBuilder builder = new StringBuilder().append(str).reverse();
        return builder.toString();
      }
}
