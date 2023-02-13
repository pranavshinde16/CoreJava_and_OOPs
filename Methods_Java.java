//package com.company;

public class Methods_Java {

   static int operation(int a,int b) {
        int z;
        if (a > b) {
             z = a*b;
        }
        else {
            z =a+b;
        }
        return z;
    }
    static int multiply(int a, int b){
//        System.out.println(a*b);
        return a*b;
    }

    static void fullName(String yourName,String fatherName,String surName){
        System.out.println(yourName+fatherName+surName);
    }


    public static void main(String[] args) {
    int c;
        c = operation(5,4);              // Runs only if Static is mentioned before method
        System.out.println(c);


        // When the method is not static
        Methods_Java obj = new Methods_Java();  // object creation
        int m = obj.operation(10,9);
        System.out.println(m);     // object.function();


//        Methods_Java.multiply(2,5);
        int a1 = multiply(100,400);
        System.out.println(a1);

        fullName("P","P","S");


//        Methods_Java.fullName("Pranav ","Pramod ","Shinde");





    }


}
