package com.prac.loops;

import java.util.HashMap;

public class Practice {
	
	int[][] arr = null;
	
	public Practice(int numOfRows, int numOfColumns) {
		
		this.arr = new int[numOfRows][numOfColumns];
		
		for(int row = 0;  row < arr.length; row++) {
			for(int column = 0; column < arr[0].length; column++) {
				arr[row][column] = Integer.MIN_VALUE;
			}
		}	
	}
	
	public void insert(int rows,int columns, int valueToBeChanged) {
		
		try {
			if (arr[rows][columns] == Integer.MIN_VALUE) {
				arr[rows][columns] = valueToBeChanged;
				
				System.out.println("Successfully Inserted: " + arr[rows][columns]);
				
			} else {
				System.out.println("Already Inserted");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D array");
		}
	}
	
	public void accessCell(int row, int col) {
		
		System.out.println("\n Accessing Row#" + row + ", Col#" + col); //--------------------------->O(1)
		try {
			System.out.println("Cell value is: " + arr[row][col]); //-------------------------------->O(1)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D array");
		}
	}
	
	public void traverse2DArray() {
		
		for(int rows = 0; rows < arr.length; rows++) {
			for(int cols = 0; cols < arr[0].length;  cols++) {
				System.out.println(arr[rows][cols] + " ");
			}
		}
		
	}
	
	public void search2DArray(int value) {
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr.length; col++) {
				if (arr[row][col] == value) {
					System.out.println("Value is found at row: " + row + " Col: " + col); //----------------------->O(1)
					return;
				}		
			}
		}
		System.out.println("Value is not found");
	}
	
	public void deleteArray(int row, int col) {
		
		System.out.println("Successfully deleted: " + arr[row][col]);
		
		arr[row][col] = Integer.MIN_VALUE;
		
	}
	
}




