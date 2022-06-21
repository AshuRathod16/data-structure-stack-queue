package com.bridgelabz;

public class StackAndQueue {
    public static void main(String[] args) {

        Function function = new Function();

        // Inserting element in queue
        function.addQueue(70);
        function.addQueue(30);
        function.addQueue(56);
        function.print();

        //Removing element from queue
        function.deQueue();
        function.print();
        function.deQueue();
        function.print();
        function.deQueue();
        function.print();
        function.deQueue();

    }
}
