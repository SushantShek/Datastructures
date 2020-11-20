package com.practice.collections.array;

public class NumberswithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] A = {22,555,901,482,1771};
        System.out.println(findNumbers(A));
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i =0; i< nums.length; i++){
            System.out.println(Math.log10(nums[i]));
            int x = (int) Math.log10(nums[i]) +1;
            if( x%2 == 0){ count++;}
        }
        return count;
    }
}
