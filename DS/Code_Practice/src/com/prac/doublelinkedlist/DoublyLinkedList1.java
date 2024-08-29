package com.prac.doublelinkedlist;

public class DoublyLinkedList1 {
	DoublyNode1 head;
	DoublyNode1 tail;
	int size;
	
	public DoublyNode1 createDLL(int nodeValue) {
		DoublyNode1 newNode = new DoublyNode1();
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}
	
	public void insertDLL(int nodeValue, int location) {
		if(location > size) {
			System.out.println("Insertion failed at location: " + location);
			return;
		}
		
		DoublyNode1 newNode = new DoublyNode1();
		newNode.value = nodeValue;
		if(head == null) { // ---------------------------------> O(1)
			createDLL(nodeValue); // ---------------------------------> O(1)
			System.out.println("Inserted value: " + nodeValue + " at location: 0");
			return; // ---------------------------------> O(1)
		} else if (location == 0) { // ---------------------------------> O(1)
			newNode.next = head; // ---------------------------------> O(1)
			newNode.prev = null; // ---------------------------------> O(1)
			head.prev = newNode; // ---------------------------------> O(1)
			head = newNode; // ---------------------------------> O(1)
			System.out.println("Inserted value: " + nodeValue + " at location: " + location);
		} else if (location == size) { // ---------------------------------> O(1)
			newNode.next = null; // ---------------------------------> O(1)
			tail.next = newNode; // ---------------------------------> O(1)
			newNode.prev = tail; // ---------------------------------> O(1)
			tail  = newNode; // ---------------------------------> O(1)
			System.out.println("Inserted value: " + nodeValue + " at location: " + location);
		} else {
			DoublyNode1 tempNode = head; // ---------------------------------> O(1)
			int index = 0; // ---------------------------------> O(1)
			while (index < location - 1) { // ---------------------------------> O(N)
				tempNode = tempNode.next; // ---------------------------------> O(N)
				index++; // ---------------------------------> O(N)
			}
			newNode.prev = tempNode; // ---------------------------------> O(1)
			newNode.next = tempNode.next; // ---------------------------------> O(1)
			tempNode.next = newNode; // ---------------------------------> O(1)
			newNode.next.prev = newNode; // ---------------------------------> O(1)
			System.out.println("Inserted value: " + nodeValue + " at location: " + location);


		}
		size++; // ---------------------------------> O(1)
		// ---- Time Complexity: O(N), Space complexity: O(1).
	}
	
	public void traverseDLL() {
		if(head != null) {
			DoublyNode1 tempNode = head;
			for(int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if(i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		} else {
			System.out.println("The DLL does not exist!");
		}
		System.out.println("\n");
	}
	
	public void reverseTraverseDLL() {
		if(head != null) {
			DoublyNode1 tempNode = tail;
			for(int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if(i != size - 1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.prev;
			}
		} else {
			System.out.println("The DLL does not exist!");
		}
		System.out.println("\n");
		
	}
	
	public boolean searchNode(int nodeValue) {
		if(head != null) {
			DoublyNode1 tempNode = head;
			for(int i = 0; i < size; i++) {
				if(tempNode.value == nodeValue) {
					System.out.print("The Node is found at location: " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found");
		return false;
	}
	
	public void deleteNodeDLL(int location) {
		if(head == null) {
			System.out.println("DLL does not exist");
			return;
		}
		
		if(location < 0 || location >= size) {
			System.out.println("Invalid location! deletion failed");
			return;
		} 
		
		DoublyNode1 deleteNode;
		
		if(location == 0) {
			deleteNode = head;
			if(size == 1) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}
			size--;
			System.out.println("Deleted node at location " + location + " with value: " + deleteNode.value);
		} else if (location == size - 1) {
			deleteNode = tail;
			if (size == 1) {
	            head = null;
	            tail = null;
	        } else {
	            tail = tail.prev;
	            tail.next = null;
	        }
	        size--;
	        System.out.println("Deleted node at location " + location + " with value: " + deleteNode.value);
		} else {
			DoublyNode1 tempNode = head;
			
			for(int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			
			deleteNode = tempNode.next;
			tempNode.next = deleteNode.next;
			deleteNode.next.prev = tempNode;
			size--;
			System.out.println("Deleted node at location " + location + " with value: " + deleteNode.value);
		} 
		
	}
	
	public void deleteDLL() {
		DoublyNode1 tempNode = head;
		for(int i = 0; i < size; i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = null;
		tail = null;
		System.out.println("Node successfully deleted");
	}
	
	
}







