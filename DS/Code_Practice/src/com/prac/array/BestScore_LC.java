package com.prac.array;

import java.util.Arrays;
import java.util.Scanner;

public class BestScore_LC {
	
	public static int[] firstSecond(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        System.out.println(Arrays.toString(array));

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return new int[] {first, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] myArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
        }

        try {
            int[] result = firstSecond(myArray);
            System.out.println("First and second best scores are: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}