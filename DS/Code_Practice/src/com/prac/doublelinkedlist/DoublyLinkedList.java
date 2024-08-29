package com.prac.doublelinkedlist;

public class DoublyLinkedList {
	DoublyNode head;
	DoublyNode tail;
	int size;
	
	public DoublyNode createDLL(int nodeValue) {
//		head = new DoublyNode();  // ---------------------------------> O(1)
		DoublyNode newNode = new DoublyNode(); // ---------------------------------> O(1)
		newNode.value = nodeValue; // ---------------------------------> O(1)
		newNode.next = null; // ---------------------------------> O(1)
		newNode.prev = null; // ---------------------------------> O(1)
		head = newNode; // ---------------------------------> O(1)
		tail = newNode; // ---------------------------------> O(1)
		size = 1; // ---------------------------------> O(1)
		System.out.println("DLL created with value: " + nodeValue);
		return head; // ---------------------------------> O(1)
		
		// ---- Time Complexity: O(1), Space complexity: O(1).
		
	}
	
	public void insertDLL(int nodeValue, int location) {
		if (location > size) {
            System.out.println("Insertion failed at location: " + location);
            return;
        }
		
		DoublyNode newNode = new DoublyNode(); // ---------------------------------> O(1)
		
		newNode.value = nodeValue; // ---------------------------------> O(1)
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
			DoublyNode tempNode = head; // ---------------------------------> O(1)
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
		if(head != null) { // ---------------------------------> O(1)
			DoublyNode tempNode = head; // ---------------------------------> O(1)
			for(int i = 0; i < size; i++) { // ---------------------------------> O(N)
				System.out.print(tempNode.value); // ---------------------------------> O(1)
				if(i != size-1) { // ---------------------------------> O(1)
					System.out.print(" -> "); // ---------------------------------> O(1)
				}
				tempNode = tempNode.next; // ---------------------------------> O(1)
			}
		}else { // ---------------------------------> O(1)
			System.out.println("The DLL does not exist!"); // ---------------------------------> O(1)
		}
		System.out.println("\n"); // ---------------------------------> O(1)
		// ---- Time Complexity: O(N), Space complexity: O(1).
	}
	
	public void reverseTraverseDLL() {
		if (head != null) {
			DoublyNode tempNode = tail;
			for(int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if(i != size -1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.prev;
			}
		} else {
			System.out.println("The DLL does not exist@");
		}
		System.out.println("\n"); // ---------------------------------> O(1)
		// ---- Time Complexity: O(N), Space complexity: O(1).
	}
	
	public boolean searchNode(int nodevalue) {
		if(head != null) {
			DoublyNode tempNode = head;
			for(int i = 0; i < size; i++) {
				if (tempNode.value == nodevalue) {
					System.out.print("The Node is found at location: " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.print("Node not found");
		return false;
	}
	
//	public void deleteNodeDLL(int location) {
//		if(head == null) {
//			System.out.println("The DLL does not exist!");
//			return;
//		} else if (location == 0) {
//			if(size == 1) {
//				head = null;
//				tail = null;
//				size--;
//				return;
//			} else {
//				head = head.next;
//				head.prev = null;
//				size--;
//			}
//		} else if (location >= size) {
//			DoublyNode tempNode = tail.prev;
//			if (size == 1) {
//				head = null;
//				tail = null;
//				size--;
//				return;
//			} else {
//				tempNode.next = null;
//				tail = tempNode;
//				size--;
//			}
//		} else {
//				DoublyNode tempNode = head;
//				for(int i = 0; i < location-1; i++) {
//					tempNode = tempNode.next;
//			}
//			tempNode.next = tempNode.next.next;
//			tempNode.next.prev = tempNode;
//			size--;
//		}
//	}
	
	public void deleteNodeDLL(int location) {
	    if (head == null) {
	        System.out.println("The DLL does not exist!");
	        return;
	    }
	    
	    if (location < 0 || location >= size) {
	        System.out.println("Invalid location! No deletion performed.");
	        return;
	    }

	    DoublyNode nodeToDelete;
	    
	    if (location == 0) {
	        nodeToDelete = head;
	        if (size == 1) {
	            head = null;
	            tail = null;
	        } else {
	            head = head.next;
	            head.prev = null;
	        }
	        size--;
	        System.out.println("Deleted node at location " + location + " with value: " + nodeToDelete.value);
	    } else if (location == size - 1) {
	        nodeToDelete = tail;
	        if (size == 1) {
	            head = null;
	            tail = null;
	        } else {
	            tail = tail.prev;
	            tail.next = null;
	        }
	        size--;
	        System.out.println("Deleted node at location " + location + " with value: " + nodeToDelete.value);
	    } else {
	        DoublyNode tempNode = head;
	        for (int i = 0; i < location - 1; i++) {
	            tempNode = tempNode.next;
	        }
	        nodeToDelete = tempNode.next;
	        tempNode.next = nodeToDelete.next;
	        nodeToDelete.next.prev = tempNode;
	        size--;
	        System.out.println("Deleted node at location " + location + " with value: " + nodeToDelete.value);
	    }
	}

	public void deleteDLL() {
		DoublyNode tempNode = head;
		for(int i = 0; i < size; i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = null;
		tail = null;
		System.out.println("The DLL has been deleted!");
	}
	
}













