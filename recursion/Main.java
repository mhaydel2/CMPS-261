package recursion;
import java.util.ArrayList;
/*
This Java package is intended to give some example recursive
functions for you all to test and gain some intuition about
recursion. Try to answer all of the questions to help reason
about recursive functions.

In order to get the most out of
this file, read the comments in the code from top to bottom,
answering questions on a piece of paper. Then try to run and
alter the code to further your understanding.

Think of yourself as a mad scientist. Think of all manner of
sick experiments to carry out on the code. Hypothesize what
will happen before you carry out your experiments.
Trying all manner of strange things is the best way to
understand what your program is doing.
 */

public class Main {
    /*
    We start with the prototypical recursive function on
    natural numbers, the factorial function, usually
    denoted by n!
    It is defined piece wise as:
           { 1, n = 0
    n! =   {
           { (n-1)! * n, n > 0

    Let us consider computing 4!
    The recursion works as follows:
    4! = 3! * 4
       = (2! * 3) * 4
       = ((1! * 2) * 3) * 4
       = (((0! * 1) * 2) * 3) * 4
       // a quick comment. Imagine your program
       // computes the things in inner parentheses
       // before moving to outer parentheses
       = (((1 * 1) * 2) * 3) * 4
       = ((1 * 2) * 3) * 4
       = (2 * 3) * 4
       = 6 * 4
       = 24
     Thus, we can see that recursion first generates
     a pyramid like nesting structure where it 'builds'
     a series of operations by 'breaking down' some input
     value repetitively in a uniform matter until it
     hits something that can't be 'broken down' any more.
     For recursive functions on natural numbers, this
     is usually when the parameter is equal to 0 or 1
     */
    static int rFactorial(int n) {
        if (n == 0)
            return 1;
        return rFactorial(n - 1) * n;
    }

    /*
    This Trace function is to help reason about how the
    recursion proceeds for the factorial function.
    Question (1) What output will calling rFactorialTrace(0)
    produce? What will it return?
    Question (2) What output will calling rFactorialTrace(4)
    in main() produce?
     */
    static int rFactorialTrace(int n) {
        if (n == 0) {
            System.out.println("rFactorial(0) = 1");
            return 1;
        }
        String left_hand_equality = "rFactorial(" + n + ") = ";
        String right_hand_equality = "rFactorial(" + (n-1)+ ") * " + n + " = ";
        int recurseValue = rFactorialTrace(n - 1) * n;
        System.out.println(left_hand_equality + right_hand_equality + recurseValue);
        return recurseValue;
    }

    /*
    Here is the classic recursive definition of
    the fibonacci function. It has two base cases
    of integer values that won't be broken down any more.
    From there the recursion unwinds to produce a value.
    Question (3) What happens when we call
    rFibonacci(-1)?
    Question (4) What happens when we call
    rFibonacci(100000)?
    Question (5) comment out the code on lines
    remove the first if condition and change the
    'else if' to just an 'if' What happens when we call
    rFibonacci(2)?
     */
    static int rFibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        else if (num == 1) {
            return 1;
        }
        return rFibonacci(num - 1) + rFibonacci(num - 2);
    }

    /*
    This rFibonacciTrace function prints the fibonacci number
    it is currently computing as it goes.
    Question (6)  What will the output of rFibonacci(3) be?
    Is it what you expected? If not, consider separating the
    two recursive calls to occur on separate lines of code,
    like as follows:

    int firstFib = rFibonacciTrace(n-1);
    System.out.println("done with Fib(" + (n-1) + ")");
    int secondFib = rFibonacciTrace(n-2);
    System.out.println("done with Fib(" + (n-2) + ")");
    return firstFib + secondFib;
     */
    static int rFibonacciTrace(int n) {
        System.out.println("Fib(" + n + ")");
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return rFibonacciTrace(n - 1) + rFibonacciTrace(n - 2);
    }

    /*
    Here we will write a function that sums all of the numbers
    contained in an arrayList. This example will piggy back
    on a `helper` recursive function, while sums numbers
    starting in the list, starting from a certain index
    and going up to the last index. The sum starting from the
    last index is purely the number at the last index.
     */
    static int SumListElements(ArrayList<Integer> numList) {
        return SumListElements(numList, 0);
    }

    /*
    this is the helper function for SumListElements, which
    keeps track of an explicit index for use in writing
    the recursion properly.
    Question (7) What happens if we call SumList Elements with
    an index whose value is larger than the number of elements
    in the list?
     */
    static int SumListElements(ArrayList<Integer> numList, int index) {
        // the base case where the index is 'looking at'
        // the last element in the list
        if (index == numList.size() - 1) {
            return numList.get(index);
        }
        // otherwise the sum of the list is the current value
        // at the index + the sum of all of the elments in the
        // list past this index
        return numList.get(index) + SumListElements(numList, index + 1);
    }

    // Question (8)
    // Finish the function below that multiplies the elements
    // in a list. For example, given a list {-1,2,3}
    // it returns -1 * 2 * 3 which equals -6
    // HINT: look at SumListElements
    public static int MultiplyListElements(ArrayList<Integer> numList) {
        return -1;
    }

    /*
    Imagine a world where the + operator doesn't exist but where
    we can increment numbers with ++ and can decrement numbers with --.
     Furthermore, imagine that
    we don't have loops. We can implement a recursive function
    to add numbers by using the increment operator.
     */
    static int add(int x, int y) {
        if (y == 0)
            return x;
        x++;
        y--;
        return add(x, y);
    }

    // Question (9) Can you implement a multiply function (x*y)
    // using the above add function and recursion?
    public static int multiply(int x, int y) {
        return -1;
    }

    // Question (10) Can you implement a power function x^y
    // only using increment, decrement, previously defined
    // functions and recursion?
    public static int power(int x, int y) {
        return -1;
    }

    public static void main(String[] args) {
        rFactorialTrace(4);
        rFibonacciTrace(3);
        var numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println(SumListElements(numberList));
        System.out.println(add(2,3));
    }
}
