package com.prac.loops;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		int n = 4;
        
		for(int rows= 1; rows <= n; rows++) {
			
			for(int space = 0; space < n - rows; space++) {
				
				System.out.print("  ");
				
			}
			
			for(int cols = rows; cols >= 1; cols--) {
				
				System.out.print(cols + " ");
				
			}
			
			
			for(int cols = 2; cols <= rows; cols++) {
				
				System.out.print(cols + " ");
				
			}
			
			System.out.println();
		}
		
	}

}
