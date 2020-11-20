package com.practice.collections.suffix;

public class ContiguousArrayMaxSum {
    public static void main(String [] args){
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSum(A);
    }

    private static void findMaxSum(int[] a) {
        int maxSum = a[0];
        int lastMax= a[0];

        for(int i=1; i< a.length; i++){

            lastMax   = Math.max((lastMax + a[i]),a[i]);
            maxSum = Math.max(lastMax,maxSum);

        }
        System.out.println("Max Sum =" + maxSum);
    }
}
