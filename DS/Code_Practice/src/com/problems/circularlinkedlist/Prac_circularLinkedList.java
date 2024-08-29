package com.problems.circularlinkedlist;

class Prac_circularLinkedList {
    
	public Node head;
	public Node tail;
	public int length;
	
	public Prac_circularLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void append(int value) {
		Node newNode  = new Node(value);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
			newNode.next = newNode;
		} else {
			this.tail.next = newNode;
			newNode.next = newNode;
			this.tail = newNode;
		}
		this.length++;
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.tail.next = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
			this.tail.next = newNode;
		}
		this.length++;
		
	}
	
	@Override
	public String toString() {
		if(this.length == 0) {
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
		if(this.length == 0) {
			System.out.println("The value " + value + " is not in the list.");
		}
		
		if(this.head == this.tail && this.head.value == value) {
			this.head = null;
			this.tail = null;
			this.tail.next = null;
		}
		
		Node current = this.head;
		Node prev = null;
		
		do {
			if(current.value == value) {
				if(current == this.head) {
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
		} while(current != this.head);
		
		System.out.println("The value " + value + " is not in the list.");
	    return false;
	}
	
	public int countNodes() {
		int count = 0;
		Node tempNode = this.head;
		if (tempNode == null) {
            return 0;  // Return 0 immediately if the list is empty
        }
		
		do {
			count++;
			tempNode = tempNode.next;
		} while(tempNode != this.head);
		
		return count;
	}

    public static void main(String[] args) {
        Prac_circularLinkedList list = new Prac_circularLinkedList();
        list.append(5);
        list.append(6);
        list.prepend(7);
        System.out.println(list.head.value);
        System.out.println(list.head.next.value);
        System.out.println(list.head.next.next.value);
        
        System.out.println(list.toString());
        
        list.deleteByValue(5);
        System.out.println(list.toString());
        
        System.out.println(list.countNodes());
    }
}

