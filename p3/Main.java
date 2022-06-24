package com.company;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

// Milan Haydel
// C00419477
// CMPS 261
// Program Description: This Program compares the four different sorting methods (Selection,
//      Bubble, Insertion, and Merge Sort) by computer different array sizes and printing each
//      execution time. Insertion and Merge are then compared using the computation time of
//      ArrayList Strings from the same text.
// Certificate of Authenticity:
// I certify that the code in the method functions including
// method function main of this project are entirely my own work,
// but I received some assistance from
// Baeldung. “Merge Sort in Java.” Baeldung, 22 Sept. 2020, www.baeldung.com/java-merge-sort.



public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        double[] array1 = new double[100000];
        double[] array2 = new double[200000];
        double[] array3 = new double[400000];
        double[] array4 = new double[800000];


        /* Four sets of four arrays call Selection, Bubble, Insertion,
         * and Merge Sort in each set. Before and after each call method
         * to a sorter, a timer is started/ended, assigning the end time
         * minus the start time to a value : executionTime(sorter)(array#)
         */

        long startTime, endTime;

        random(array1);
        System.out.print("Starting Selection Sort with Array 1.....");
        startTime = System.currentTimeMillis();
        selection(array1);
        endTime = System.currentTimeMillis();
        long executionTimeS1 = endTime - startTime;
        System.out.println("Done");

        random(array1);
        System.out.print("Starting Bubble Sort with Array 1........");
        startTime = System.currentTimeMillis();
        bubble(array1);
        endTime = System.currentTimeMillis();
        long executionTimeB1 = endTime - startTime;
        System.out.println("Done");

        random(array1);
        System.out.print("Starting Insertion Sort with Array 1.....");
        startTime = System.currentTimeMillis();
        insertion(array1);
        endTime = System.currentTimeMillis();
        long executionTimeI1 = endTime - startTime;
        System.out.println("Done");

        random(array1);
        System.out.print("Starting Merge Sort with Array 1.........");
        startTime = System.currentTimeMillis();
        mergeSort(array1);
        endTime = System.currentTimeMillis();
        long executionTimeM1 = endTime - startTime;
        System.out.println("Done");


        random(array2);
        System.out.print("Starting Selection Sort with Array 2.....");
        startTime = System.currentTimeMillis();
        selection(array2);
        endTime = System.currentTimeMillis();
        long executionTimeS2 = endTime - startTime;
        System.out.println("Done");

        random(array2);
        System.out.print("Starting Bubble Sort with Array 2........");
        startTime = System.currentTimeMillis();
        bubble(array2);
        endTime = System.currentTimeMillis();
        long executionTimeB2 = endTime - startTime;
        System.out.println("Done");

        random(array2);
        System.out.print("Starting Insertion Sort with Array 2.....");
        startTime = System.currentTimeMillis();
        insertion(array2);
        endTime = System.currentTimeMillis();
        long executionTimeI2 = endTime - startTime;
        System.out.println("Done");

        random(array2);
        System.out.print("Starting Merge Sort with Array 2.........");
        startTime = System.currentTimeMillis();
        mergeSort(array2);
        endTime = System.currentTimeMillis();
        long executionTimeM2 = endTime - startTime;
        System.out.println("Done");

        random(array3);
        System.out.print("Starting Selection Sort with Array 3.....");
        startTime = System.currentTimeMillis();
        selection(array3);
        endTime = System.currentTimeMillis();
        long executionTimeS3 = endTime - startTime;
        System.out.println("Done");

        random(array3);
        System.out.print("Starting Bubble Sort with Array 3........");
        startTime = System.currentTimeMillis();
        bubble(array3);
        endTime = System.currentTimeMillis();
        long executionTimeB3 = endTime - startTime;
        System.out.println("Done");

        random(array3);
        System.out.print("Starting Insertion Sort with Array 3.....");
        startTime = System.currentTimeMillis();
        insertion(array3);
        endTime = System.currentTimeMillis();
        long executionTimeI3 = endTime - startTime;
        System.out.println("Done");

        random(array3);
        System.out.print("Starting Merge Sort with Array 3.........");
        startTime = System.currentTimeMillis();
        mergeSort(array3);
        endTime = System.currentTimeMillis();
        long executionTimeM3 = endTime - startTime;
        System.out.println("Done");


        random(array4);
        System.out.print("Starting Selection Sort with Array 4.....");
        startTime = System.currentTimeMillis();
        selection(array4);
        endTime = System.currentTimeMillis();
        long executionTimeS4 = endTime - startTime;
        System.out.println("Done");

        random(array4);
        System.out.print("Starting Bubble Sort with Array 4........");
        startTime = System.currentTimeMillis();
        bubble(array4);
        endTime = System.currentTimeMillis();
        long executionTimeB4 = endTime - startTime;
        System.out.println("Done");

        random(array4);
        System.out.print("Starting Insertion Sort with Array 4.....");
        startTime = System.currentTimeMillis();
        insertion(array4);
        endTime = System.currentTimeMillis();
        long executionTimeI4 = endTime - startTime;
        System.out.println("Done");

        random(array4);
        System.out.print("Starting Merge Sort with Array 4.........");
        startTime = System.currentTimeMillis();
        mergeSort(array4);
        endTime = System.currentTimeMillis();
        long executionTimeM4 = endTime - startTime;
        System.out.println("Done");

        /* Uses the executionTime values for all four sets of array sorters
         * with the four different elements and compares them in a pretty
         * print statement using format.
         */

        System.out.println("\n\n    Elements / Selection /  Bubble  /Insertion/    Merge");
        System.out.printf("%10d %10s %10s %10s %10s", array1.length, executionTimeS1, executionTimeB1, executionTimeI1, executionTimeM1);
        System.out.println();
        System.out.printf("%10d %10s %10s %10s %10s", array2.length, executionTimeS2, executionTimeB2, executionTimeI2, executionTimeM2);
        System.out.println();
        System.out.printf("%10d %10s %10s %10s %10s", array3.length, executionTimeS3, executionTimeB3, executionTimeI3, executionTimeM3);
        System.out.println();
        System.out.printf("%10d %10s %10s %10s %10s", array4.length, executionTimeS4, executionTimeB4, executionTimeI4, executionTimeM4);
        System.out.println("\n");

        /* Creates a new Scanner attached to the 'fstein.txt' file,
         * located in the projects folder, assigned to 'file'. An
         * ArrayList is created and assigned lines of text from the
         * .txt file until there are no more lines left. A new ArrayList
         * is created and then assigned the return ArrayList from
         * calling the mergeSortString method and then is
         * removed of duplicates calling the removeDup method and
         * re-assigning the duplicate free ArrayList to newList.
         *
         * The original ArrayList, list unsorted, is again sorted by
         * the Insertion sorter. The results are assigned to the Array-
         * List 'sorted' and removed of duplicates, re-assigning the
         * duplicate-free sorted list to 'sorted'.
         *
         * Execution times were recorded for each process and are
         * printed to compare, as well as the remaining words after
         * being sorted.
         */

        Scanner file = new Scanner(new File("fstein.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (file.hasNextLine()){
            list.add(file.nextLine());
        }
        file.close();

        startTime = System.currentTimeMillis();
        ArrayList<String> newList = mergeSortString(list);
        newList = removeDup(newList);
        endTime = System.currentTimeMillis();
        long executionTimeMS = endTime - startTime;
        System.out.println("Words remaining: " + newList.size());

        startTime = System.currentTimeMillis();
        ArrayList<String> sorted = insertionString(list);
        sorted = removeDup(sorted);
        endTime = System.currentTimeMillis();
        long executionTimeIS = endTime - startTime;
        System.out.println("Words remaining: " + sorted.size());

        System.out.println("\nMerge Sort          Execution Time      Remaining Words");
        System.out.printf("%28d %20d", executionTimeMS, newList.size());
        System.out.println();
        System.out.println("Insertion Sort      Execution Time      Remaining Words");
        System.out.printf("%28d %20d", executionTimeIS, sorted.size());
    }

    /* random
     * This method assigns random doubles from 0 to 1000
     * to every index in the received array. This is done
     * by using a for loop that will repeat until the last
     * index of the received array is assigned.
     * pre-conditions: The array passed has a length list > 0.
     * post-conditions: No value is returned, but the array
     *      that was passed is now filled with elements in all
     *      indexes.
     */

    public static void random(double[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble() * 1000;
        }
    }

    /* selection
     * This method sorts the passed array by finding the next
     * smallest element in the array and switching it with the
     * next array index starting from left to right. When the
     * next smallest element is found, the value of the index
     * that it fills copies to double 'temp' and then replaces
     * that value. Where that element once was if replaced by
     * the 'temp' value.
     * pre-conditions: The array passed has a length list > 0
     *      and is unsorted.
     * post-conditions: No value is returned, but the array that
     *      was passed is now sorted.
     */

    public static void selection(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /* bubble
     * This method sorts the passed array by finding the first
     * smallest element in the array and switching it with the
     * next array index starting from left to right. The next
     * smallest element is found in ascending order, so this
     * method will search the entire list before exchanging
     * values. The value of the index that the target value
     * fills copies to double 'temp' and then replaces
     * that value. Where that element once was if replaced by
     * the 'temp' value.
     * pre-conditions: The array passed has a length list > 0
     *      and is unsorted.
     * post-conditions: If isSorted is equal to true, then the
     *      method's loop is complete and the array is sorted.
     */

    public static void bubble(double[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length && !isSorted; i++) {
            isSorted = true;
            for (int j = array.length - 1; j >= i + 1; j--) {
                double temp = array[j - 1];
                if (array[j] < array[j - 1]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }

            }
        }
    }

    /* insertion
     * This method compares the next available index value
     * to the one before it and the while loop will replace
     * the value of the index before it with the target value
     * until it is no longer larger.
     * pre-conditions: The array passed has a length list > 0
     *      and is unsorted.
     * post-conditions: No value is returned, but the array that
     *      was passed is now sorted.
     */

    public static void insertion(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = temp;
        }
    }

    /* mergeSort
     * This method takes the arrays length and divides it
     * in half, taking that half and divides, and so on
     * until the length is equal to one for each half. Each
     * time a half is created, the elements for the given
     * length of the half is put into an array until the
     * length is equal to one. The recursion loop occurs,
     * taking each set of halves to further halved until
     * the array length is equal to one. After each half
     * is sorted, the first and second (or right and left)
     * halves are merged.
     * pre-conditions: The array passed has a length list > 0
     *      and is unsorted.
     * post-conditions: The first and second (or right and left)
     * halves are merged.
     */

    public static void mergeSort(double[] array) {
        int n = array.length;
        if (n > 1) {
            int mid = n / 2;
            double[] first = new double[mid];
            double[] second = new double[n - mid];

            System.arraycopy(array, mid, second, 0, n - mid);
            System.arraycopy(array, 0, first, 0, mid);

            mergeSort(first);
            mergeSort(second);

            merge(array, first, second, mid, n - mid);
        }
    }

    /* merge
     * This method takes the parameter arrays of the first
     * and second halves and merges them into the given
     * array using a while loop.
     * pre-conditions: Original array, first and double array
     *      from method mergeSort along with left and right int
     *      determining the lengths of the halves.
     * post-conditions: The first and second halves are merged
     *      into the passed array.
     */

    public static void merge(double[] array, double[] first, double[] second, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (first[i] <= second[j]) {
                array[k++] = first[i++];
            } else {
                array[k++] = second[j++];
            }
        }
        while (i < left) {
            array[k++] = first[i++];
        }
        while (j < right) {
            array[k++] = second[j++];
        }
    }

    /* mergeSortString
     * This method takes the ArrayLists size and divides it
     * in half, taking that half and divides, and so on
     * until the length is equal to one for each half. Each
     * time a half is created, the elements for the given
     * length of the half is put into an array until the
     * length is equal to one. The recursion loop occurs,
     * taking each set of halves to further halved until
     * the ArrayList size is equal to one. After each half
     * is sorted, the first and second (or right and left)
     * halves are merged.
     * pre-conditions: The arrayList passed has a size > 0
     *      and is unsorted.
     * post-conditions: The return value is the merged and sorted
     *      ArrayList 'list'
     */

    public static ArrayList<String> mergeSortString(ArrayList<String> list) {
        int n = list.size();
        if (n > 1) {
            int mid = n / 2;
            ArrayList<String> first = new ArrayList<String>();
            for (int i = 0; i < mid; i++) {
                first.add(list.get(i));
            }
            ArrayList<String> second = new ArrayList<String>();
            for (int j = mid; j < n; j++) {
                second.add(list.get(j));
            }

            mergeSortString(first);
            mergeSortString(second);

            mergeString(list, first, second, mid, n - mid);
        }
        return list;
    }

    /* mergeString
     * This method takes the parameter arrays of the first
     * and second halves and merges them into the given
     * array using a while loop.
     * pre-conditions: The original array, and two halves
     *      of the array with lengths of each of the halves
     * post-conditions: No return value but the halves
     *      are merged into the passed arrayList 'list'
     */

    public static void mergeString(ArrayList<String> list, ArrayList<String> first, ArrayList<String> second, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if ((first.get(i)).compareTo(second.get(j)) < 0) {
                list.set(k, first.get(i));
                i++;
            } else {
                list.set(k, second.get(j));
                j++;
            }
            k++;
        }
        while (i < first.size()) {
            list.set(k, first.get(i));
            i++;
            k++;
        }

        while (j < second.size()) {
            list.set(k, second.get(j));
            j++;
            k++;
        }
    }

    /* removeDup
     * This method creates a new ArrayList and compares it
     * to the passed ArrayList. It checks to see if each
     * element in the passed list is already in the new
     * ArrayList, and if it is, it is not added.
     * pre-conditions: ArrayList that has duplicates
     * post-conditions: Returned is duplicate free ArrayList
     */

    public static ArrayList<String> removeDup(ArrayList<String> list) {
        ArrayList<String> dupFree = new ArrayList<String>();
        for (String i : list) {
            if (!dupFree.contains(i)) {
                dupFree.add(i);
            }
        }
        System.out.println(list.size() - dupFree.size() + " duplicates deleted.");
        return dupFree;
    }

    /* insertionString
     * This method compares the next available index value
     * to the one before it and the while loop will replace
     * the value of the index before it with the target value
     * until the comparison is no longer equal to one.
     * pre-conditions: The arrayList passed has a size > 0
     *      and is unsorted.
     * post-conditions: The return value is the sorted
     *      ArrayList 'sorted'
     */

    public static ArrayList<String> insertionString(ArrayList<String> list) {
        ArrayList<String> sorted = new ArrayList<String>();
        sorted.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            String temp = list.get(i);
            int j = i - 1;

            while ((j >= 0) && list.get(j).compareTo(temp) == 1) {
                sorted.add(list.get(j));
                if (list.get(i) == sorted.get(j))
                    sorted.remove(j);
                j--;

            }
            sorted.add(temp);
        }
        return sorted;
    }
}

