package com.prac.linkedlist;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		SingleLinkedList sLL = new SingleLinkedList();
		
		sLL.createSinglyLinkedList(5);
		
		System.out.println(sLL.head.value);
		System.out.println(sLL.head.next);
		
		System.out.println("***");
		
//		sLL.insertInLinkedList(6, 0);
//		
//		sLL.insertInLinkedList(7, 1);
//		
//		sLL.insertInLinkedList(8, 2);
//		
//		sLL.insertInLinkedList(9, 4);
		
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
		
		sLL.searchNode(50);
		
		sLL.deletionOfNode(1);
		
		sLL.traverseSinglyLinkedList();
		
		sLL.deleteAll();
		
		sLL.traverseSinglyLinkedList();
		
	}
	

}
