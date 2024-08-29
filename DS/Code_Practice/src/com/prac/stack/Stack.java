package com.prac.stack;

public class Stack {
	public int[] arr;
	public int topOfStack;
	
	public Stack(int size) {
		this.arr = new int[size]; //--------------------------> O(1)
		this.topOfStack = -1; //--------------------------> O(1)
		System.out.println("The Stack is created with size of: " + size); //--------------------------> O(1)
		// ------------ Time Complexity: O(1), Space Complexity: O(n).
	}
	
	// isEmpty
	public boolean isEmpty() {
		if (topOfStack == -1) { //--------------------------> O(1)
			return true; //--------------------------> O(1)
		} else {
			return false; //--------------------------> O(1)
			// ------------ Time Complexity: O(1), Space Complexity: O(1).
		}
	}
	
	// isFull
	public boolean isFull() {
		if (topOfStack == arr.length-1) { 
//			System.out.println("The Stack is full!");
			return true;
		} else {
			return false;
			// ------------ Time Complexity: O(1), Space Complexity: O(1).
		}
	}
	
	// push
	public void push(int value) {
		if (isFull()) {
			System.out.println("The Stack is full!");
		} else {
			arr[topOfStack+1] = value;
			topOfStack++;
			System.out.println("The value is successfully inserted");
			// ------------ Time Complexity: O(1), Space Complexity: O(1).
		}
	}
	
	// pop
	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int topStack = arr[topOfStack];
			topOfStack--;
			return topStack;
			// ------------ Time Complexity: O(1), Space Complexity: O(1).
		}
	}
	
	// peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("The Stack is empty!");
			return -1;
		} else {
			return arr[topOfStack];
			// ------------ Time Complexity: O(1), Space Complexity: O(1).
		}
	}
	
	// Delete Method
	public void deleteStack() {
		arr = null;
		System.out.println("The Stack is successfully deleted");
		// ------------ Time Complexity: O(1), Space Complexity: O(1).
	}
}





