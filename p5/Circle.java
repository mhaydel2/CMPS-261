package com.company;
import java.io.Serializable;
import java.util.Comparator;


public class Circle implements Serializable {
    private int radius;

    /*  Circle
    *   Default constructor to set radius.
    *   pre-conditions: NA
    *   post-conditions: nothing is returned
     */
    Circle(){
        radius = 10;
    }

    /*  Circle
    *   Constructor that assigns variable radius to
    *   passed integer.
    *   pre-conditions: random integer is passed
    *   post-conditions: nothing is returned
     */
    Circle(int r){
        if (r > 0) {
            radius = r;
        }
        else System.out.println("Radius cannot be equal to zero");
    }

    /*  getRadius
    *   This method returns the current integer value
    *   of the variable radius
    *   pre-conditions: NA
    *   post-conditions: value of radius is returned
     */
    public int getRadius(){
        return this.radius;
    }

    /*  setRadius
    *   Radius is set with the passed integer when
    *   the passed integer is greater than 0.
    *   pre-conditions: random integer is passed
    *   post-conditions: nothing is returned
     */
    public void setRadius(int r){
        if (r > 0) {
            radius = r;
        }
    }

    /*  toString
    *   This method overrides the toString method and
    *   has a customized print
    *   pre-conditions: NA
    *   post-conditions: nothing is returned
     */
    @Override
    public String toString(){
        return "'s radius: " + radius;
    }

    /*  aSort
    *   This method takes in a list of Circle objects
    *   and a customized comparator that gets the radius
    *   of two circle objects and returns 1, 0, or -1
    *   depending on if one radius is greater than, less
    *   than, or equal to the other. Depending on what
    *   is returned, the method will sort the radius
    *   values in ascending order.
    *   pre-conditions: list of Circle objects
     *      and a customized comparator
     *  post-conditions: nothing is returned
     */
    public static <E> void aSort(Circle[] list, Comparator<Circle> comparator){
        Circle temp;
        for (int i = 0; i < list.length; i++){
            for (int j = i+1; j < list.length; j++){
                if (comparator.compare(list[i],list[j]) > 0){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
