package com.prac.array;

import java.util.Arrays;

public class RemoveDuplicates_LC {

	    public static int[] removeDuplicates(int[] array) {
	    	
	        int n = array.length;
	        
	        int[] uniqueArray = new int[n];
	        
	        int index = 0;
	 
	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int j = i + 1; j < n; j++) {
	                if (array[i] == array[j]) {
	                    isDuplicate = true;
	                    break;
	                } 
	            }
	            if (!isDuplicate) {
	                uniqueArray[index++] = array[i];
	            }
	        }
	        
	        System.out.println(Arrays.toString(uniqueArray));
	 
	        return Arrays.copyOf(uniqueArray, index);
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
