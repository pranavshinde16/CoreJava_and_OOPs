package com.company;
import java.util.Scanner;

public class Tables__factorials {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n=4;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }


        // Reverse tables
//        int p = 9;
//        for (int i = 10; i >= 1; i--) {
//            System.out.printf("%d X %d = %d\n", p, i, p * i);
//        }
//
        System.out.println("Enter a number of your choice");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial is: " + fact);


    }
}



