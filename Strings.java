package com.company;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        char grade = 'B';
        grade = (char) (grade +8);
        System.out.println(grade);




        String Pranav = "Pranav is a Smart guy";
        System.out.println(Pranav);
        Scanner obj = new Scanner(System.in);
//        String str = obj.next();                    // Reads only till white space occur
//        String str2 = obj.nextLine();
//        System.out.println(str);
//        System.out.println(str2);


        System.out.println(Pranav.length());

        System.out.println(Pranav.indexOf('S'));
        System.out.println(Pranav.lastIndexOf("a"));

        System.out.println(Pranav.toLowerCase());
        System.out.println(Pranav.toUpperCase());


        System.out.println(Pranav.substring(4,10));   // Prints a new string which starts with char at index-2
        System.out.println(Pranav.charAt(5));         // Gives char at index-5
        System.out.println(Pranav.replace("Pranav","Karan"));
        System.out.println(Pranav.startsWith("Pra"));    //checks if the string starts with("");
        System.out.println(Pranav.endsWith("guys"));

        String Pranav2 = "Smart and Handsome";
        System.out.println(Pranav.equals(Pranav2));


        
    }
}
