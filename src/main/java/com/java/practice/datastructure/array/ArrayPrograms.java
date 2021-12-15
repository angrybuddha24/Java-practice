package com.java.practice.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayPrograms {

    public void arrayDeclaration() {

        // Below are the different ways of declaring and initializing arrays

        // array declaration
        int[] arr1 = new int[5];
        // array initialization
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        System.out.println(Arrays.toString(arr1));

        // array declaration & initialization in the same statement
        int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr2));

        // simplified formm of array declaration & initialization in the same statement
        int[] arr3 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr3));

    }

    public void arrayAccess() {
        // accessing using index
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(arr1[2]);

    }

    public void arrayLooping() {
        // printing elements using for loop
        int[] arr1 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
        // printing elements using for each loop
        for (int i : arr1) {
            System.out.println(i);
        }

    }

    public void getArrayInput() {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter Number " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            System.out.println(i);
        }
        scanner.close();

    }

    public int[] returnArray() {
        // returning an array from a method
        return new int[] { 1, 2, 3, 4, 5 };
    }

    public int sumOfArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }
        return sum;
    }

    public int averageOfArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }

        return sum / arr1.length;
    }

    public boolean compareArrays() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 0, 4, 5 };
        boolean compare;
        if (Arrays.equals(arr1, arr2))
            compare = true;
        else
            compare = false;
        return compare;
    }

    public int[] copyArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        return Arrays.copyOf(arr1, 7);
    }

    public int[] mergeArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length; j < arr2.length + arr1.length; j++) {
            arr3[j] = arr2[j - arr1.length];
        }
        return arr3;
    }

    public int[] mergeArrayUsingCopyOf() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int j = arr1.length; j < arr2.length + arr1.length; j++) {
            arr3[j] = arr2[j - arr1.length];
        }
        return arr3;
    }

    public int[] mergeArrayUsingSystemCopy() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        return arr3;
    }

    public int[] sortArrayUsingArraysSort() {
        int[] arr1 = { 10, 7, 6, 3, 1, 9, 2, 4, 5, 8 };
        Arrays.sort(arr1);
        return arr1;
    }

    public int[] sortArrayUsingParallelSort() {
        int[] arr1 = { 10, 7, 6, 3, 1, 9, 2, 4, 5, 8 };
        Arrays.parallelSort(arr1, 0, 5);
        return arr1;
    }

    public int largestNumberInArrayUsingSort() {
        int[] arr1 = { 10, 7, 6, 3, 1, 9, 2, 4, 5, 8 };
        Arrays.sort(arr1);
        return arr1[arr1.length - 1];
    }

    public int largestNumberInArrayUsingFor() {
        int[] arr1 = { 7, 6, 3, 1, 10, 9, 2, 4, 5, 8 };
        int largestNumber = 0;
        for (int i : arr1) {
            if (i > largestNumber)
                largestNumber = i;
        }
        return largestNumber;
    }

    public int secondLargestNumberInArrayUsingFor() {
        int[] arr1 = { 7, 6, 3, 1, 10, 9, 2, 4, 5, 8 };
        int largestNumber = 0;
        for (int i : arr1) {
            if (i > largestNumber)
                largestNumber = i;
        }
        int secondLargestNumber = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i != largestNumber && i > secondLargestNumber)
                secondLargestNumber = i;
        }
        return secondLargestNumber;

    }

    public int smallestNumberInArrayUsingFor() {
        int[] arr1 = { 7, 6, 3, 1, 10, 9, 2, 4, 5, 8 };
        int smallestNumber = 100000;
        for (int i : arr1) {
            if (i < smallestNumber)
                smallestNumber = i;
        }
        return smallestNumber;
    }

    public int[] reverseArrayUsingFor() {
        int[] arr1 = { 7, 6, 3, 1, 10, 9, 2, 4, 5, 8 };
        Arrays.sort(arr1);
        int[] arr2 = new int[arr1.length];
        for (int i = arr1.length; i > 0; i--) {
            arr2[arr1.length - i] = arr1[i - 1];
        }
        return arr2;
    }

    public List<Integer> reverseArrayUsingCollections() {
        int[] arr1 = { 7, 6, 3, 1, 10, 9, 2, 4, 5, 8 };
        Arrays.sort(arr1);
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            list.add(num);
        }
        Collections.reverse(list);
        return list;

    }

    public int gcdOfNumbers() {
        int[] arr1 = { 24, 36, 8, 48, 60 };
        int gcd = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            gcd = calculateGCD(gcd, arr1[i]);
        }
        return gcd;
    }

    public static int calculateGCD(int num1, int num2) {
        while (num1 != num2)
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        return num1;
    }

    public int linearSearch() {
        int[] arr1 = { 24, 36, 8, 48, 60 };
        int num = 9;
        int index = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num)
                index = i;
        }
        return index;
    }

    public int binarySearch() {
        int[] arr1 = { 24, 36, 8, 48, 60 };
        Arrays.sort(arr1);
        int num = 48;
        int index = -1;
        index = binarySearchImpl(arr1, 0, arr1.length, num);
        return index;
    }

    public static int binarySearchImpl(int[] arr1, int low, int high, int key) {
        int i = low; // left index
        int j = high; // right index
        int mid = 0;

        while (i < j) {
            // find middle index
            mid = (i + j) / 2;

            // compare search key and middle term
            if (key > arr1[mid])
                i = mid + 1;
            else
                j = mid;
        }

        // when i==j
        if (key == arr1[i])
            return i; // key found
        return -1; // key not found
    }

    public int[] removeDuplicates() {
        int[] arr1 = { 24, 36, 8, 8, 36 };

        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        int[] arr2 = new int[set.size()];
        Integer j = 0;
        for (Integer i : set) {
            arr2[j] = i;
            j++;
        }

        return arr2;
    }

    public static void main(String[] args) {
        // new ArrayPrograms().arrayDeclaration();
        // new ArrayPrograms().arrayAccess();
        // new ArrayPrograms().arrayLooping();
        // new ArrayPrograms().getArrayInput();
        // System.out.println(Arrays.toString(new ArrayPrograms().returnArray()));
        // System.out.println(new ArrayPrograms().sumOfArray());
        // System.out.println(new ArrayPrograms().averageOfArray());
        // System.out.println(new ArrayPrograms().compareArrays());
        // System.out.println(Arrays.toString(new ArrayPrograms().copyArray()));
        // System.out.println(Arrays.toString(new ArrayPrograms().mergeArray()));
        // System.out.println(Arrays.toString(new
        // ArrayPrograms().mergeArrayUsingCopyOf()));
        // System.out.println(Arrays.toString(new
        // ArrayPrograms().mergeArrayUsingSystemCopy()));
        // System.out.println(Arrays.toString(new
        // ArrayPrograms().sortArrayUsingArraysSort()));
        // System.out.println(new ArrayPrograms().largestNumberInArrayUsingSort());
        // System.out.println(new ArrayPrograms().largestNumberInArrayUsingFor());
        // System.out.println(new ArrayPrograms().secondLargestNumberInArrayUsingFor());
        // System.out.println(new ArrayPrograms().smallestNumberInArrayUsingFor());
        // System.out.println(Arrays.toString( new
        // ArrayPrograms().sortArrayUsingParallelSort()));
        // System.out.println(Arrays.toString( new
        // ArrayPrograms().reverseArrayUsingFor()));
        // System.out.println(new ArrayPrograms().reverseArrayUsingCollections());
        // System.out.println(new ArrayPrograms().gcdOfNumbers());
        // System.out.println(new ArrayPrograms().linearSearch());
        // System.out.println(new ArrayPrograms().binarySearch());
        System.out.println(Arrays.toString(new ArrayPrograms().removeDuplicates()));

    }
}
