package com.java.practice.datastructure.array;

public class SumTOLeftAndRightOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5, 6, 7, 0, 11, 8, 9};
        int num = 6;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index=i;
            }
        }
        int leftsum = 0;
        int rightsum = 0;

        for (int i = 0; i < index; i++) {
            leftsum += arr[i];
        }

        for (int i = index+1; i < arr.length; i++) {
            rightsum += arr[i];
        }

        System.out.printf("The left sum is: %d, the right sum is: %d",leftsum, rightsum);
    }
}
