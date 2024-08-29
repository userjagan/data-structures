package com.prac.array;

import java.util.Scanner;

public class MissingNumber_LC {
	
	public static int findMissingNumberInArray(int[] array, int min, int max) {
        
        int expectedSum = (max * (max + 1)) / 2 - min * ((min - 1) ) / 2;

        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int nMinusOne = sc.nextInt();

        int[] myArray = new int[nMinusOne];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < nMinusOne; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.print("Enter the minimum value in the range: ");
        int min = sc.nextInt();

        System.out.print("Enter the maximum value in the range: ");
        int max = sc.nextInt();

        int missingNumber = findMissingNumberInArray(myArray, min, max);
        System.out.println("The missing number is: " + missingNumber);
    }
}