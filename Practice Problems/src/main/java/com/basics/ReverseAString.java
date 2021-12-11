package com.basics;

public class ReverseAString {
    public static void main(String[] args) {
        
        String input = "The quick brown fox";
        System.out.println(new ReverseAString().reverseAStringUsingCharArray(input));
        System.out.println(new ReverseAString().reverseAStringUsingStringBuilder(input));
        System.out.println(new ReverseAString().reverseAStringUsingStringBuffer(input));
    }

    public String reverseAStringUsingCharArray(String input) {
        String reversedString = "";
        char[] c = input.toCharArray();
        for (int i = c.length-1; i >= 0; i--) {
            reversedString+=c[i];
        }
        return reversedString;
    }

    public String reverseAStringUsingStringBuilder(String input){
        StringBuilder reversedString = new StringBuilder(input).reverse();
        return reversedString.toString();
    }

    public String reverseAStringUsingStringBuffer(String input){
        StringBuffer reversedString = new StringBuffer(input).reverse();
        return reversedString.toString();
    }
}
