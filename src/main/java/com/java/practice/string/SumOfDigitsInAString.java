package com.java.practice.string;

public class SumOfDigitsInAString {
    public static void main(String[] args) {
        System.out.println(new SumOfDigitsInAString().sumOfDigitsInAString("hello2021"));
    }

    public int sumOfDigitsInAString(String phrase){
        int sum = 0;
        for (char c : phrase.toCharArray()) {
            if(Character.isDigit(c))
                sum+=Character.getNumericValue(c);
        }

        return sum;
    }
}
