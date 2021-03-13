package com.company;

import java.util.Scanner;

public class Maximum {
    public static void main (String [] args) {

        String s="*";
        String inp_string="",store;

        for (int i=0; i<=4; i++)
        {

            inp_string =inp_string+s;
//            System.out.println(inp_string);

        }for (int j=0;j<=4;j++) {

            store=inp_string;
            System.out.println(store);
            store=store.substring (inp_string.length() - 1);
        }

       // System.out.println(inp_string);


    }
}
