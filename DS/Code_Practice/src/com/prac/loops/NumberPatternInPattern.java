package com.prac.loops;

public class NumberPatternInPattern {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int originalN = n;
		
		n = 2 * n;
		
		for (int rows = 0; rows <= n; rows++) {
			
			for (int cols = 0; cols <= n; cols++) {
//				System.out.println(Math.min(Math.min(rows, cols), Math.min(n - rows, n - cols)));
				int atEveryIndex = originalN - Math.min(Math.min(rows, cols), Math.min(n - rows, n - cols));
				
				System.out.print(atEveryIndex + " ");
			}
			
			System.out.println();
		}
		
	}

}
	

