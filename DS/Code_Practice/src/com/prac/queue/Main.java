package com.prac.queue;

public class Main {
	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(5);
		boolean result = newQueue.isFull();
		System.out.println(result);
		
		boolean result1 = newQueue.isFull();
		System.out.println(result);
	}
}