package com.company;

import java.util.Scanner;

public class Discount {

    public static void main (String[] args) {
        int purchase;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the amount you will be purchased");
        purchase =inp.nextInt();
        if (purchase >=purchase)
        {
            System.out.println("Purchase  amount = " + purchase);
            System.out.println("Discount = " + purchase*.4);
            System.out.println("(Amount to be paid  = " + (purchase-(purchase*.4)));
        }
    }
}
