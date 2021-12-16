package com.java.practice.datastructure.array;

import java.util.Arrays;

public class TwoDimensionalArrayPrograms {

    public void print2DArray() {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        System.out.println(Arrays.deepToString(arr));

        int[][] arr1 = new int[][] { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.deepToString(arr1));

        int[][] arr2 = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.deepToString(arr2));

        int[][] arr3 = { { 1, 2 }, { 3, 4 } };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.println(arr3[i][j] + " ");
            }
        }
    }

    public int sumOfMatrixElements() {

        int[][] arr3 = { { 1, 2 }, { 3, 4 } };
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                sum += arr3[i][j];
            }
        }
        return sum;
    }

    public int sumOfDiagonalElementsOfMatrix() {

        int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j += 2) {
                sum += arr3[i][j];
            }
        }
        return sum;
    }

    public void rowSumAndColumnSumOfMatrix() {

        int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < arr3[0].length; i++) {
            for (int j = 0; j < arr3[0].length;j++) {
                rowSum += arr3[i][j];
                colSum += arr3[j][i];
            }
            System.out.println("row sum " + (i + 1) + " : " + rowSum);
            System.out.println("col sum " + (i + 1) + " : " + colSum);
        }
    }

    public static void main(String[] args) {
        // new TwoDimensionalArrayPrograms().print2DArray();
        // System.out.println(new TwoDimensionalArrayPrograms().sumOfMatrixElements());
        // System.out.println(new
        // TwoDimensionalArrayPrograms().sumOfDiagonalElementsOfMatrix());
        new TwoDimensionalArrayPrograms().rowSumAndColumnSumOfMatrix();
    }
}
