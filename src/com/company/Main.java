package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        float myValue = 50f /10f ;
        double mySecond = 5d /3d;
        System.out.println("mySecond = " + mySecond);
        System.out.println("myValue = " + myValue);
        double numPounds =200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("convertedKilograms = " + convertedKilograms);
        double pi =3.1415927d;
        System.out.println("pi = " + pi);

        //input

        int a;
        float b;
        Scanner inp= new Scanner(System.in);

        System.out.println("Enter A and B:");
        a=inp.nextInt();
        b=inp.nextFloat();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        double c= a/b;

        System.out.println("c = " + c);
        



    }
}
