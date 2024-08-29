package com.prac.circularlinkedlist;

public class CircularSinglyLinkedList1 {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createCSLL(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
			
	}
	
	public void insertCSLL(int nodeValue, int location) {
		
		Node node = new Node();
		node.value = nodeValue;
		
		if(head == null) {
			createCSLL(nodeValue);
			return;
		}else if (location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		} else if (location >= size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		}else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}
	
	public void traverseCSLL() {
		if(head != null) {
			Node tempNode = head;
			for(int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if(i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			} 
			System.out.println("\n");
		} else {
				System.out.println("\n CSLL does not exist");
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
		
		if(head == null) {
			System.out.println("SLL does not exist");
		}
		
		if(location < 0 || location >= size) {
			System.out.println("Node does not exist at location: " + location);
			return;
		}
		
		if(location == 0) {
			if(size == 1) {
				head.next = null;
				head = tail = null;
				size--;
				return;
			}
			head = head.next;
			tail = head;
		}else {
			Node tempNode = head;
			for(int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			if(location == size - 1) {
				tail = tempNode;
			}
		}
		size--;
		 if (size == 0) {
		        head = tail = null;
		    }
		
	}
	
	public void deleteCSLL() {
		if (head == null) {
	        System.out.println("The CSLL does not exist!");
	        return;
	        }else {
				head = null;
				tail.next = null;
				tail = null;
				System.out.println("The CSLL has been deleted!");
			}
		}
	    
}





