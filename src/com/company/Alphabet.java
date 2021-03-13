package com.company;

public class Alphabet {
    public static void main (String [] args ) {

      UpperCase();
        LowerCase();


    }
    public static  void UpperCase()
    {
        char ch;
        System.out.println("Uppercase :");
        for( ch='A';ch<='z';ch++){
            System.out.print(ch);
        }
    }

    public static  void LowerCase()
    {
        char ch;
        System.out.println("lowercase is :");
        for( ch='a';ch<='z';ch++){
            System.out.print(ch);
        }
    }
}
