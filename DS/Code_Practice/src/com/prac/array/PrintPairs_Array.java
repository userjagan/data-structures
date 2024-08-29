package com.prac.array;

public class PrintPairs_Array {
	
	public static void PrintPairs(int[] myArray) {
		
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray.length; j++) {
				System.out.println(myArray[i] + " " + myArray[j]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] myArray = {1,3,4,5};
		
		PrintPairs(myArray);
		
	}

}
