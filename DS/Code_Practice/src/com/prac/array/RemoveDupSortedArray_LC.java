package com.prac.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupSortedArray_LC {
	
	public static int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//        
//        System.out.println(i+1);
//        return i + 1;
		
		if (nums.length == 0) return 0;

        Set<Integer> uniqueElements = new HashSet<>();
        int index = 0;

        for (int num : nums) {
            if (uniqueElements.add(num)) {
                nums[index++] = num;
            }
        }
        
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[index++]);
        return index;
    }

    public static void main(String[] args) {
    	
        int[] nums = {19, 18, 19, 25, 67, 89, 19, 18};
        int newLength = removeDuplicates(nums);
        System.out.println("The length of the array after removing duplicates: " + newLength);
        System.out.print("The array after removing duplicates: ");
        
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}