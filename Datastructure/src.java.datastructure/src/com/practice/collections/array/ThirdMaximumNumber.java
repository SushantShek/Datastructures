package com.practice.collections.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] A = {1,2,2,5,3,5};
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
        Collections.sort(samplelist);
        if(samplelist.size()<3){
            max =samplelist.get(samplelist.size()-1);
        }else{
            max= samplelist.get(samplelist.size()-3);
        }
        System.out.println(max);
    return max;
    }
}
