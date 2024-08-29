package com.prac.array;

import java.util.Arrays;

public class ReverseArray_Function {
	
	public static void PrintPairs(int[] myArray) {
		
//		System.out.println(myArray.length/2);
		
		for(int i = 0; i < myArray.length/2; i++) { // -------------------> O(N/2)
			
			int other = myArray.length-i-1; // -----------------------------> O(1)
			int temp = myArray[i]; // --------------------------------------> O(1)
			myArray[i] = myArray[other]; // --------------------------------> O(1)
			myArray[other] = temp; // --------------------------------------> O(1)
		}
		System.out.println(Arrays.toString(myArray)); // -------------------> O(N)
		
	}
	
	public static void main(String[] args) {
		
		int[] myArray = {1,3,4,5, 6, 7, 8};
		
		PrintPairs(myArray);
		
	}

}
