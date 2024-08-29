package com.prac.array;

public class SumAndProduct_Array {
	
	public static void sumAndProduct(int[] array) {
		
		int sum = 0; // ---------------------------------------------> O(1)
		
		int product = 1; // -----------------------------------------> O(1)
		
		for(int i = 0; i < array.length; i++) { // ------------------> O(N)
			sum += array[i]; // -------------------------------------> O(1)
		}
		
		for(int i = 0; i < array.length; i++) { // ------------------> O(N)
			product *= array[i]; // ---------------------------------> O(1)
		}
		
		System.out.println("Sum of Array: " + sum); // --------------> O(1)
		
		System.out.println("Product of Array: " + product); // ------> O(1)
		
	}
	
	public static void main(String[] args) {
		
		int[] myArray = {1,3,4,7};
		
		sumAndProduct(myArray);
		
	}

}
