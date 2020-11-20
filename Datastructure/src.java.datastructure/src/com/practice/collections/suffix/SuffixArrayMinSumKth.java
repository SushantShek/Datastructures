package com.practice.collections.suffix;

import java.util.Arrays;

public class SuffixArrayMinSumKth {
    static int k =2;

    public static int findKmin( int[] A, int k){
       int len = A.length;
       int[] suffixArray = new int[len];
        suffixArray[len - 1] = A[len - 1];

        // Find the suffix array
        for (int i = len - 2; i >= 0; i--) {
            suffixArray[i]
                    = Math.min(suffixArray[i + 1],
                    A[i]);
        }
        System.out.println("suffixArray [] "+ Arrays.toString(suffixArray));

        int min_sum = Integer.MAX_VALUE;

        // Iterate in the array
        for (int i = 0; i < len; i++) {
            if (i + k < len) {
                System.out.println("suffixArr>>> ="+A[i] +" "+
                        + suffixArray[i + k]);
                System.out.println("minsum ="+ min_sum);
                // Update minimum sum
                min_sum = Math.min(min_sum, A[i]+ suffixArray[i + k]);
            }
        }

        // Print the answer
        System.out.println("first = "+min_sum);


        return min_sum;
    }
    public static void main(String[] args) {
        int[]A = {1,7,3,9,5,2,8};
        findKmin(A,k);
    }
}
