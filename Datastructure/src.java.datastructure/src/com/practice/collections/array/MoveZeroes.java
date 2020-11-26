package com.practice.collections.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] A = {0,1,0,3,12};
        swapZeros(A);
    }

    private static void swapZeros(int[] arr){
        int first=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[first];
                arr[first] = arr[i];
                arr[i] = temp;
                first++;
            }
            System.out.println("After -> "+Arrays.toString(arr));
        }
    }
}
