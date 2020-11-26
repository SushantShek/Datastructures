package com.practice.collections.array;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] A ={0,1,2};
        sortEvenOdd(A);
    }
    private static void sortEvenOdd(int[] arr){

        int i=0;
        int j=arr.length-1;
        while(i <=j){
            if(arr[i] %2 ==0){
                i++;
            }else{
                int tmp = arr[j];
                arr[j]=arr[i];
                arr[i]= tmp;
                j--;
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
