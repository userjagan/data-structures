package com.prac.stack;

public class Stack1 {
	public int[] arr;
	public int topOfStack;
	
	public Stack1(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("The Stack is created with size of: " + size);
	}
	
	public boolean isEmpty() {
		if(topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(topOfStack == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("The Stack is full!");
		} else {
			arr[topOfStack+1] = value;
			topOfStack++;
			System.out.println("Successfully inserted!");
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int topStack = arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Stack is empty!");
			return -1;
		} else {
			return arr[topOfStack];
		}
	}
	
	public void deleteStack() {
		arr = null;
		System.out.println("Method successfully deleted");
	}

}
