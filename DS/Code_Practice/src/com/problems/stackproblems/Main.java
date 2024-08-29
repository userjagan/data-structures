package com.problems.stackproblems;

public class Main {
    // Main method for testing the Stack class
    public static void main(String[] args) {
        ImplementStack stack = new ImplementStack(10); // Initialize stack with value 10
        System.out.println("Top value: " + stack.getPeakValue()); // Should print 10
        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        System.out.println("Top value after push: " + stack.getPeakValue()); // Should print 20
        System.out.println("Popped value: " + stack.pop()); // Should print 20
        System.out.println("Top value after pop: " + stack.getPeakValue()); // Should print 10
        System.out.println("Stack height: " + stack.getHeight()); // Should print 1
    }
}
