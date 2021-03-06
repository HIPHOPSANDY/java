package com.company;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the value of a  ");
        a = inp.nextInt();
        System.out.println("Enter the value of b ");
        b = inp.nextInt();

        while (a!=b) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            if (a>b)
            {
                a=a-b;
            } else {
                b=b-a;
            }
            System.out.println("the GCD =" + a);

        }
    }
}
