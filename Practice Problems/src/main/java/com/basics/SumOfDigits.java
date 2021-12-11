package com.basics;

import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(new SumOfDigits().sumOfDigitsUsingFormula(294));
        System.out.println(new SumOfDigits().sumOfDigitsUsingCharArray(294));
        System.out.println(new SumOfDigits().sumOfDigitsUsingStream(294));

    }

    public int sumOfDigitsUsingFormula(int input) {

        int c = 0;
        while (input != 0) {
            c += input % 10;
            input /= 10;
        }
        return c;
    }

    public int sumOfDigitsUsingCharArray(int input) {

        int c = 0;
        char[] arr = String.valueOf(input).toCharArray();
        for (char d : arr) {
            c+=Character.getNumericValue(d);
        }
        return c;
    }

    public long sumOfDigitsUsingStream(int input) {

        return Stream.of(String.valueOf(input).split(""))
        .collect(Collectors.summarizingInt(Integer::parseInt))
        .getSum();
    }

}
