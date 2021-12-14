package com.java.practice.basics;

import java.util.LinkedHashSet;
import java.util.Set;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Total Factors for the given number: "+new Factors().factorsOfANumber(8));
    }

    public int factorsOfANumber(int input) {

        int factors = 2; // Since 1 and the input number itself are always factors
        Set<Integer> factorNumbers = new LinkedHashSet<>();
        factorNumbers.add(1);
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                factorNumbers.add(i);
                factors++;
            }
        }
        factorNumbers.add(input);

        for (Integer integer : factorNumbers) {
            System.out.println(integer);
        }
        return factors;
    }
}
