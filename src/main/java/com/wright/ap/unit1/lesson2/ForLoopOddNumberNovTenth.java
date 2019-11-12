package com.wright.ap.unit1.lesson2;//Print Odd Numbers from 1-50



public class ForLoopOddNumberNovTenth {
    public static void main(String[] arg){
        for(int x=0; x<50; x++){
            if(x%2==1)
                System.out.println("Odd numbers are \t" +x);
        }
    }
}
