package com.prac.circulardoublelinkedlist;

public class CircularDoublyLinkedList1 {
	public DoublyNode1 head;
	public DoublyNode1 tail;
	public int size;
	
	public DoublyNode1 createCDLL(int nodeValue) {
		
		DoublyNode1 newNode = new DoublyNode1();
		newNode.value = nodeValue;
		head = newNode;
		tail = newNode;
		newNode.next = newNode;
		newNode.prev = newNode;
		size = 1;
		return head;	
	}
	
	public void insetNode(int nodeValue, int location) {
		if (location > size) {
            System.out.println("Insertion location is out of bounds.");
            return;
        }
		
		DoublyNode1 newNode = new DoublyNode1();
		newNode.value = nodeValue;
		if(head == null) {
			createCDLL(nodeValue);
			return;
		}
		else if (location == 0) {
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
			DoublyNode1 tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.prev = tempNode;
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			newNode.next.prev = newNode;
			System.out.println("Node inserted with value: " + nodeValue + " at location " + location);
		}
		size++;
	}
	
	public void traverseCDLL() {
		if(head != null) {
			DoublyNode1 temNode1 = head;
			for(int i = 0; i < size; i++) {
				System.out.print(temNode1.value);
				if(i != size-1) {
					System.out.print(" -> ");
				}
				temNode1 = temNode1.next;
			}
		} else {
			System.out.println("The CDLL does not exist.");
		}
		System.out.println();
	}
	
	public void reversetraverseCDLL() {
		if(head != null) {
			DoublyNode1 temNode1 = tail;
			for(int i = 0; i < size; i++) {
				System.out.print(temNode1.value);
				if(i != size-1) {
					System.out.print(" <- ");
				}
				temNode1 = temNode1.prev;
			}
		} else {
			System.out.println("The CDLL does not exist.");
		}
		System.out.println();
	}
	
	public boolean searchNode(int nodeValue) {
		if(head != null) {
			DoublyNode1 tempNode = head;
			for(int i = 0; i < size; i++) {
				if(tempNode.value == nodeValue) {
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
		if(head == null) {
			System.out.println("The CDLL does not exist");
		}
		
		if(location < 0 || location >= size) {
			System.out.println("Enter the value within the bounds");
		}
		
		if(location == 0) {
			if(size == 1) {
				System.out.println("Deleted node with value " + head.value + " at location " + location);
				head.prev = null;
				head.next = null;
				head = tail = null;
			} else {
				System.out.println("Deleted node with value " + head.value + " at location " + location);
				head = head.next;
				head.prev = tail;
				tail.next = head;;
			}
		} else if (location == size-1) {
			if(size == 1) {
				System.out.println("Deleted node with value " + head.value + " at location " + location);
				head.prev = null;
				head.next = null;
				head = tail = null;
			} else {
				System.out.println("Deleted node with value " + head.value + " at location " + location);
				tail = tail.prev;
				tail.next = head;
				head.prev = tail;
			}
		} else {
			DoublyNode1 tempNode = head;
			for(int i = 0; i < location; i++) {
				tempNode = tempNode.next;
			}
			System.out.println("Deleted node with value " + head.value + " at location " + location);
			tempNode.prev.next = tempNode.next;
			tempNode.next.prev = tempNode.prev;
		}
		size--;
	}
	
	public void deleteCDLL() {
		DoublyNode1 tempNode = head;
		for(int i = 0; i < size; i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = tail = null;
		System.out.println("The CDLL has been deleted!");
	}
	
}




