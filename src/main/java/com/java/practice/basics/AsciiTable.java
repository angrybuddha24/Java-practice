package com.java.practice.basics;

public class AsciiTable {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
    }
}
