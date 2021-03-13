package com.company;

import java.util.Scanner;

public class Interest {

    public static void main (String [] args) {
       double six_per=0.06 , eight_per=0.08,ten_per=0.10,one_year=12,interest,amount;
       Scanner inp = new Scanner(System.in);
       System.out.println("Enter the amount");
        amount = inp.nextDouble();
       if(amount<=7000) {
           interest = amount*six_per*one_year;
           System.out.println("one year interest :"+interest);
       }
       else if (amount<=7001 && amount<=10000) {
           interest = amount*eight_per*one_year;
           System.out.println("one year interest :"+interest);
       }else {
           interest = amount*ten_per*one_year;
           System.out.println("one year interest :"+interest);
       }
    }

}

