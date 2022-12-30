package com.java.practice.datastructure.array;

public class SizeOfANumber {
    public static void main(String[] args) {

        //if num is a positive integer
        int num = 983489732;
        String s = Integer.toString(num);
        System.out.println(s.length());

        //if num can be a positive or negative integer
        int num1 = -983489732;
        if(num1 < 0){
            num1*=-1;
        }
        String s1 = Integer.toString(num1);
        System.out.println(s1.length());

        //if num is a decimal
        double num2 = 264564.04;
        num2 = Math.floor(num2);
        long num3 = (long)num2;
        String s2 = Long.toString(num3);
        System.out.println(s2.length());

    }
}
