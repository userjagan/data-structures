package com.prac.circularlinkedlist;

public class CircularSinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createCSLL(int nodeValue) {
		
		Node node = new Node(); // ------------------------------> O(1)
		node.value = nodeValue; // ------------------------------> O(1)
		node.next = node; // ------------------------------> O(1)
		head = node; // ------------------------------> O(1)
		tail = node; // ------------------------------> O(1)
		size = 1; // ------------------------------> O(1)
		return head; // ------------------------------> O(1)
		// Time complexity: O(1), Space complexity: O(1)
	}
	
	public void insertCSLL(int nodeValue, int location) {
		Node node = new Node(); // ------------------------------> O(1)
		node.value = nodeValue; // ------------------------------> O(1)
		if(head == null) { // ------------------------------> O(1)
			createCSLL(nodeValue); // ------------------------------> O(1)
			return;   // ------------------------------> O(1)
		}else if (location == 0) { // ------------------------------> O(1)
			node.next = head; // ------------------------------> O(1)
			head = node; // ------------------------------> O(1)
			tail.next = head; // ------------------------------> O(1)
		}else if (location >= size) { // ------------------------------> O(1)
			tail.next = node; // ------------------------------> O(1)
			tail = node; // ------------------------------> O(1)
			tail.next = head; // ------------------------------> O(1)
		}else { // ------------------------------> O(1)
			Node tempNode = head; // ------------------------------> O(1)
			int index = 0; // ------------------------------> O(1)
			while (index < location - 1) { // ------------------------------> O(N)
				tempNode = tempNode.next; // ------------------------------> O(1)
				index++; // ------------------------------> O(1)
			} 
			node.next = tempNode.next; // ------------------------------> O(1)
			tempNode.next = node; // ------------------------------> O(1)
		} 
		size++; // ------------------------------> O(1)
		// Time complexity: O(N), Space complexity: O(1)
	}
	
	public void traverseCSLL() { 
		if (head != null) { // ------------------------------> O(1)
			Node tempNode = head; // ------------------------------> O(1)
			for(int i = 0; i < size; i++) { // ------------------------------> O(N)
				System.out.print(tempNode.value); // ------------------------------> O(1)
				if (i != size - 1) { // ------------------------------> O(1)
					System.out.print(" -> "); // ------------------------------> O(1)
				}
				tempNode = tempNode.next; // ------------------------------> O(1)
			}
			System.out.println("\n"); // ------------------------------> O(1)
		} else {
			System.out.println("\n CSLL does not exist"); // ------------------------------> O(1)
			// Time complexity: O(N), Space complexity: O(1)
		}
	}
	
	public boolean searchNode(int nodeValue) {
		if(head != null) { // ------------------------------> O(1)
			Node tempNode = head; // ------------------------------> O(1)
			for(int i = 0; i < size; i++) { // ------------------------------> O(N)
				if(tempNode.value == nodeValue) { // ------------------------------> O(1)
					System.out.println("Found node at location: " + i); // ------------------------------> O(1)
					return true; // ------------------------------> O(1)
				}
				tempNode = tempNode.next; // ------------------------------> O(1)
			}
		}
		System.out.println("Node not found: "); // ------------------------------> O(1)
		return false; // ------------------------------> O(1)
		// Time complexity: O(N), Space complexity: O(1)
	}
	
	public void deleteNode(int location) {
	    if (head == null) {
	        System.out.println("The CSLL does not exist!");
	        return;
	    } 
	    
	    if (location < 0 || location >= size) {
	        System.out.println("Node does not exist at location: " + location);
	        return;
	    }
	    
	    if (location == 0) {
	        if (size == 1) { // Single node case
	            head.next = null;
	            head = tail = null;
	            size--;
	            return;
	        }
	        head = head.next;
	        tail.next = head;
	    } else {
	        Node tempNode = head;
	        for (int i = 0; i < location - 1; i++) {
	            tempNode = tempNode.next;
	        }
	        tempNode.next = tempNode.next.next;
	        if (location == size - 1) {
	            tail = tempNode; // Update the tail if the last node is deleted
	        }
	    }
	    size--;
	    
	    if (size == 0) {
	        head = tail = null;
	    }
	 // Time complexity: O(N), Space complexity: O(1)
	}
	
	public void deleteCSLL() {
		if (head == null) {
	        System.out.println("The CSLL does not exist!");
	        return;
	    } else {
			head = null;
			tail.next = null;
			tail = null;
			System.out.println("The CSLL has been deleted!");
		}
		// Time complexity: O(1), Space complexity: O(1)
	}

}







