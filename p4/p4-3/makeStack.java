package com.company;

import java.util.Random;

public class makeStack {
    Random rand = new Random();
    private int index = 0;
    private int top = -1;
    private int size;
    private double stackArray[];

    //constructor to set fixed size of Stack
    //with standard number and assign
    //size to variable size
    public makeStack(){
        stackArray = new double[5];
        size = 5;
    }

    //constructor to set fixed size of Stack
    //with passed integer and assign the size
    //to variable size
    public makeStack(int i){
        stackArray = new double[i];
        this.size = i;
    }

    //adds passed variable num to end of the
    //stack unless it is full.
    public void push(double num){
        if (!isFull()) {
            stackArray[index] = num;
            index++;
            top++;
        }
    }

    //deletes last element of stack and returns
    //that element.
    public double pop(){
        if (!isEmpty()){
            index--;
            double returned = stackArray[top];
            stackArray[top] = 0.0;
            top--;
            System.out.println(returned + " has been removed from the stack.");
            return returned;
        }
        else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    //determines whether stack is empty
    //and returns true or false.
    public boolean isEmpty(){
        return (top == -1);
    }

    //determines whether stack is full
    //and returns true or false.
    public boolean isFull(){
        return (top == size-1);
    }

    //tests if the stack is full or not
    //full by calling corresponding methods
    //and prints outcome
    public void test(){
        toString();
        if (isFull()){
            System.out.println("Stack is full\n");
        }
        else System.out.println("Stack is not full\n");
    }

    //prints stack's elements
    @Override
    public String toString() {
        System.out.print("Stack: ");
        for (int i = 0; i < size; i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
        return null;
    }
}
