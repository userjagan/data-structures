package com.prac.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Search {
	
	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
		
		for(String letter : stringList) {
			if(letter.equals("B")) {
				System.out.println("The element is found");
				break;
			}
		}
		
		int index = stringList.indexOf("B");
		System.out.println("The element is found at index: " + index);
		
	}

}
