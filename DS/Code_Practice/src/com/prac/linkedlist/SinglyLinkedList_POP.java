package com.prac.linkedlist;


public class SinglyLinkedList_POP {

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

    // Push Method for SinglyLinkedList
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
    
    public Node pop() {
        if (head == null) {
          System.out.println("The SLL does not exist");
          return null;
        } 
        Node removeNode;
        Node currentNode;
        if (head == tail) {
          removeNode = head;
          head = tail = null;
        } else {
          currentNode = head;
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

//    // Pop Method for SinglyLinkedList
//    public Node pop() {
//        if (size == 0) {
//            System.out.println("The SLL does not exist");
//            return null;
//        } else if (size == 1) {
//            Node poppedNode = head;
//            head = null;
//            tail = null;
//            size--;
//            return poppedNode;
//        } else {
//            Node current = head;
//            while (current.next != tail) {
//                current = current.next;
//            }
//            Node poppedNode = tail;
//            tail = current;
//            tail.next = null;
//            size--;
//            return poppedNode;
//        }
//    }

    public static void main(String[] args) {
        SinglyLinkedList_POP singlyLinkedList = new SinglyLinkedList_POP();
        singlyLinkedList.push(5);
        singlyLinkedList.push(6);
        singlyLinkedList.push(7);
        singlyLinkedList.push(8);
        singlyLinkedList.push(10);
        
        System.out.println(singlyLinkedList.pop().value); // 10
        System.out.println(singlyLinkedList.tail.value);  // 5
        System.out.println(singlyLinkedList.size);   // 1
        System.out.println(singlyLinkedList.pop().value); // 5
        System.out.println(singlyLinkedList.size);   // 0
        singlyLinkedList.pop();   // The SLL does not exist
    }
}
