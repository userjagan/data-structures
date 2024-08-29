package com.prac.doublelinkedlist;

public class Main1 {
	
	public static void main(String[] args) {
		
		DoublyLinkedList1 dll = new DoublyLinkedList1();
		dll.createDLL(1);
		
		dll.insertDLL(2, 0);
		dll.insertDLL(3, 1);
		dll.insertDLL(4, 3);
		dll.insertDLL(10, 2);
		System.out.println(dll.head.value);
		System.out.println(dll.head.next.value);
		System.out.println(dll.head.next.next.value);
		System.out.println(dll.head.next.next.next.value);
		System.out.println(dll.tail.value);
		
		dll.traverseDLL();
		dll.reverseTraverseDLL();
		dll.searchNode(4);
		System.out.println();
		dll.deleteNodeDLL(0);
		
		dll.traverseDLL();
		dll.deleteDLL();
		dll.traverseDLL();
	}

}
