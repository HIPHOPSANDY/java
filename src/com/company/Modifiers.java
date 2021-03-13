package com.company;
 class modifier {
    private String name="sandy";
    private int age=21;

    public void   display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);

    }
    private void show() {
        System.out.println("name :"+name);
        System.out.println("age :"+age);

    }
}
public class Modifiers {

    public static void main (String[] args) {
        modifier m1= new modifier();
        //m1.display();

        


    }
}
