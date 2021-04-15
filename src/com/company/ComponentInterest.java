package com.company;

public class ComponentInterest {

    public static void main ( String[] args ) {
//        System.out.println("jo");
        for(int i=2;i<9;i++) {
            System.out.println("10000 at "+i +"interest =" +calculateInterest(20000, i));
        }

    }
    public static double calculateInterest (double amount ,double int_Rate) {
    return (amount * (int_Rate/100));
    }
}
