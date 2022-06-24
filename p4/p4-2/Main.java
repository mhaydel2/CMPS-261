package com.company;
/*Milan Haydel
C00419477
CMPS 261
Program Description:
Code added by me was a method to add all
elements from one list to another, and then
added code to test ability to run.
Certificate of Authenticity:
I certify that the code in the method functions
including method function main of this project
are entirely my own work.*/
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        listapi.GenericQueue queue = new listapi.GenericQueue<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(rand.nextInt(20));
            System.out.println(queue.toString());
        }
        listapi.GenericStack stack = new listapi.GenericStack<>();
        for (int i = 0; i < 5; i++){
            int removed = (int) queue.dequeue();
            stack.push(removed);
            System.out.println(queue.toString());
            System.out.println(stack.toString());
        }
    }
}
