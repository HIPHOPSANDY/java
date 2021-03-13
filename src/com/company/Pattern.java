package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main (String [] args) {
        int i,j,k,m,pattern ;

        Scanner for_inp= new Scanner(System.in);
        System.out.println("Enter the Pattern ");
        pattern =for_inp.nextInt();

        for (i=pattern-1;i>=0;i--){
            for (j=0;j<=i;j++){
                System.out.print("*");


            }



            System.out.println();


        }
        for(k=1;k<pattern;k++) {
            for (m=0;m<=k;m++)
            {
                System.out.print(""+"*");
            }

            System.out.println();

        }
    }
}
