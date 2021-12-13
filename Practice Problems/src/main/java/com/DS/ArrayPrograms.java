package com.DS;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

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

    }

    public int[] returnArray() {
        // returning an array from a method
        int[] arr1 = { 1, 2, 3, 4, 5 };
        return arr1;
    }

    public int sumOfArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : arr1) {
            sum+=i;
        }
        return sum;
    }

    public int averageOfArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : arr1) {
            sum+=i;
        }
        
        return sum/arr1.length;
    }

    public boolean compareArrays() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 0, 4, 5 };
        boolean compare;
        if(Arrays.equals(arr1, arr2))
            compare=true;
        else
            compare=false;
        return compare;
    }

    public int[] copyArray() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = Arrays.copyOf(arr1, 7);
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
        System.out.println(Arrays.toString(new ArrayPrograms().copyArray()));
    }
}
