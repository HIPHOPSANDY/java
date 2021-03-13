package com.company;

public class Fibonacci {
    public static void main (String [] args) {
        int count=0 ,f1=0,f2=1,f3 ,number=0;

        f3=f1+f2;
        while (count <100) {

            System.out.println(f3);

            f1=f2;
            f2=f3;
            f3=f1+f2;

            count +=10;



        }
    }
}
