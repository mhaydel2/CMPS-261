package com.company;
/*Milan Haydel
C00419477
CMPS 261
Program Description:
Minimal queue class using an array of type String of fixed size
Adds, deletes, and checks it array/stack is full or empty.
Certificate of Authenticity:
I certify that the code in the method functions
including method function main of this project
are entirely my own work.*/
public class Main {

    public static void main(String[] args) {
	    Queue queue = new Queue(4);
	    queue.dequeue();
	    queue.enqueue("blah");
	    queue.dequeue();
	    queue.test();
	    queue.enqueue("ryan");
	    queue.enqueue("milan");
	    queue.enqueue("justin");
	    queue.dequeue();
		queue.enqueue("maria");
		queue.enqueue("abadon");
        queue.test();
    }
}
