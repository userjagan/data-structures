package com.prac.circulardoublelinkedlist;

public class CircularDoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
	// create CDLL
	DoublyNode createCDLL(int nodeValue) {
//		head = new DoublyNode(); // -------------------------------> O(1)
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		head = newNode;
		tail = newNode;
		newNode.next = newNode;
		newNode.prev = newNode;
		size = 1;
		return head; // -------------------------------> O(1)
		// -------- Time Complexity : O(1), Space Complexity : O(1).
	}
	
	public void insertNode(int nodeValue, int location) {
        if (location > size) {
            System.out.println("Insertion location is out of bounds.");
            return;
        }
        
        DoublyNode newNode = new DoublyNode(); // -------------------------------> O(1)
        newNode.value = nodeValue; // -------------------------------> O(1)
        if (head == null) { 
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            System.out.println("Node inserted with value: " + nodeValue + " at location 0");
        } else if (location == size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
            System.out.println("Node inserted with value: " + nodeValue + " at location " + location);
        } else {
            DoublyNode tempNode = head;
            int index = 0; // -------------------------------> O(1)
            while (index < location - 1) { // -------------------------------> O(N)
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode; 
            System.out.println("Node inserted with value: " + nodeValue + " at location " + location);
        } 
        size++; // -------------------------------> O(1)
        // -------- Time Complexity : O(N), Space Complexity : O(1).    
    }
	
	public void traverseCDLL() { // -------------------------------> O(1)
		if (head != null) {
			DoublyNode tempNode = head;
			for (int i = 0; i < size; i++) { // -------------------------------> O(N)
				System.out.print(tempNode.value);
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		} else {
			System.out.println("The CDLL does not exist.");
		}
		System.out.println(); // -------------------------------> O(1)
		// -------- Time Complexity : O(N), Space Complexity : O(1). 
	}
	
	public void reverseTraversalCDLL() {
		if (head != null) { // -------------------------------> O(1)
			DoublyNode tempNode = tail;
			for(int i = 0; i < size; i++) { // -------------------------------> O(N)
				System.out.print(tempNode.value);
				if (i != size-1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.prev;
			}
		} else {
			System.out.println("The CDLL does not exist!"); // -------------------------------> O(1)
		}
	}
	
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			DoublyNode tempNode = head;
			for(int i=0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("The node is found at location: "+i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found! ");
		return false;
	}
	
	public void deleteNode(int location) {
	    if (head == null) { // Check if the list is empty
	        System.out.println("The CDLL does not exist!");
	        return;
	    }
	    
	    if (location < 0 || location >= size) { // Check if the location is valid
	        System.out.println("Invalid location!");
	        return;
	    }
	    
//	    DoublyNode nodeToDelete = head;
	    
	    if (location == 0) { // Deleting the head node
	        if (size == 1) { // Only one element in the list
	            System.out.println("Deleted node with value " + head.value + " at location " + location);
	            head.prev = null;
	            head.next = null;
	            head = tail = null;
	        } else { // More than one element in the list
	            System.out.println("Deleted node with value " + head.value + " at location " + location);
	            head = head.next;
	            head.prev = tail;
	            tail.next = head;
	        }
	    } else if (location == size - 1) { // Deleting the tail node
//	        nodeToDelete = tail;
	        if (size == 1) { // Only one element in the list
	            System.out.println("Deleted node with value " + head.value + " at location " + location);
	            head.prev = null;
	            head.next = null;
	            head = tail = null;
	        } else { // More than one element in the list
	            System.out.println("Deleted node with value " + tail.value + " at location " + location);
	            tail = tail.prev;
	            tail.next = head;
	            head.prev = tail;
	        }
	    } else { // Deleting a node in the middle
	    	DoublyNode nodeToDelete = head;
	        for (int i = 0; i < location; i++) { // Traverse to the node to be deleted
	            nodeToDelete = nodeToDelete.next;
	        }
	        System.out.println("Deleted node with value " + nodeToDelete.value + " at location " + location);
	        nodeToDelete.prev.next = nodeToDelete.next;
	        nodeToDelete.next.prev = nodeToDelete.prev;
	    }
	    
	    size--;
	}

	
	public void deleteCDLL() {
		DoublyNode tempNode = head; // -------------------------------> O(1)
		for(int i = 0; i<size; i++) { // -------------------------------> O(N)
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = null; // -------------------------------> O(1)
		tail = null;
		System.out.println("The CDLL has been deleted!"); // -------------------------------> O(1)
		// -------- Time Complexity : O(N), Space Complexity : O(1). 
	}
	
}







