package com.practice.collections.array;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementOnRight {

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};

        findAndReplace(A);
    }

    private static void findAndReplace(int[] arr) {
        int size = arr.length;

        // Initialize the next greatest element
        int max_from_right =  arr[size-1];
        arr[size-1] = -1;

        // Replace all other elements with the next greatest
        for (int i = size-2; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max_from_right;

            if(max_from_right < temp)
                max_from_right = temp;
        }

        System.out.println("Output : " + Arrays.toString(arr));
    }
}
