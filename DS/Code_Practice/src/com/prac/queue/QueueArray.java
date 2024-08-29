package com.prac.queue;

public class QueueArray {
	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	
	public QueueArray(int size) {
		this.arr = new int[size]; // -------------------> O(1)
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("The Queue is successfully created with size of: " + size);
		// -------- Time Complexity: O(1), Space Complexity: O(N)
	}
	
	public boolean isFull() {
		if(topOfQueue == arr.length-1) {
			return true;
		} else {
			return false;
		}
		// -------- Time Complexity: O(1), Space Complexity: O(1)
	}
	
	// isEmpty
	public boolean isEmpty() {
		if(beginningOfQueue == -1 || beginningOfQueue == arr.length) {
			return true;
		} else {
			return false;
		}
	}
}
