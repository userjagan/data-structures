package com.prac.loops;

import java.util.Arrays;

public class PracticeMain {
	
	public static void main(String[] args) {
		
		Practice pc = new Practice(3, 3);
		
		pc.insert(0, 1, 10);
		
		pc.insert(0, 2, 20);
		
		pc.insert(0, 3, 30);
		
		System.out.println("Access Cell");
		
		pc.accessCell(0, 1);
		pc.accessCell(0, 2);
		
		System.out.println("Traverse 2d array");
		
		pc.traverse2DArray();
		
		System.out.println("Seach Arry");
		
		pc.search2DArray(20);
		
		System.out.println("Delete Arry");
		
		pc.deleteArray(0, 2);
		
		System.out.println(Arrays.deepToString(pc.arr));
		
	}
}
