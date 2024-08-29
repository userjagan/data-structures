package com.prac.array;

public class MaxTwoProducts_LC {
	
	public static String maxProduct(int[] myArrray) {
		
		int maxProduct = 0;
		
		String pairsty = " ";
		
		for(int i = 0; i < myArrray.length; i++) {
			for(int j = i+1; j < myArrray.length; j++) {
				if(myArrray[i] * myArrray[j] > maxProduct) {
					maxProduct = myArrray[i] * myArrray[j];
					pairsty = Integer.toString(myArrray[i]) + ", " + Integer.toString(myArrray[j]); 
				}
			}
		}
		
		
		
		return pairsty;
	}
	
	public static void main(String[] args) {
		
		int[] myArrray = {10,30,20,70,90,60,80};
		
		String pairs = maxProduct(myArrray);
		
		System.out.println("Max two products are: " + pairs);
		
	}

}
