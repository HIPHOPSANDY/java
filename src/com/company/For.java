package com.company;

public class For {
    public static void main (String [] args) {
        for(int i=0;i<10; i++)
        {
            if(i==4)
            System.out.println("hi sandy"+i);
            else {
                System.out.println(i);
                continue;
            }
        }

    }
}
