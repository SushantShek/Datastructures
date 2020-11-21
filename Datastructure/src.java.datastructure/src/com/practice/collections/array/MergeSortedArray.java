package com.practice.collections.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] A ={1,2,3,0,0,0};
        int lenA= A.length;
        int[] B ={2,5,6};
        int lenB= B.length;
        mergeArray(A, lenA, B, lenB);
    }

    private static void mergeArray(int[] a, int m, int[] b, int n) {
        int x= m-1;
        int y = n-1;

        int[] f = a.clone();
        while(n !=0){
            --m;
            a[m]= b[y];
            y--;
            n--;
        }
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
    }

    // Second solution in line with LeetCode
    private static void mergeArray2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}