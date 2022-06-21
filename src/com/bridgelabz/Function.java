package com.bridgelabz;

import java.util.LinkedList;

public class Function {
    LinkedList<Integer> queue = new LinkedList<Integer>();

    // Method to insert the element in queue
    public void addQueue(int data) {
        queue.addFirst(data);
    }

    //Method to remove element from queue
    public void deQueue(){
        if (queue.size() == 0){
            System.out.println("Queue is empty");
        } else {
            queue.pop();
        }
    }

    // Method to print the element in queue
    public void print() {
        System.out.println("Element in the queue are:");
        for (Integer i : queue) {
            System.out.println(" -> " + i);
        }
    }
}
