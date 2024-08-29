package com.prac.stack;

public class Main1 {
	
	public static void main(String[] args) {
		Stack1 newStack = new Stack1(4);
		
		boolean result = newStack.isEmpty();
		System.out.println(result);
		
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		
		boolean result1 = newStack.isFull();
		System.out.println(result1);
		
//		int result2 = newStack.pop();
//		System.out.println(result2);
//		int result3 = newStack.pop();
//		System.out.println(result3);
		
		int result2 = newStack.peek();
		System.out.println(result2);
		int result3 = newStack.peek();
		System.out.println(result3);

		newStack.deleteStack();
	}

}
