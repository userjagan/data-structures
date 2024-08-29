package com.prac.stacklinkedlist;

public class Stack1 {
	LinkedList linkedList;
	
	public Stack1() {
		linkedList = new LinkedList();
	}
	
	public void push(int value) {
		linkedList.insertInLinkedList(value, 0);
		System.out.println();
	}
}
