package com.prac.array;

import java.util.Arrays;

public class Omain {
	
	public static void main(String[] args) {
		
		SingleDimensionArray sda = new SingleDimensionArray(10);
		
		sda.insert(0,0);
		sda.insert(1,10);
		sda.insert(2,20);
		sda.insert(3,30);
		sda.insert(4,120);
		sda.insert(5, 10);

		
		System.out.println(Arrays.toString(sda.arr));
		
		// Accessing elements in array
		
		var firstElement = sda.arr[0]; // --------------------->(O)1
		System.out.println(firstElement);
		
		var thirdElement = sda.arr[2];
		System.out.println(thirdElement); // ------------------->(O)1
		
		// ---------------------------Total time complexity -> O(1)
		// ---------------------------     Space complexity -> O(1)
		
		// Array Traversal
		
		System.out.println("Array Traversal");
		sda.traverseArray();
		
		// Search an Array
		
		sda.searchInArray(120);
		
		// Delete value from Array
		
		sda.deleteValue(1);
//		System.out.println(sda.arr[0]);
		
		System.out.println(Arrays.toString(sda.arr));
		
	}


	
}
