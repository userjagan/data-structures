package com.prac.array;

import java.util.HashSet;

public class UniqueArrayChecker_LC {
	
	public static Boolean isUnique(int[] myArrray) {
		
		HashSet <Integer> seenElements = new HashSet<>();
		
		for(int nums : myArrray) {
			if(!seenElements.add(nums)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] myArrray1 = {10,30,20,70,90,60,80};
		
		boolean tell1 = isUnique(myArrray1);
		
		int[] myArrray2 = {10,30,20,70,90,60,10};
		
		boolean tell2 = isUnique(myArrray2);
		
		System.out.println(tell1);
		
		System.out.println(tell2);
		
		System.out.println("Array 2 is unique: " + isUnique(myArrray2));
	}

}
