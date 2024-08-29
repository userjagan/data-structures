package com.prac.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2_LC {
	
public static int[] removeDuplicates(int[] array) {
        
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }
        
        // Convert the Set back to an array
        
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 2, 3, 4, 5};
        
        int[] uniqueArray = removeDuplicates(myArray);
        
        System.out.print("Array with unique elements: ");
        for (int value : uniqueArray) {
            System.out.print(value + " ");
        }
    }


}
