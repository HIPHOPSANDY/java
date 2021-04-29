package com.company;
import java.util.Scanner;
public class ValueReturn {
    public static  void readarray( int [] b , int s1) {
        int i,n;
        Scanner inp = new Scanner(System.in);
        for (i=0;i<s1;i++) {
            System.out.println("Enter the score for the " +(i+1)+ " ODI");
            b[i]=inp.nextInt();
        }
    }

    public static double battingavg(int[] b,int s1) {
        int i, total=0;
        double avg=0;
        for (i=0;i<s1;i++) {
            total +=b[i];

        }
        avg=total/s1;
        return avg;
    }
    public  static void printarray (int [] b, int s1) {
        int i;
        for(i=0;i<s1;i++) {
            System.out.println("Match : " +(i+1)+ "  " +b[i]);

        }
        System.out.println();
    }
    public static void main (String [] args) {
        int [] score =new int[10];
        int s,i;
        double a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        s=inp.nextInt();
        readarray(score,s);
        a= battingavg(score,s);
        System.out.println("Batting performance of the Batsman");
        System.out.println("-------------------------------------");
        printarray(score,s);
        System.out.println("-------------------------------------");
        System.out.println("Batting Average" +a);
        System.out.println("-------------------------------------");
    }
}
