package com.prac.loops;

public class Loops {
	
	public static void main(String[] args)
    {
		
		int n = 4;
        
		for(int rows= 0; rows <= 2*n; rows++) {
			
			int totalColsInRow = rows > n ? 2*n-rows : rows; 
			
			for(int cols = 0; cols <= totalColsInRow; cols++) {
				
				System.out.print(" *");
				
			}
			
			System.out.println();
		}
		
    }

}