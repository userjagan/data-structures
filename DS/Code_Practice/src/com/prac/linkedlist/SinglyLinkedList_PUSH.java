package com.prac.linkedlist;

public class SinglyLinkedList_PUSH {

	public Node head;
	public Node tail;
	public int size;
	 
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
	 
	  // Insert Method SinglyLinkedList
	  public void push(int nodeValue) {
	    if (head == null) {
	      insertSinglyLinkedList(nodeValue);
	      return;
	    } else {
	      Node node = new Node();
	      node.value = nodeValue;
	      node.next = null;
	      tail.next = node;
	      tail = node;
	      size++;
	    }
	 
	    
	  }
	  
	  public static void main(String[] args) {
	        SinglyLinkedList_PUSH singlyLinkedList = new SinglyLinkedList_PUSH();
	        singlyLinkedList.push(5);
	        System.out.println(singlyLinkedList.size);  // 1
	        System.out.println(singlyLinkedList.head.value);  // 5
	        System.out.println(singlyLinkedList.tail.value);  // 5
	        
	        System.out.println("***");

	        singlyLinkedList.push(10);
	        System.out.println(singlyLinkedList.size);  // 2
	        System.out.println(singlyLinkedList.head.value);  // 5
	        System.out.println(singlyLinkedList.head.next.value);  // 10
	        System.out.println(singlyLinkedList.tail.value);  // 10
	    }
	 
	  
	 
	}
