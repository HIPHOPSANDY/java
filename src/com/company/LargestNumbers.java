package com.company;

import java.util.Scanner;

public class LargestNumbers {
    public static void main (String [] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.println("ENTER THE A B VALUE");
        a=inp.nextInt();
        System.out.println("Enter the a value");

        b=inp.nextInt();
        System.out.println("Enter the b value");

        if(a>b) {
            System.out.println(" a is grater ");
        }
        else {
            System.out.println(" b is grater");
        }
    }
}
