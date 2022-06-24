package com.company;
import java.util.Comparator;

class compare implements Comparator<Circle> {

    /*  compare
    *    This method gets the radius of each of the
     *   two circle objects and returns 1, 0, or -1
     *   depending on if one radius is greater than, less
     *   than, or equal to the other
     *  pre-conditions: two Circle objects
     *  post-conditions: integer value that determines if
     *      c1 is greater than, less than, or equal to c2.
     */
    @Override
    public int compare(Circle c1, Circle c2) {
        int r1 = c1.getRadius();
        int r2 = c2.getRadius();

        if (r1 > r2){
            return 1;
        }
        else if (r1 == r2){
            return 0;
        }
        else {return -1;}
    }
}