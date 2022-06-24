package com.company;

public class Queue {

    private String[] queue;
    private int rear = 0;
    private int size;

    //constructor to set fixed size of Queue
    //with standard number and assign
    //size to variable size
    public Queue(int num) {
        queue = new String[num];
        this.size = num;
    }

    //constructor to set fixed size of Queue
    //with passed integer and assign the size
    //to variable size
    public void Queue() {
        queue = new String[5];
        this.size = 5;
    }

    //adds passed String type variable 'input' to end of the
    //queue infinitely. Once 'rear' reaches end of the queue
    //(size), index added to is wrapped around.
    public void enqueue(String input) {
        queue[rear] = input;
        rear = (rear+1)%size;
    }

    //deletes first element of queue and returns
    //that element.
    public String dequeue() {
        for (int i = 0; i < size; i++){
            if (!isEmpty() && queue[i] != null){
                String returned = queue[i];
                queue[i] = null;
                return returned;
            }
        }
        System.out.println("queue is empty");
        return null;
    }

    //determines whether queue is empty
    //and returns true or false.
    public boolean isEmpty() {
        boolean status = true;
        for (String e: queue){
            if (e != null)
                status = false;
        }
        return status;
    }

    //determines whether queue is full
    //and returns true or false.
    public boolean isFull() {
        boolean status = true;
        for (String e: queue){
            if (e == null)
                status = false;
        }
        return status;
    }

    //prints rear and queue size
    //tests if the queue is full or not
    //full by calling corresponding methods
    //and prints outcome
    public void test() {
        System.out.println("Rear Index: " + (rear));
        System.out.println("Queue Size: " + size);
        toString();
        if (isFull()) {
            System.out.println("Queue is full");
        } else System.out.println("Queue is not full");
    }

    //prints queue's elements
    @Override
    public String toString() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
        return null;
    }
}
