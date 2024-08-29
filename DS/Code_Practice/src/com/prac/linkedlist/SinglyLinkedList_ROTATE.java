package com.prac.linkedlist;

public class SinglyLinkedList_ROTATE {
	
	    public Node head;
	    public Node tail;
	    public int size;

	    // Node class
	    class Node {
	        int value;
	        Node next;
	    }

	    // Method to insert the first node in the singly linked list
	    public Node insertSinglyLinkedList(int nodeValue) {
	        head = new Node();
	        Node node = new Node();
	        node.next = null;
	        node.value = nodeValue;
	        head = node;
	        tail = node;
	        size = 1;
	        return head;
	    }

	    // Method to add a new node at the end of the list
	    public void push(int nodeValue) {
	        if (head == null) {
	            insertSinglyLinkedList(nodeValue);
	        } else {
	            Node node = new Node();
	            node.value = nodeValue;
	            node.next = null;
	            tail.next = node;
	            tail = node;
	            size++;
	        }
	    }

	    // Method to remove the last node in the list
	    public Node pop() {
	        if (head == null) {
	            System.out.println("The SLL does not exist");
	            return null;
	        } 
	        Node removeNode;
	        if (head == tail) {
	            removeNode = head;
	            head = tail = null;
	        } else {
	            Node currentNode = head;
	            while (currentNode.next != tail) {
	                currentNode = currentNode.next;
	            }
	            removeNode = currentNode.next;
	            currentNode.next = null;
	            tail = currentNode;
	        }
	        size--;
	        return removeNode;
	    }

	    // Method to get a node at a specific index
	    public Node get(int index) {
	        if (index < 0 || index >= size) {
	            return null;
	        }
	        Node currentNode = head;
	        for (int i = 0; i < index; i++) {
	            currentNode = currentNode.next;
	        }
	        return currentNode;
	    }

	    // Method to insert a node at a specific index
	    public boolean insert(int data, int index) {
	        Node newNode = new Node();
	        newNode.value = data;
	        if (index < 0 || index > size) {
	            return false;
	        }
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            if (index == 0) {
	                newNode.next = head;
	                head = newNode;
	            } else if (index == size) {
	                tail.next = newNode;
	                newNode.next = null;
	                tail = newNode;
	            } else {
	                Node tempNode = head;
	                int inx = 0;
	                while (inx < index - 1) {
	                    tempNode = tempNode.next;
	                    inx++;
	                }
	                Node nextNode = tempNode.next;
	                tempNode.next = newNode;
	                newNode.next = nextNode;
	            }
	        }
	        size++;
	        return true;
	    }

	    // Method to rotate the linked list by a given number of positions
	    public String rotate(int number) {
	        if (number < 0) {
	            number = size + number;
	        }
	        if (number <= 0 || number >= size) {
	            return "No Rotation";
	        }

	        Node prevNode = head;
	        for (int i = 0; i < number - 1; i++) {
	            prevNode = prevNode.next;
	        }

	        tail.next = head;
	        head = prevNode.next;
	        tail = prevNode;
	        tail.next = null;

	        return "Success";
	    }

	    // Method to print the list (for debugging purposes)
	    public void printList() {
	        Node currentNode = head;
	        while (currentNode != null) {
	            System.out.print(currentNode.value + " -> ");
	            currentNode = currentNode.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	    	SinglyLinkedList_ROTATE singlyLinkedList = new SinglyLinkedList_ROTATE();
	        singlyLinkedList.push(5);
	        singlyLinkedList.push(10);
	        singlyLinkedList.push(15);
	        singlyLinkedList.push(20);
	        singlyLinkedList.push(25);

	        System.out.println("Original List:");
	        singlyLinkedList.printList();

	        singlyLinkedList.rotate(3);

	        System.out.println("Rotated List:");
	        singlyLinkedList.printList();
	    }
}


