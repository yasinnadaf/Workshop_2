package com.brideglabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter a Number to reverse: ");

        Scanner scr=new Scanner(System.in);
        int num=scr.nextInt();
        int rev=0;

        while (num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;


        }
        System.out.println("Reverse number is: "+rev);
    }


}
