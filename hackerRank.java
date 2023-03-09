//package com.company;
import java.util.Scanner;

public class hackerRank {

//    Input Format
//
//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
//
//Output Format
//
//For each line, print the line number, followed by a single space, and then the line content received as input.
//

//Sample Input----
//Hello world
//I am a file
//Read me until end-of-file.

//Sample Output-----
//1 Hello world
//2 I am a file
//3 Read me until end-of-file.

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int i = 1;
//        while (sc.hasNext()) {
//            String s = sc.nextLine();
//            System.out.println(i + " " + s);
//            i++;
//        }
//The java.util.Scanner.hasNext() method Returns true if this scanner has another token in its input.
// This method may block while waiting for input to scan. The scanner does not advance past any input.




        int [] prices= {4,9,2,3};
        int a = prices[0];
        int b = prices[1]-prices[0];
        int c0 = Math.min(prices[0],prices[1]);
        int c1 = Math.max(1-c0,0);
        int d = prices[3]-prices[2];

        System.out.println(a+b+c1+d);





    }
}
