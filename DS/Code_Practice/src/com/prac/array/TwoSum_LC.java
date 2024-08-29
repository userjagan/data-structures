package com.prac.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_LC {
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Indices: " + result1[0] + ", " + result1[1]); // Output: Indices: 0, 1

        int[] nums2 = {3, 2, 4, 5, 6, 3};
        int target2 = 8;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Indices: " + result2[0] + ", " + result2[1]); // Output: Indices: 1, 2
        
        int[] nums3 = {14, 8, 8, 12, 23, 6 , 17, 9};
        int target3 = 21;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Indices: " + result3[0] + ", " + result3[1]);
    }
}