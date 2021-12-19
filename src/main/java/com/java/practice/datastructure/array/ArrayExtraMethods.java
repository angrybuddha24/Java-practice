package com.java.practice.datastructure.array;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ArrayExtraMethods {
    public static void main(String[] args) {
    System.out.println(Arrays.toString(new ArrayExtraMethods().fillTheArray(new int[]{1,2,3,4,5})));
    ArrayExtraMethods.parallelPrefixByCreatingAnInstance(new int[]{1,2,3,4,5});
    }

    public int[] fillTheArray(int[] arr) {
    Arrays.fill(arr, 0);
        return arr;
    }

    public static void parallelPrefixByCreatingAnInstance(int[] arr) {
        IntBinaryOperator op = (x, y) -> x + y;
        Arrays.parallelPrefix(arr, op);
        System.out.println(Arrays.toString(arr));

        //The above statement can be reduced to
        Arrays.parallelPrefix(arr, (x, y) -> x + y);
        System.out.println(Arrays.toString(arr));

        //Also external methods can be called
        Arrays.parallelPrefix(arr, (x, y) -> compute(x,y));
        //The above line can be written as 
        Arrays.parallelPrefix(arr, ArrayExtraMethods::compute);
        System.out.println(Arrays.toString(arr));

        //Also the elements of an array can be printed in the below mentione way
        Arrays.stream(arr).forEach(e -> System.out.print(e + "   "));
        Arrays.stream(arr).forEach(System.out::println);
        }

        static int compute(int x, int y)
    {
        return x + y;
    }
}
