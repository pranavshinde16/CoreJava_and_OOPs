package com.company;

import java.util.Scanner;

public class Operatorsi {
    public static void main(String[] args) {
        // Logical Operators

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year you want");
        int year = sc.nextInt();
        if ((year%4 == 0) && (year%100!=0) || (year%400==0))
            System.out.println(year+" is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");





         System.out.println(true && false);      // (1*0 = 0)
         System.out.println(true && true);       // (1*1 = 1)
         System.out.println(false && false);     // (0*0 = 0)


        System.out.println(false || false);      //(0+0 = 0)
        System.out.println(true || true);      //(1+1 = 1)

    }
}
