package com.wright.learnjava.conditions;

public class BooleanLogic {
    public static void main(String[] args ){
        boolean b = false;
        b = true;

        boolean toBe = true;
        b = toBe || toBe;
        if (b) {
            System.out.println("toBe: "+toBe);
        }
    }
}
