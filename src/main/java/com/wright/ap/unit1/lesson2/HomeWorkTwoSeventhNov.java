package com.wright.ap.unit1.lesson2;

public class HomeWorkTwoSeventhNov {
    public static void main(String[] args) {
        int homework[] = new int[6]; // 0-4 == 0,1,2,3,4,
        // int(data type) - homework(variable_name)

        homework[0] = 3;
        homework[1] = 6;
        homework[2] = 45;
        homework[3] = 26;
        homework[4] = 22;
        homework[5] = homework[3] + 4; // this will equal 30, you can add atop a variable and

        for (int i=0; i<homework.length; i++){
            System.out.println( homework[i]);
        }
     //   System.out.println( homework);




            //Sout Below please

            //System.out.println(homework[5]);

            //  System.out.println(homework.length); // This will show you the length, which the number of Arrays - Check size
            //  System.out.println(homework[1] + homework[3]); // You can add Arrays, did not know that.
            //  System.out.println(homework[1+3]); // another way to add them up.
        }
    }
