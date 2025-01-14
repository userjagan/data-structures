package com.prac.circulardoublelinkedlist;

public class Main1 {
	public static void main(String[] args) {
		
		CircularDoublyLinkedList1 cdll = new CircularDoublyLinkedList1();
		
		cdll.createCDLL(4);
		System.out.println(cdll.head.value);
		System.out.println(cdll.tail.value);
		
		cdll.insetNode(1, 0);
		cdll.insetNode(2, 1);
		cdll.insetNode(3, 2);
		cdll.insetNode(5, 3);
		System.out.println(cdll.head.next.value);
		
		cdll.traverseCDLL();
		
		cdll.reversetraverseCDLL();
		
		cdll.searchNode(5);
		
		cdll.deleteNode(4);
		cdll.traverseCDLL();
		
		cdll.deleteCDLL();
		cdll.traverseCDLL();
	}
}
