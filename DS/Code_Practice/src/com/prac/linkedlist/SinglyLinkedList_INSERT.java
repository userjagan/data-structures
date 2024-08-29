package com.prac.linkedlist;


public class SinglyLinkedList_INSERT {

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

    // Insert Method for SinglyLinkedList
//    public boolean insert(int nodeValue, int index) {
//        if (index < 0 || index > size) {
//            return false;
//        }
//        Node newNode = new Node();
//        newNode.value = nodeValue;
//        if (index == 0) {
//            newNode.next = head;
//            head = newNode;
//            if (size == 0) {
//                tail = newNode;
//            }
//        } else {
//            Node current = head;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//            if (newNode.next == null) {
//                tail = newNode;
//            }
//        }
//        size++;
//        return true;
//    }
    
  //Get
    public Node get(int index) {
      if (index<0 || index >= size) {
        return null;
      }
      Node currentNode = head;
      for (int i=0; i<index; i++) {
        currentNode = currentNode.next;
      }
      return currentNode;
    }
   
    //Insert
    public boolean insert(int data, int index) {
      Node newNode = new Node();
      newNode.value = data;
      if (index<0 || index >= size) {
        return false;
      }
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        if (index == 0) {
          newNode.next = head;
          head = newNode;
        } else if (index == 1) {
          newNode.next = head.next;
          head.next = newNode;
        } else if (index == size) {
          tail.next = newNode;
          newNode.next = null;
          tail = newNode;
        } else {
          Node tempNode = head;
          int inx = 0;
          while (inx < index-1) {
            tempNode = tempNode.next;
            inx += 1;
          }
          Node nextNode = tempNode.next;
          tempNode.next = newNode;
          newNode.next = nextNode;
        }
      }
      size +=1;
      return true;
    }

    public static void main(String[] args) {
        SinglyLinkedList_INSERT singlyLinkedList = new SinglyLinkedList_INSERT();
        singlyLinkedList.push(15);  // Success
        singlyLinkedList.push(16);  // Success
        singlyLinkedList.push(17);  // Success
        singlyLinkedList.push(18);  // Success

        System.out.println(singlyLinkedList.insert(50, 3));  // True
        System.out.println(singlyLinkedList.insert(13, 100)); // False
        System.out.println(singlyLinkedList.size);      
        System.out.println(singlyLinkedList.head.value);   
        System.out.println(singlyLinkedList.head.next.value);  
        System.out.println(singlyLinkedList.head.next.next.value);  
        System.out.println(singlyLinkedList.head.next.next.next.value);
        System.out.println(singlyLinkedList.head.next.next.next.next.value);
        System.out.println(singlyLinkedList.tail.value);
        
        System.out.println("***");
        
        System.out.println(singlyLinkedList.get(0).value);
        System.out.println(singlyLinkedList.get(1).value);
        System.out.println(singlyLinkedList.get(2).value);
        System.out.println(singlyLinkedList.get(3).value);
        System.out.println(singlyLinkedList.get(4).value);
        
        System.out.println("***");
        
        console.log(singlyLinkedList.get(4).value);

    }
}

class console {
    public static void log(Object message) {
        System.out.println(message);
    }
}



