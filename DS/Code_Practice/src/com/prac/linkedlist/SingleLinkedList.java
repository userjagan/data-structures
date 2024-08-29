package com.prac.linkedlist;

public class SingleLinkedList {
	
	public Node head;
	
	public Node tail;
	
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {
		
//		head = new Node(); // ----------------------------> O(1)
		Node node = new Node(); // ----------------------------> O(1)
		node.value = nodeValue; // ----------------------------> O(1)
		node.next = null; // ----------------------------> O(1)
		head = node; // ----------------------------> O(1)
		tail = node; // ----------------------------> O(1)
		size = 1; // ----------------------------> O(1)
		return head;
		
		//----------------------------> Space Complexity: O(1), Time: Complexity: O(1)
			
	}
	
	public void insertInLinkedList(int nodeValue, int location) {
		Node node = new Node(); // -------------------------------------> O(1)
		node.value = nodeValue;
		if (head == null) {
			createSinglyLinkedList(nodeValue); // ----------------------> O(1)
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
			System.out.println(head);
		} else if (location >= size) { // ------------------------------> O(1)
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node tempNode = head; // -------------------------------------> O(1)
			int index = 0; // --------------------------------------------> O(1)
			while (index < location - 1) { // ----------------------------> O(N)
				tempNode = tempNode.next;
				index++; // ----------------------------------------------> O(1)
			}
			Node nextNode = tempNode.next;
 			tempNode.next = node; // -------------------------------------> O(1)
			node.next = nextNode;
		}
		size++; // -----------------------------------------------> O(1)
	}
	
	//----------------------------> Space Complexity: O(1), Time: Complexity: O(n)
	
	public void traverseSinglyLinkedList() {
		if (head == null) {  // -------------------------------------> O(1)
			System.out.println("SLL does not exist");
		} else {
			Node tempNode = head; // -------------------------------------> O(1)
			for(int i = 0; i < size; i++) { // --------------------------------> O(n)
				System.out.print(tempNode.value); // --------------------------> O(1)
				if(i != size - 1) { // -------------------------------------> O(1)
					System.out.print(" -> ");
				} 
				tempNode = tempNode.next; // -------------------------------------> O(1)
			}
		}
		System.out.println("\n"); // -------------------------------------> O(1)
		//----------------------------> Space Complexity: O(1), Time: Complexity: O(1)
	}
	
	boolean searchNode(int nodeValue) {
		if(head != null) {
			Node tempNode = head;
			for(int i = 0; i < size; i++) {
				if(tempNode.value == nodeValue) {
					System.out.println("Found the node at location: " +i+ "\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found! ");
		return false;
	}
	
	public void deletionOfNode(int location) {
		if(head == null) { // -------------------------------------> O(1)
			System.out.println("The SLL does not exist");
			return;
		}
		if (location < 0 || location >= size) {
            System.out.println("Node does not exist at location " + location);
            return;
        }

        if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            System.out.println("Node at location " + location + " successfully deleted");
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < location - 1; i++) {
            tempNode = tempNode.next;
        }

        tempNode.next = tempNode.next.next;

        if (location == size - 1) {
            tail = tempNode;
        }

        size--;
        System.out.println("Node at location " + location + " successfully deleted");
    
	}
	
	public void deleteAll() {
		head = null;
		tail = null;
		System.out.println("the node doesnot exist");
	}
	
}
















