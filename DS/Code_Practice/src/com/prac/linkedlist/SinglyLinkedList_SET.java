package com.prac.linkedlist;

import com.prac.linkedlist.SinglyLinkedList_ROTATE.Node;

public class SinglyLinkedList_SET {
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

    public SinglyLinkedList_SET() { //redundancy
        this.head = null;
        this.size = 0;
    }

    // Method to set the value of a node at a specific index
    public boolean set(int index, int value) {
        if (index < 0 || index >= size) {
            return false;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
        return true;
    }
    
//    public boolean set(int index, int value) {
//        if (head == null) {
//          head.value = value;
//          tail.value = value;
//        } else {
//          Node currentNode = head;
//          for (int i =0; i<index; i++) {
//            currentNode = currentNode.next;
//            if (currentNode == null) {
//              return false;
//            }
//          }
//          currentNode.value = value;
//        }
//        return true;
//      }
    
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList_SET singlyLinkedList = new SinglyLinkedList_SET();
        singlyLinkedList.push(15);  // Success
        singlyLinkedList.push(16);  // Success
        singlyLinkedList.push(17);  // Success
        singlyLinkedList.push(18);  // Success

        System.out.println(singlyLinkedList.insert(50, 3));  // True
        System.out.println(singlyLinkedList.insert(13, 100)); // False
        
        System.out.println("***");
        System.out.println(singlyLinkedList.size);  
        System.out.println("***");
        System.out.println(singlyLinkedList.head.value);   
        System.out.println(singlyLinkedList.head.next.value);  
        System.out.println(singlyLinkedList.head.next.next.value);  
        System.out.println(singlyLinkedList.head.next.next.next.value);
        System.out.println(singlyLinkedList.head.next.next.next.next.value);
        System.out.println("***");
        System.out.println(singlyLinkedList.tail.value);
        System.out.println("***");
        
        System.out.println(singlyLinkedList.get(0).value);
        System.out.println(singlyLinkedList.get(1).value);
        System.out.println(singlyLinkedList.get(2).value);
        System.out.println(singlyLinkedList.get(3).value);
        System.out.println(singlyLinkedList.get(4).value);
        System.out.println("***");
        singlyLinkedList.printList();
        System.out.println("***");
        System.out.println(singlyLinkedList.set(0, 10));  // True
        System.out.println(singlyLinkedList.set(1, 20));  // True
        System.out.println(singlyLinkedList.head.value);  // 10
        System.out.println(singlyLinkedList.head.next.value); // 20
        System.out.println("***");
        singlyLinkedList.printList();
    }
}
