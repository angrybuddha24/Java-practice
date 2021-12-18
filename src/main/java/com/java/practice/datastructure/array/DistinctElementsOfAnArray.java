package com.java.practice.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctElementsOfAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DistinctElementsOfAnArray()
                .findDistinctElementsOfAnArray(new int[] { 2, 5, 4, 2, 4, 6, 8, 2, 4, 8, 9, 4 })));
    }

    public int[] findDistinctElementsOfAnArray(int[] arr) {
        
        List<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        List<Integer> list = arrayList.stream().distinct().toList();
        int[] arr1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr1[i]=list.get(i);
        }
        return arr1;
    }
}
