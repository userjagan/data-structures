package com.prac.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Delete {
	
	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		
		stringList.remove("C");
		
		System.out.println(stringList);

		
	}

}
