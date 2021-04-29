package com.company;
import java.util.Scanner;
public class ArrayInsert {

    public static void readarray (int [] x,int s1) {
        int i,n;
        Scanner inp = new Scanner(System.in);
        for(i=0;i<s1;i++) {
            System.out.println(" Enter the values for the array " );
            x[i]=inp.nextInt();
        }
    }
    public static  void insert(int [] a, int x1,int s1,int i) {
        int j;
        for(j=s1-1;j>=i;j--) {
            a[j + 1] = a[j];
            a[i]=x1;
        }

    }
    public static void printarray(int []x , int s1) {
        int i;
        for (i=0; i<s1;i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = new int[10];
    int s,x, i;
    Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        s=inp.nextInt();
        readarray(arr,s);
        System.out.println("Enter the value to be inserted");
        x=inp.nextInt();

        System.out.println("Enter the index where the value to be inserted");
        i=inp.nextInt();
        System.out.println("\n Array Before Insertion");
        printarray(arr,s);

        insert(arr,x,s,i);
        System.out.println("\n Array After Insertion");
        printarray(arr,++s);
    }
}
