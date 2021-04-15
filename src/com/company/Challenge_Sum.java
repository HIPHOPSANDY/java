package com.company;

public class Challenge_Sum {
    public static void main(String[] args) {
        int count=0, sum=0;
        for(int i=1;i<=1000;i++) {
            if( (i % 3==0) && (i % 5==0)){
                count ++;
                sum+=i;
                System.out.println("sum of 3,5 divided number is :"+i);
            }
            if(count ==5){
                break;
            }
        }


    }
}
