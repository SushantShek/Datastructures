package com.practice.collections.array;

public class RemoveAllDuplicatesInplace {
    public static void main(String[] args) {
        int[] A={0,0,1,1,1,2,2,3,3,4,5,5,5,6,6,6,6,6,7};
        System.out.println(removeDuplicates(A));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;

        int j = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }

            i++;
        }

        return j + 1;
    }
}
