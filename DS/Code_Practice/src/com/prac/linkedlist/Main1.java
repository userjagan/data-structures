package com.prac.linkedlist;

public class Main1 {
	
public static void main(String[] args) {
		
		SingleLinkedList1 sLL = new SingleLinkedList1();
		
		sLL.createSinglyLinkedList(5);
		
		System.out.println(sLL.head.value);
		System.out.println(sLL.head.next);
		
		System.out.println("***");
		
		sLL.insertInLinkedList(7, 0);
		
		sLL.insertInLinkedList(8, 1);
		
		sLL.insertInLinkedList(9, 2);
		
		sLL.insertInLinkedList(10, 4);
		
		sLL.insertInLinkedList(50, 3);
		
		System.out.println(sLL.head.value);
		
		System.out.println(sLL.head.next.value);
		
		System.out.println(sLL.head.next.next.value);
		
		System.out.println(sLL.head.next.next.next.value);
		
		System.out.println(sLL.head.next.next.next.next.value);
		
		System.out.println(sLL.head.next.next.next.next.next.value);
		
		sLL.traverseSinglyLinkedList();
		
		sLL.searchNode(5);
		
		sLL.deletionOfNode(0);
		
		sLL.traverseSinglyLinkedList();
		
		sLL.deleteAll();
		
		sLL.traverseSinglyLinkedList();
		
	}

}
