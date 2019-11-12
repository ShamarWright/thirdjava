package com.wright.ap.unit1.lesson2;

/**
 * Use a for loop to print all of the numbers from 23 to 89,
 * with 10 numbers on each line. Print one space between each number.
 */
public class ForLoopExerNovEleven {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 23; i < 90; i++, counter++) {

            if (counter == 3){
                System.out.println();
                counter = 0;
            }
            System.out.print(" " + i);
        }
    }
}
