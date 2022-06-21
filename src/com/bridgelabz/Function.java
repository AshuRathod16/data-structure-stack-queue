package com.bridgelabz;

import java.util.LinkedList;

public class Function {
    LinkedList<Integer> stack = new LinkedList<Integer>();

    public void addElement(int data) {
        stack.addFirst(data);
    }

    public void peek() {
        System.out.println("Element at peek in stack is: " + stack.peek());
    }

    public void pop() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements removed from stack is: " + stack.pop());
        }

    }

    public void print() {
        System.out.println("Element in the stack are:");
        for (Integer i : stack) {
            System.out.println(" -> " + i);
        }
    }
}
