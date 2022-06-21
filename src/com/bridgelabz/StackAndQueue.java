package com.bridgelabz;

public class StackAndQueue {
    public static void main(String[] args) {

        Function function = new Function();

        // Insert element in stack
        function.addElement(70);
        function.addElement(30);
        function.addElement(56);
        function.print();

        // Removed the element from stack until stack is empty
        function.peek();
        function.pop();
        function.print();
        function.peek();
        function.pop();
        function.print();
        function.peek();
        function.pop();
        function.print();
        function.peek();
        function.pop();

    }
}
