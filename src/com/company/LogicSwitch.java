package com.company;

import java.util.Scanner;

public class LogicSwitch {
    public static void main (String [] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        number = inp.nextInt();
        if (number <= 9) {
            System.out.println("the Given number is " + number);
        } else if (number == 10) {
            System.out.println("A");
        } else if (number == 11) {
            System.out.println("B");
        }else if (number == 12) {
            System.out.println("C");
        } else if (number==13) {
            System.out.println("D");
        }else if (number==14) {
            System.out.println("E");
        }else if (number==15) {
            System.out.println("F");
        }else if (number==16) {
            System.out.println("G");
        }else if (number==17) {
            System.out.println("H");
        }else if (number==18) {
            System.out.println("I");
        }else if (number==19) {
            System.out.println("J");
        }



    }
}
