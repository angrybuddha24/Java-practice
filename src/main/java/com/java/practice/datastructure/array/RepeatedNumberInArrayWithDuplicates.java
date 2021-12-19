package com.java.practice.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RepeatedNumberInArrayWithDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RepeatedNumberInArrayWithDuplicates()
                .findTheRepeatedNumberInArrayWithDuplicates(new int[] { 2, 5, 4, 2, 4, 6, 8, 2, 4, 8, 9, 4 })));

    }

    public int[] findTheRepeatedNumberInArrayWithDuplicates(int[] arr) {
        int[] arr1 = new int[arr.length];
        int zeroCount = 0;
        int counter = 0;

        Arrays.sort(arr);
        // check whether the nth element and n+1th element are same, if so add it to a
        // new array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                arr1[counter] = arr[i + 1];
                counter++;
            }
        }

        // check if the original array contained more than one 0, if so increase the
        // zero counter accordingly
        for (int i : arr) {
            if (i == 0) {
                zeroCount += 1;
            }
        }

        // filter out the extra 0s that are in the array due to extra space
        Arrays.stream(arr1).filter(a -> a != 0).toArray();

        // add the elements of array to an arraylist
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(arr1).boxed().toArray(Integer[]::new));

        // retain distinct elements
        List<Integer> list1 = list.stream().distinct().toList();

        // if there were no duplicate 0s in the initial array remove them
        if (zeroCount <= 1) {
            list1.removeIf(a -> a == 0);
        }

        // convert the arraylist to array
        return list1.stream().mapToInt(i -> i).toArray();
    }

}
