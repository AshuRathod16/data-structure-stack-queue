package com.bridgelabz;

import java.util.LinkedList;

public class Function {
    LinkedList<Integer> stack = new LinkedList<Integer>();

    public void addElement(int data) {
        stack.addFirst(data);
    }

    public void print() {
        System.out.println("Element in the stack are:");
        for (Integer i : stack) {
            System.out.println(" -> " + i);
        }
    }
}
