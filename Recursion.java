//package com.company;
// using Function inside function  is called Recursion -------works as loop
public class Recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }   //----------(1)
        else{
            return n * factorial(n-1);
        }
    }         // factorial(5) = factorial(int n)
              // 5 * factorial(4)
              // 5 * 4 * factorial(3)
              // 5 * 4 * 3 * factorial(2)
              // 5 * 4 * 3 * 2 * factorial(1)
              // 5 * 4 * 3 * 2 * 1   ------------------by (1)

// Program to calculcate sum of n numbers
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        int c = sum(5);
        System.out.println(c);
//        System.out.println("The factorial of given number is: "+ factorial(25));
    }
}
