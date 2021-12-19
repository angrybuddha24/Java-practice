package com.java.practice.datastructure.array;

import java.util.Arrays;

/* Notes:
A null array is lexicographically less than a non-null array.
Two arrays are considered equal if both are null.
If two arrays are equal to each other, equals() returns true
If first array and second array are equal then compare() returns zero; 
It performs lexicographical comparison i.e ot checks whether the arrays contain same elements in the same order
If the first array (or slice) is lexicographically less than the second array (or slice) returns -ve (negative value).
If the first array (or slice) is lexicographically greater than the second array (or slice) returns +ve (positive value). 
If first array and second array are equal then mismatch() returns -1;
If not it returns the index of the first mismatch between two arrays
*/

public class ArrayComparison {
        public static void main(String[] args) {
                // returns true
                System.out
                                .println(new ArrayComparison().compareIntArraysUsingDoubleEqualto1(
                                                new int[] { 1, 2, 3, 4, 5 }));
                // returns false
                System.out
                                .println(new ArrayComparison().compareIntArraysUsingDoubleEqualto2(
                                                new int[] { 1, 2, 3, 4, 5 },
                                                new int[] { 1, 2, 3, 4, 5 }));

                // returns true
                System.out
                                .println(new ArrayComparison().compareIntArraysUsingEquals(
                                                new int[] { 1, 2, 3, 4, 5 },
                                                new int[] { 1, 2, 3, 4, 5 }));

                // returns false
                System.out
                                .println(new ArrayComparison().compareIntArraysUsingEquals(
                                                new int[] { 1, 2, 3, 4, 5 },
                                                new int[] { 1, 2, 3, 4, 6 }));
                // returns 0
                System.out
                                .println(new ArrayComparison().compareIntArrays(new int[] { 1, 2, 3, 4, 5 },
                                                new int[] { 1, 2, 3, 4, 5 }));
                // returns -1 since the 5th element of array1 > that of
                // array2
                System.out
                                .println(new ArrayComparison().compareIntArrays(new int[] { 1, 2, 3, 4, 5 },
                                                new int[] { 1, 2, 3, 4, 6 }));
                // returns 1 since the 6th element of array1 > that of
                // array2
                System.out
                                .println(new ArrayComparison().compareIntArrays(new int[] { 1, 2, 3, 4, 5, 2, 4 },
                                                new int[] { 1, 2, 3, 4, 5, 1, 2 }));
                System.out.println(
                                new ArrayComparison().compareIntArraysWithRange(new int[] { 1, 2, 3 },
                                                new int[] { 4, 6, 1, 2, 3 }));
                System.out.println(
                                new ArrayComparison().compareIntArraysUnsigned(new int[] { 4, 6, -1, -2, 3 },
                                                new int[] { 4, 6, -1, -2, 3 }));
                // returns -1
                System.out.println(
                                new ArrayComparison().compareIntArraysMismatch(new int[] { 4, 6, -1, -2, 3 },
                                                new int[] { 4, 6, -1, -2, 3 }));
                // returns 2
                System.out.println(
                                new ArrayComparison().compareIntArraysMismatch(new int[] { 4, 6, -1, -2, 3 },
                                                new int[] { 4, 6, 1, -2, 3 }));
                // returns 1
                System.out.println(
                                new ArrayComparison().compareIntArraysWithMismatchRange(new int[] { 4, 6, 3 },
                                                new int[] { 4, 6, 4, -6, 3 }));
        }

        // Using == to compare arrays, doesn't involve the comparison of arrays, it just
        // compares the object reference and if the references are same, it returns
        // true, else false
        public boolean compareIntArraysUsingDoubleEqualto1(int[] arr1) {
                int[] arr2 = arr1;
                return (arr1 == arr2);
        }

        public boolean compareIntArraysUsingDoubleEqualto2(int[] arr1, int[] arr2) {
                return (arr1 == arr2);
        }

        public boolean compareIntArraysUsingEquals(int[] arr1, int[] arr2) {
                return Arrays.equals(arr1, arr2);
        }

        public int compareIntArrays(int[] arr1, int[] arr2) {
                return Arrays.compare(arr1, arr2);
        }

        public int compareIntArraysWithRange(int[] arr1, int[] arr2) {
                // accepts array, from & to ranges as inputs
                return Arrays.compare(arr1, 0, 2, arr2, 2, 4);
        }

        public int compareIntArraysUnsigned(int[] arr1, int[] arr2) {
                return Arrays.compareUnsigned(arr1, arr2);
        }

        public int compareIntArraysMismatch(int[] arr1, int[] arr2) {
                return Arrays.mismatch(arr1, arr2);
        }

        public int compareIntArraysWithMismatchRange(int[] arr1, int[] arr2) {
                // accepts array, from & to ranges as inputs
                return Arrays.mismatch(arr1, 0, 2, arr2, 2, 4);
        }

}
