// Milan Haydel
// C00419477
// CMPS 261
// Program Description:

// Certificate of Authenticity:
// I certify that the code in the method functions including
// method function main of this project are entirely my own work.
package com.company;
import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //#1
        Linked();

        System.out.println("\n-------------------------------------------\n");

        //#2
        String one = "2 3 +";
        String two = "5.0 3.5 -";
        String three = "5.0 3.5 1.2 - /";
        System.out.println(Fix(one));
        System.out.println(Fix(two));
        System.out.println(Fix(three));

        System.out.println("\n-------------------------------------------\n");

        //#3&4
        Random rand = new Random();
        compare compare = new compare();
        Circle[] list = new Circle[5];
        for (int i = 0; i < 5; i++){
            Circle circlei = new Circle(rand.nextInt(10)+1);
            list[i] = circlei;
        }
        Circle.aSort(list, compare);
        for (int i = 0; i < 5; i++){
            System.out.println("Circle " + (i+1) + list[i].toString());
        }
    }

    /*  Linked
    *   This method creates a linked list with 5,000,000 random
    *   integers. The time to copy the linked list using an
    *   iterator and get method are compared.
    *   pre-conditions: NA, does not have parameters;
    *   post-conditions: This method is void (does not return)
     */
    public static void Linked(){
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++){
            list.add(rand.nextInt(100));
        }
        long starttime, endtime;
        starttime = System.currentTimeMillis();
        Iterator<Integer> iteratorList = list.iterator();
        endtime = System.currentTimeMillis();
        System.out.println("Time taken to traverse the linked list using an iterator: " + (endtime-starttime));

        LinkedList<Integer> getList = new LinkedList<>();
        starttime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++){
            getList.add(list.get(i));
            if (i == list.size()/2){
                System.out.println("Half way there");
            }
        }
        endtime = System.currentTimeMillis();
        System.out.println("Time taken to traverse the linked list using get method: " + (endtime-starttime));
    }

    /*  Fix
    *   This method takes in a String equation and splits it by
    *   adding each element separated by a space to the array
    *   post[]. A stack is then created in order to quickly evaluate
    *   the equation by adding the elements until an operand element
    *   is met. When an operand is met, it will pop two elements and
    *   solve the equation by calling the Solve method. Solve method
    *   returns the evaluation.
    *   pre-conditions: String type equation
    *   post-conditions: evaluated answer from passed String equation
     */
    public static double Fix(String postfix){
        String[] post = postfix.split(" ");
        Stack stack = new Stack();
        for (int i = 0; i < post.length; i++){
            if (!Objects.equals(post[i], "*") && !Objects.equals(post[i], "/") && !Objects.equals(post[i], "+")
                    && !Objects.equals(post[i], "-")){
                stack.push(Double.parseDouble(post[i]));
            }
            else{
                double one = (double) stack.pop();
                double two = (double) stack.pop();
                String op = post[i];
                stack.push(Solve(one, two, op));
            }
        }
        return (double) stack.pop();
    }

    /*  Solve
    *   This method takes the two double values and solves the equation
    *   based on what the operand is (by using a switch statement)/
    *   pre-conditions: two double values from stack and operand
    *   post-conditions: evaluated answer the two doubles based on
    *       operand.
     */
    public static double Solve(double x, double y, String operand){
        switch (operand){
            case "*":
                System.out.print(y + " * " + x + " = ");
                return x*y;
            case "/":
                System.out.print(y + " / " + x + " = ");
                if (x==0) return 0.0;
                else return y/x;
            case "+":
                System.out.print(y + " + " + x + " = ");
                return x+y;
            case "-":
                System.out.print(y + " - " + x + " = ");
                return y-x;
        }
        return 0.0;
    }
}
