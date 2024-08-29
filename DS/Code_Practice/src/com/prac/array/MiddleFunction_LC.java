package com.prac.array;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class MiddleFunction_LC {
	
	public static int[] middle(int[] arrray) {
		
		if(arrray.length <= 2) {
			return new int[0];
		}
		
		int[] result = new int[arrray.length - 2];
		
		System.out.println(result.length);
		
		for(int i = 1; i < arrray.length - 1; i++) {
			result[i - 1] = arrray[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] myArray = new int[n];
        System.out.print("Enter the elements of the array:");
        System.out.println();
        for(int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
        }
		
		int[] middleArray = middle(myArray);
		
		for(int value : middleArray) {
			System.out.print(value + " ");
		}
		
	}
    
}
