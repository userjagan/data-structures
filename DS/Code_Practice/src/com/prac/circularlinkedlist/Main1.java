package com.prac.circularlinkedlist;

public class Main1 {
	
public static void main(String[] args) {
		
		CircularSinglyLinkedList1 csll = new CircularSinglyLinkedList1();
		
		csll.createCSLL(5);
		csll.insertCSLL(4, 0);
		csll.insertCSLL(6, 1);
		csll.insertCSLL(7, 8);
		csll.traverseCSLL();
		csll.searchNode(6);
		
		csll.deleteNode(4);
		csll.traverseCSLL();
		System.out.println("***");
		
		csll.deleteCSLL();
		csll.traverseCSLL();
	}

}
