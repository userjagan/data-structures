package com.prac.array;

import java.util.HashMap;

public class Permutation_LC {
	
	public static boolean permutation(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int nums : array1) {
        	
            elementCount.put(nums, elementCount.getOrDefault(nums, 0) + 1);
        }

        for (int num : array2) {
            if (!elementCount.containsKey(num)) {
                return false;
            }
            elementCount.put(num, elementCount.get(num) - 1);
            if (elementCount.get(num) < 0) {
                return false;
            }
        }
        
        System.out.println(elementCount);
        
        for (int count : elementCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 5};
        int[] array2 = {5, 1, 2, 3, 4, 5};

        System.out.println(permutation(array1, array2));
    }
}