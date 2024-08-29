package com.prac.linkedlist;

public class SingleLinkedList1 {
	
	public Node1 head;
	public Node1 tail;
	public int size;
	
	public Node1 createSinglyLinkedList(int nodeValue) {
		
		Node1 node1 = new Node1();
		node1.value = nodeValue;
		node1.next = null;
		head = node1;
		tail = node1;
		size = 1;
		return head;					
	}
	
	public void insertInLinkedList(int nodeValue, int location) {
		
		Node1 node1 = new Node1();
		node1.value = nodeValue;
		if (head == null) {
			createSinglyLinkedList(nodeValue);
			return;
		}
		else if (location == 0) {
			node1.next = head;
			head = node1;
		}
		else if (location >= size) {
			node1.next = null;
			tail.next = node1;
			tail = node1;
		}
		else {
			Node1 tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node1 nextNode = tempNode.next;
			tempNode.next = node1;
			node1.next = nextNode;
		}
		size++;
	}
	
	public void traverseSinglyLinkedList() {
		if(head == null) {
			System.out.println("SLL doesnt exist");
		} else {
		Node1 tempNode = head;
		for(int i = 0; i < size; i++) {
			System.out.print(tempNode.value + " ");
			if (i != size - 1) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.next;
		}}
		System.out.println("\n");
	}
	
	boolean searchNode(int nodeValue) {
		if(head != null) {
			Node1 tempNode = head;
			for(int i = 0; i < size; i++) {
				if(tempNode.value == nodeValue) {
					System.out.println("Node found at " +i+"\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found!");
		return false;
	}
	
//	public void deletionOfNode(int location) {
//		if(head == null) { // -------------------------------------> O(1)
//			System.out.println("The SLL does not exist");
//			return;
//		}else if (location == 0) { // -------------------------------------> O(1)
//			head = head.next; // -------------------------------------> O(1)
//			size--; // -------------------------------------> O(1)
//			if (size == 0) { // -------------------------------------> O(1)
//				tail = null; // -------------------------------------> O(1)
//			}
//		}else if (location >= size) { // -------------------------------------> O(1)
//			Node1 tempNode = head; // -------------------------------------> O(1)
//			for(int i = 0; i < size - 1; i++) { // -------------------------------------> O(N)
//				tempNode = tempNode.next; // -------------------------------------> O(1)
//			}
//			System.out.println(tempNode.value);
//			if (tempNode == head) { // -------------------------------------> O(1)
//				tail = head = null; // -------------------------------------> O(1)
//				size--; // -------------------------------------> O(1)
//				return; // -------------------------------------> O(1)
//			}
//			tempNode.next = null; // -------------------------------------> O(1)
//			tail = tempNode; // -------------------------------------> O(1)
//			size--; // -------------------------------------> O(1)
//		}else {
//			Node1 tempNode = head;
//			for (int i = 0; i < location-1; i++) { // -------------------------------------> O(1)
//				tempNode = tempNode.next; // -------------------------------------> O(1)
//			}
//			tempNode.next = tempNode.next.next; // -------------------------------------> O(1)
//			size--; // -------------------------------------> O(1)
//		}
//	}
	
	public void deletionOfNode(int location) {
		if(head == null) {
			System.out.println(" SLL does not exist");
			return;
		}
		if(location < 0 && location >= size) {
			System.out.println("Node does not exist at location: " + location);
			return;
		}
		if(location == 0) {
			head = head.next;
			size--;
			System.out.println("Node successfully deleted at location: "+ location);
			if(location == size - 1) {
				tail = null;
			}
			return;
		}
		Node1 tempNode =  head;
		for(int i = 0; i < location - 1; i++) {
			tempNode = tempNode.next;
		}
		tempNode.next = tempNode.next.next;
//		size--;
		if(location == size - 1) {
			tail = null;
		}
		size--;
		System.out.println("Node successfully deleted at location: "+ location);
	}
	
	public void deleteAll() {
		head = null;
		tail = null;
		System.out.println("the node doesnot exist");
	}
	
}







