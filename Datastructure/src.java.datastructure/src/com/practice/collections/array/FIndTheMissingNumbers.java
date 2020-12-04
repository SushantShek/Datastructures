package com.practice.collections.array;

import java.util.*;

public class FIndTheMissingNumbers {
    public static void main(String[] args) {
        int[] A = {4,3,2,7,8,2,3,1};
        findMissing(A);
    }

    private static void findMissing(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> filteredSet = new HashSet<>() ;
        for(int i : arr){
            filteredSet.add(i);
        }
        for(int i=1;i<=arr.length;i++){
            if(!filteredSet.contains(i)){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
