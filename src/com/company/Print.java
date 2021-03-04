package com.company;

import java.util.Scanner;

public class Print {
    public int input_class (){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the a value ");
        int  a= inp.nextInt();

           return a;
    }
    public static void main (String [] args) {
        Print s1 = new Print();

//        int input=s1.input_class();
        //code
        int a,b,c,d,e;



        a= s1.input_class();
        b=s1.input_class();
        c=s1.input_class();
        d=s1.input_class();
        e=s1.input_class();
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);


    }
}
