package com.practice.collections.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] A = {5,2,2};
        thirdMax(A);
    }

    public static int thirdMax(int[] nums) {
        int max=0;
        ArrayList<Integer> samplelist= new ArrayList<>();
        for(int z : nums) {
            if (!samplelist.contains(z)){
                samplelist.add(z);
            }
        }
        if(samplelist.size()<3){

              Collections.sort(samplelist);
            max =samplelist.get(samplelist.size()-1);
        }else{
            max= samplelist.get(2);
        }
        System.out.println(max);
    return max;
    }
}
