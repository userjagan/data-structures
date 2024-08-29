package com.prac.array;

import java.util.Arrays;

public class TDAmain {
	
	public static void main(String[] args) {
		
		TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
		
		sda.insertValueInTheArray(0, 0, 10);
		
		sda.insertValueInTheArray(0, 0, 20);
		
		System.out.println(Arrays.deepToString(sda.arr));
		
		sda.insertValueInTheArray(0, 1, 20);
		
		// Accessing cell value from given array
		
		sda.accessCell(0, 1);
		
		// Traverse 2D Array
		
		sda.insertValueInTheArray(1, 0, 30);
		
		sda.insertValueInTheArray(2, 0, 40);
		
		sda.traverse2DArray();
		
		// Searching a single value from the Array
		
		sda.searchingValue(40);
		
		// Deleting a value from Array
		
		System.out.println(Arrays.deepToString(sda.arr));
		sda.deleteValuefromArray(0, 0);
		System.out.println(Arrays.deepToString(sda.arr));
		
	}

}
