package com.company;
/*Milan Haydel
C00419477
CMPS 261
Program Description:
Minimal stack class using an array to hold the stack.
Adds, deletes, and checks it array/stack is full or empty.
Certificate of Authenticity:
I certify that the code in the method functions
including method function main of this project
are entirely my own work.*/
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    makeStack stack = new makeStack(3);
	    stack.test();
	    stack.push(1.0);
	    stack.push(2.0);
	    stack.test();
	    stack.push(3.0);
	    stack.test();
		System.out.println("Element deleted: " + stack.pop());
	    stack.test();
    }
}
