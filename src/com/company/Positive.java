package com.company;

import java.util.Scanner;

public class Positive {
    public static void main (String [] args) {

        Scanner inp = new Scanner(System.in);
        int number ;
        System.out.println("Enter the positive or negative number :");
        number = inp.nextInt();
        if(number>=0) {
            System.out.println("Number is positive"+number);

        }
        else
            {
            System.out.println("Number is Negative " +number);
            }

    }
}
