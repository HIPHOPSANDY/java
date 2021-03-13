package com.company;

import java.util.Scanner;

public class Switch {
    public static void main (String [] args) {
        String name;
        char grade;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = inp.nextLine();
        System.out.println("Enter a Character");
        grade = inp.next().charAt(0);
        System.out.println("Student name :" + name);
        System.out.print("Grade");
        switch (grade) {
            case 10 :
            {
                System.out.println("DISTINCTION");
                break;
            }
            case 'F' :
            {
                System.out.println(" FIRST CLASS");
                break;
            }
            case 'S' :
            {
                System.out.println("SECOND CLASS");
                break;
            }
            case 'T' :
            {
                System.out.println("THIRD");
                break;
            }
            default:
            {
                System.out.println("FAIL");
                break;
            }

        }
    }
}
