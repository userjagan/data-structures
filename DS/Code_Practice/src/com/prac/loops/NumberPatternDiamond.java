package com.prac.loops;

public class NumberPatternDiamond {
	
	public static void main(String[] args) {
		
		
		int n = 5;
        
		for(int rows= 1; rows <= 2 * n; rows++) {
			
			int c = rows > n ? 2 * n - rows: rows;
			
			for(int space = 0; space < n - c; space++) {
				
				System.out.print("  ");
				
			}
			
			for(int cols = c; cols >= 1; cols--) {
				
				System.out.print(cols + " ");
				
			}
			
			
			for(int cols = 2; cols <= c; cols++) {
				
				System.out.print(cols + " ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
