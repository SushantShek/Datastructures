package com.practice.collections.array;

import java.util.Arrays;

public class InsertDuplicateZeros {
    public static void main(String[] args) {
        int[] A = {1,0,2,3,0,4,5,0};
        duplicateZeros(A);
    }
    public static void duplicateZeros(int[] arr) {
        for(int x=0;x<arr.length;x++){
            try{
                if(arr[x] == 0){
//                    System.out.println("index = "+ x);
                    for (int i = arr.length-2; i >= x; i--) {
                        arr[i + 1] = arr[i];
//                        System.out.println(" -> "+ Arrays.toString(arr));
                    }
                    x+= 1;
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
