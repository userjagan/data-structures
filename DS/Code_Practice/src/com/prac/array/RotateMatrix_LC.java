package com.prac.array;

import java.util.Arrays;

public class RotateMatrix_LC {
	
	public boolean rotateMatrix(int[][] matrix) {
	    if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
	    
	    int n = matrix.length;
	    
	    for (int layer = 0; layer < n/2; layer++) {
	      int first = layer;
	      int last = n  - layer - 1;
	      for (int i=first; i<last; i++) {
	        int offset = i - first;
	        int top = matrix[first][i];
	        matrix[first][i] = matrix[last-offset][first];
	        matrix[last-offset][first] = matrix[last][last-offset];
	        matrix[last][last-offset] = matrix[i][last];
	        matrix[i][last] = top;

	      }

	    }
	    return true;

	  }
	
	public static void main(String[] args) {
		RotateMatrix_LC mn = new RotateMatrix_LC();
	    int[][] matrix = {{1,2,3},
	    				 {4,5,6},
	    				 {7,8,9}};
	    mn.rotateMatrix(matrix);
//	    System.out.println(Arrays.deepToString(matrix));
	    
	    for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


	  }

}
