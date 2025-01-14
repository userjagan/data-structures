package com.prac.array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoD_Arrays_LC {
	
	 public static int sumDiagonalElements(int[][] array) {
	        int sum = 0;
	        
	        for (int i = 0; i < array.length; i++) {
	        	
	        	System.out.println(Arrays.toString(array[i]));
	        	
	            for (int j = 0; j < array[0].length; j++) {
	                if (i == j || i + j == array.length - 1) {
	                    sum += array[i][j];
	                }
	            }
	        }
	        return sum;
	    }


	
    public static void main(String[] args) {
        int[][] myArray2D = {{1, 2, 3}, 
        					{4, 5, 6}, 
        					{7, 8, 9}};
        int diagonalSum = sumDiagonalElements(myArray2D);
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}