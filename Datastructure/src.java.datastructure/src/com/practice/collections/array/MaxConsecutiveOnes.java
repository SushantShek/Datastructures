package com.practice.collections.array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] A = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(A));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++)
        {

            // Reset count when 0 is found
            if (nums[i] == 0)
                count = 0;
            else
            {
                count++;//increase count
                result = Math.max(result, count);
            }
        }

        return result;


    }
}
