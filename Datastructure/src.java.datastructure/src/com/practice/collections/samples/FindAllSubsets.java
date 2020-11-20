package com.practice.collections.samples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindAllSubsets {

    public static void main(String[] args) {
        int[] A = {1,2,3};
        solution(A);
    }

    public static List<ArrayList<Integer>> solution(int[] A){
        List<ArrayList<Integer>> list = new ArrayList<>();

        findSubset(0,A,list,new ArrayList<Integer>());

        System.out.println(list);
        return list;
    }

    private static void findSubset(int i, int[] A, List<ArrayList<Integer>> list, ArrayList<Integer> current) {

        list.add(new ArrayList<>(current));
        for(int x = i; x<A.length; x++){
            current.add(A[x]);
            findSubset(x+1,A,list,current);
            current.remove(current.size() -1);
        }

    }
}
