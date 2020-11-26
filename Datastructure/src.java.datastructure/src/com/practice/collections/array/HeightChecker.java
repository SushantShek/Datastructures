package com.practice.collections.array;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] A = {5,1,2,3,4};
        sortAndOrder(A);
    }

    private static void sortAndOrder(int[] arr) {
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        int changes=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] != tmp[i]){
               changes++;
            }
        }
        System.out.println("Number of changes = " + (changes));
    }
}
