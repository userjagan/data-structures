package com.problems.stackproblems;

import java.util.Stack;

public class BalancedParenthesesChecker {
	public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
	
	public static void main(String[] args) {
        // Test cases
        String[] testExpressions = {
            "{[()]}",
            "{[(])}",
            "((()))",
            "[{}}]",
            "({[a+b]*c}/d)"
        };

        for (String expr : testExpressions) {
            System.out.println("Expression: " + expr + " -> Balanced: " + isBalanced(expr));
        }
    }
}
