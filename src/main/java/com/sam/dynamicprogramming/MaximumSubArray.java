package com.sam.dynamicprogramming;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23

Constraints:
1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105

Follow up: If you have figured out the O(n) solution, try coding another solution using
the divide and conquer approach, which is more subtle.
*/

import static java.lang.Math.max;

public class MaximumSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4} ));
    }

    public static int maxSubArray(int[] nums) {
        int max;
        int [] maxi = new int[nums.length];
        maxi[0]=max =nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxi[i] = maxx(nums[i],nums[i]+maxi[i-1]);
            if (maxi[i]>max)
                max = maxi[i];
        }
        return max;
    }
    public static int maxx(int x, int y){
        return x>y?x:y;
    }
}
