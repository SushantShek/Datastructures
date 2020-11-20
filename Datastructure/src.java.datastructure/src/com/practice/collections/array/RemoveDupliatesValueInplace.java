package com.practice.collections.array;

public class RemoveDupliatesValueInplace {
    public static void main(String[] args) {
        int[] A = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(A,2));
    }
    public static int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;

        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }

            j++;
        }

        return i;
    }
}
