package com.practice.collections.array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] A = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(A)));

    }
    public static int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] output = new int[len];

        for(int i=0; i<len; i++){
            output[i]= A[i]*A[i];
        }
        Arrays.sort(output);
        return output;
    }
}
