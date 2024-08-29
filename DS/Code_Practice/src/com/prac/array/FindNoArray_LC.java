package com.prac.array;

public class FindNoArray_LC {
	
public static int searchInArray(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
           
            if (nums[i] == target) {
            	
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int target = 5;
        
        int index = searchInArray(intArray, target);
        
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Number not found in the array");
        }
    }
}