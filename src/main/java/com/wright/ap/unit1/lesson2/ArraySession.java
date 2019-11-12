package com.wright.ap.unit1.lesson2;

import java.util.Arrays;

public class ArraySession {
    public static void main(String[] args) {

        int[] counts; // Setting Array Type
        counts = new int[8]; // Setting size of Array
        counts[0] = 17; // Setting a value 17 at the index of 0
        counts[7] = 5;
        counts[3] = 20;
        System.out.println(Arrays.toString(counts));
        // the following will only print object reference ID, sout = "[I@3fb4f649"
        // The following is "for - loop"
        // For homework please do the following loops : while-loops, do-while, enhanced for loop, stream.
        System.out.println(counts);
        for (int i =0; i < counts.length; i++){
            System.out.println("value at "+i+" is " + counts[i] );
            //  for (int i =0; i < counts.length; i++){
            //            System.out.println(counts[i]);
           // i = i - 1; <- This is infinite loop
            //


        }
        int[] scores = {5,270,5};
        System.out.println(Arrays.toString(scores));
    }

    public static void main2(String[] args) {


        /*
        Initialise count with 7 is overwritten when other values (7,6) are assigned to that variable.
        So 6 will be the value that is printed out instead out 7.
         */
        int count = 7;
        count = 6;
        System.out.println(count);
        System.out.println("max int=" + Integer.MAX_VALUE);
        System.out.println("mix int=" + Integer.MIN_VALUE);
    }
}
