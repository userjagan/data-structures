package com.prac.circulardoublelinkedlist;

public class Main {
	public static void main(String[] args) {
		
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		
		cdll.createCDLL(4);

		System.out.println(cdll.head.value);
		
		cdll.insertNode(1, 0);
		cdll.insertNode(2, 1);
		cdll.insertNode(3, 2);
		cdll.insertNode(5, 3);
//		cdll.insertNode(6, 2);
		System.out.println(cdll.head.next.value);
		System.out.println(cdll.tail.value);
		System.out.println(cdll.tail.next.value);
		
		cdll.traverseCDLL();
		cdll.reverseTraversalCDLL();
		System.out.println();
		cdll.searchNode(5);
		System.out.println();
		cdll.deleteNode(3);
		cdll.traverseCDLL();
		cdll.deleteCDLL();
		cdll.traverseCDLL();
	}
}
