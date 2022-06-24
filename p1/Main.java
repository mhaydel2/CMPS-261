package com.company;
/* Milan Haydel
   C00419477
   CMPS 261
   Program Description: Multiple methods with different functions
   that all use the recursive calculations.
   Certificate of Authenticity:
   I certify that the code in the method functions including
   method function main of this project are entirely my own work.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        System.out.println("The binary number of " + n + " is " + intToBinary(n));
        printHarmonic(10);
        System.out.println(" = " + harmonic(10));
        printTestM(10);
        System.out.println(" = " + testM(10));

        System.out.print("Enter 8 integer numbers: ");
        int[] array = new int[8];
        for (int i = 0; i < 8; i++)
            array[i] = input.nextInt();
        System.out.println("The largest integer is "+largestInt(array, 8));
    }

/*  sum
    Finds the sum from 1 to n. Ex: 1+2+3+..+ n. Until the last
    number added to the value that will be returned is 1, the
    sum method will be called upon using the next lower number
    by subtracting 1.
    Pre: The integer passed is > 0.
    Post: The value returned is the sum from 1 to n (the
          integer passed).
 */
    public static int sum(int n){
        if (n == 1){return 1;}
        return sum(n-1) + n;
    }

/*  gcd (greatest common divisor)
    Finds the greatest common divisor for integers m & n. The
    recursion continues until the remainder of the integers
    m and n are zero. Until the remainder is zero, the method
    gcd is called upon using n and the remainder of m and n.
    Pre: gcd accepts two integer parameters
    Post: The value returned is the greatest common divisor of
          the two given integers.
 */
    public static int gcd(int m, int n){
        if (m%n == 0) {return n;}
        return gcd(n, m%n);
    }

/*  intToBinary
    This recursive method converts an integer into a Binary
    String. The integer passed is divided by 2 until it is
    equal to 0, where the recursion will end. The remainder of
    each divided number will be added the String value of
    what is returned.
    Pre: The integer passed is > 0.
    Post: The integer value returned is the String binary
          value of the initially passed integer.
 */
    public static String intToBinary(int n){
        if (n==0) {return "";}
        return intToBinary(n/2) + Integer.toString(n%2);
    }

/*  harmonic
    This method computes the + harmonic numbers, 𝐻(𝑛), for
    𝑛 = 1,2,3, ⋯ ,10. Recalls the harmonic method with the
    integer n minus 1 unit until integer n is equal to one.
    Each time the method is recalled, it will add the
    fraction 1 over integer n (1/n). When n is equal one,
    one will be the returned value.
    Pre: The integer n that is passed is equal to 10.
    Post: The double value returned is the last harmonic #.
 */
    public static double harmonic(int n) {
        if (n == 1) return 1.0;
        return harmonic(n - 1) + (1.0 / n);
    }

/*  printHarmonic
    This method displays the harmonic numbers, 𝐻(𝑛), for
    𝑛 = 1,2,3, ⋯ ,10.
    Pre: The integer n that is passed is equal to 10.
    Post: The method prints out the equation for the
          harmonic numbers.
 */
    public static void printHarmonic(int n){
        if (n==1) {
            System.out.print("1");}
        else {
            printHarmonic(n-1);
            System.out.print(" + " + "1/" + n);
        }
    }

/*  testM
    The method is recalled upon with the integer i minus
    1 until integer  is equal to 0. Each time the method
    is recalled, it will add the fraction i over 2
    multiplied by integer i, added by 1 (1/n) to the equation. When i is equal 0,
    0 will be the returned value.
    Pre: The integer n that is passed is equal to 10.
    Post: The method prints the solution for m(i).
 */
    public static double testM(int i){
        if (i == 0) {return 0;}
        return testM(i-1) + (i/(2.0*i + 1.0));
    }

/*  printTestM
    Write a test program that displays 𝑚(𝑖) for
    𝑖 = 1,2,3, ⋯ ,10.
    Pre: The integer n that is passed is equal to 10.
    Post: The method prints out the equation for the
          integer i.
 */
    public static void printTestM(int i){
        if (i==1) {
            System.out.print("1/" + (2*i+1));}
        else {
            printTestM(i-1);
            System.out.print(" + " + i + "/" + (2*i+1));
        }
    }

/*  largestInt
    This method returns the largest element in an array of 8
    integers given by the user.The integer array passed
    to the method includes 8 elements
    of integers from the input of the user. The integer n
    passed is the constant number of elements inside the
    array, 8. Until n is equal to 1, recursion will be
    performed by finding the greatest element by using Math.max
    with array[n-1] (starting with 8-1 because it would be the
    last array for there is only 8 elements in the array 0-7)
    and the next array below that by recalling upon the
    method until n is equal to 1, and it returns the first
    array, 0.
    Pre: The integer array passed to the method includes 8 elements
         of integers from the input of the user. The integer n
         passed is the constant number of elements inside the
         array, 8.
    Post: The value of the largest element of the array is returned.
 */
    public static int largestInt(int[] array, int n){
        if (n == 1) {return array[0];}
        return Math.max(array[n-1], largestInt(array,n-1));
    }

/*  oddevenfact
    This method recursively calculates the odd/even factorial
    value of its single int parameter. Unless the value is
    equal to 2 or 1 (even or odd), the integer n will multiply
    with the recalled method using n-2, until the integer n
    is equal to 2 or 1, in which case n will be returned.
    Pre: The integer n passed is > 0.
    Post: The value returned is a long number.
 */
    public static long oddevenfact(int n){
        if (n==1 || n==2) {return n;}
        return n * oddevenfact(n-2);
    }
}

