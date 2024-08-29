package com.problems.circularlinkedlist;



class Node{
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}
public class Implement_CircularLinkedList {
	public Node head;
	public Node tail;
	public int length;
	
	// Constructor to create an empty circular singly linked list.
	public Implement_CircularLinkedList() {  
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	// Method to append a new node to the end of the list
	public void append(int value) {
		Node newNode = new Node(value);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
			newNode.next = newNode;
		} else {
			this.tail.next = newNode;
			newNode.next = this.head;
			this.tail = newNode;
		}
		this.length++;
	}
	
	// Method to append a new node to the beginning of the list
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
			newNode.next = newNode;
		}else {
			newNode.next = this.head;
			this.head = newNode;
			this.tail.next = newNode;
		}
		this.length++;
	}

	// Method to display this list
	@Override
	public String toString() {
		if(this.length==0) {
		return "";
	}
	Node tempNode = this.head;
	StringBuilder result = new StringBuilder();
	do {
		result.append(tempNode.value);
		tempNode = tempNode.next;
		if(tempNode != this.head) {
			result.append(" -> ");
			}
		} while (tempNode != this.head);
		
		return result.toString();
	}
	
	public boolean deleteByValue(int value) {
	    if (this.length == 0) {
	        System.out.println("The value " + value + " is not in the list.");
	        return false;
	    }

	    if (this.head == this.tail && this.head.value == value) {
	        this.head = null;
	        this.tail = null;
	        this.length = 0;
	        return true;
	    }

	    Node current = this.head;
	    Node prev = null;

	    do {
	        if (current.value == value) {
	            if (current == this.head) {
	                this.head = this.head.next;
	                this.tail.next = this.head;
	            } else if (current == this.tail) {
	                prev.next = this.head;
	                this.tail = prev;
	            } else {
	                prev.next = current.next;
	            }

	            this.length--;
	            return true;
	        }

	        prev = current;
	        current = current.next;
	    } while (current != this.head);

	    System.out.println("The value " + value + " is not in the list.");
	    return false;
	}
	
	public int countNodes() {
        int count = 0;
        Node temp = this.head;
        if (temp == null) {
            return 0;  // Return 0 immediately if the list is empty
        }
 
        do {
            count++;  // Increment the count for each node
            temp = temp.next;  // Move to the next node
        } while (temp != this.head);  // Continue until the list cycles back to the head
 
        return count;  // Return the total count
    
}
	
	public static void main(String[] args) {
			Implement_CircularLinkedList list = new Implement_CircularLinkedList();
	        list.append(10);
	        list.append(20);
	        list.prepend(5);
	        System.out.println(list.toString());

	        list.deleteByValue(5);
	        System.out.println(list.toString());
	        
	        list.deleteByValue(21);
	        System.out.println(list.toString());
	        
	        System.out.println(list.countNodes());
		}
}	



