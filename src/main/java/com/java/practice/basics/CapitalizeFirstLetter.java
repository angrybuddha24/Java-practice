package com.java.practice.basics;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog.";
        System.out.println(new CapitalizeFirstLetter().capitalizeFirstLetter(input));
    }

    public String capitalizeFirstLetter(String input) {
        StringBuilder output = new StringBuilder();
        String[] arr = input.split(" ");
        for (String string : arr) {
            string = string.replace(string.substring(0, 1), string.substring(0, 1).toUpperCase());
            output.append(string + " ");
        }

        return new String(output).trim();
    }

}
