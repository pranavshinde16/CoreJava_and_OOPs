package com.company;

public class IncDecOperators {
    public static void main(String[] args) {
        int i = 50;
        int j = 60;
        char a = 'A';
        System.out.println(i++); // By i++, the value is only incremented and stored,it wil not print 51 instantly
        System.out.println(i);   // Step-2 of the above
        System.out.println(++j);  // ++j will first print incremented value
        System.out.println(++a);  // prints next character after "A"

//        printing Aplhabets from A to Z
        char alf;
        for (alf = 'A'; alf <= 'Z'; alf++) {
            System.out.print(alf+" ");
        }
    }
}

