package com.problems.stackproblems;

// Stack implementation
public class ImplementStack {
    private Node peak;   // Points to the top node of the stack
    private int length;  // Tracks the number of elements in the stack

    // Constructor for Stack class
    public ImplementStack(int initialValue) {
        this.peak = new Node(initialValue); // Initialize top with a new Node
        this.length = 1; // Set height to 1 since the stack has one node
    }

    public void push(int value) {
        Node addedNode = new Node(value);

        if (length == 0) {
            peak = addedNode;
        } else {
            addedNode.next = peak;
            peak = addedNode;
        }
        length++;
    }
    
    public int pop() {
        if (length == 0) {
            return -1; // Return a dummy value if the stack is empty
        }

        Node temp = peak;
        peak = peak.next;
        temp.next = null;
        length--;

        return temp.value;
    }
    
    // For demonstration purposes
    public int getPeakValue() {
        if (peak != null) {
            return peak.value;
        }
        return -1; // Return a dummy value if the stack is empty
    }


    // Method to get the current height of the stack
    public int getHeight() {
        return length; // Return the current height
    }
}

