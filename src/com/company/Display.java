package com.company;

import java.util.Scanner;

public class Display {

    public static void main (String [] args) {
            int user_age1,user_age2;
            String user_name1,user_name2;
            Scanner inp1 = new Scanner(System.in);
            Scanner inp2 = new Scanner(System.in);

        System.out.println("Enter user_name1");
        user_name1 = inp1.nextLine();

        System.out.println("Enter the age");

            user_age1 =inp2.nextInt();



//      System.out.println();
        System.out.println("Enter user_name2");

        user_name2 =inp1.nextLine();
        System.out.println("Enter the age");

        user_age2 =inp2.nextInt();




            if(user_age1>user_age2){
                System.out.println(user_name1 +""+user_age1);
            }else {
                System.out.println(user_name2+ ""+user_age2);
            }






        }

    }

