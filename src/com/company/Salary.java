package com.company;

import java.util.Scanner;

public class Salary {
    public static void main (String [] args)
    {
        int exp;
        String emp_name;
        float salary;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter employee name ");
        emp_name = inp.nextLine();
        System.out.println("Enter the employee exp");
        exp = inp.nextInt();
        System.out.println("Enter the employee salary");
        salary= inp.nextFloat();

        //nested if

        if(exp >=15) {
            if (salary >=8000) {
                System.out.println("employee name  = " + emp_name);
                System.out.println("employee experience = " + exp);
                System.out.println("employee salary = " + (salary+1500));
            }
            else{
                if (salary >=6000) {
                    System.out.println("employee name  = " + emp_name);
                    System.out.println("employee experience = " + exp);
                    System.out.println("employee salary = " + (salary)+1000);
                }
            }
        }


    }
}
