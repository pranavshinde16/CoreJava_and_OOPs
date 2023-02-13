package com.company;
import java.util.Scanner;

public class IfElseConditionals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();


        if (age>18){
            System.out.println("You can Drink Beer");
        }
        else if (age==8){
            System.out.println("You are underage");     // '==' is comparison operator
        }
        else{
            System.out.println("You cannot Drink Beer");
        }

        System.out.println("Enter the no of Cups");
        int cups = scan.nextInt();
        switch (cups) {
            case 39:
                System.out.println("The value of cups is 39");
                break;
            case 42:
                System.out.println("The value of cups is 42");
                break;
            case 40:
                System.out.println("The value of cups is 40");
                break;
            case 44:
                System.out.println("The value of cups is 44");
                break;

            default:
                System.out.println("The value of cups is not 39,42,43,44");
                break;
        }
    }
}
