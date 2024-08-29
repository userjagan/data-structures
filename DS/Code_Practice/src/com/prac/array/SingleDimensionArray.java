package com.prac.array;

public class SingleDimensionArray {
	
	int arr[] = null;
	

	public SingleDimensionArray(int sizeOfArray) {
		
		arr = new int[sizeOfArray];
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
			
			// -------------------------- Total time complexity -> O(N)
			// ---------------------------     Space complexity -> O(N)
		}
		
	}


	public void insert(int location, int valueToBeInserted) {
		
		try {
			if(arr[location] == Integer.MIN_VALUE) { //-------------->O(1)
				arr[location] = valueToBeInserted;	//--------------->O(1)
				System.out.println("Successfully Inserted"); //------>O(1)
			} else {
				System.out.println("This cell is already occupied");//>O(1)
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array:"); //-->O(1)
			
			// ---------------------------Total time complexity -> O(1)
			// ---------------------------     Space complexity -> O(1)
		}
		
	}

	// Array Traversal
	
	public void traverseArray() {
		
		try {
			for (int i = 0; i < arr.length; i++) { //-------------->O(N)
				System.out.print(arr[i] + " ");    //-------------->O(1)
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Array no longer exists!"); //------->O(1)
			
			// ---------------------------Total time complexity -> O(N)
			// ---------------------------     Space complexity -> O(1)
		}
		
	}
		
		// Corrected searchInArray method
		public void searchInArray(int valueToSearch) {
			boolean found = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == valueToSearch) {
					System.out.println("Value is found at the index of " + i);
					found = true;
					break; // Exit the loop once the value is found
				}
			}
			if (!found) {
				System.out.println(valueToSearch + " is not found");
			}
		}
	
	// Delete value from Array
	
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex] = Integer.MIN_VALUE; //----------------------------------------->O(1)
			System.out.println("The value has been deleted successfully"); //----------------------->O(1)
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array"); //-------->O(1)
			
			// ---------------------------Total time complexity -> O(1)
			// ---------------------------     Space complexity -> O(1)
			
		}
	}
	
	
}








