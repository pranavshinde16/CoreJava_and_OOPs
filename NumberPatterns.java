//package com.company;
import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {

// #Number patterns
        for(int i=1,p=1;i<=5;i++,p++){
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
// Output:-
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5



//        for(int i=1,p=0;i<=5;i++,p++){
//            for(int j=1;j<=i;j++){
//                System.out.print(2*p+" ");
//            }
//            System.out.println();
//        }
// Output:-
//        0
//        2 2
//        4 4 4
//        6 6 6 6
//        8 8 8 8 8



//        for(int i=1,p=1;i<=5;i++,p++){
//            for(int j=1;j<=i;j++){
//               if(p%2==0){
//                   System.out.print("2 ");
//               }
//               else{
//                   System.out.print("1 ");
//               }
//            }
//            System.out.println();
//        }
//        Output:-
//        1
//        2 2
//        1 1 1
//        2 2 2 2
//        1 1 1 1 1



//        for(int i=1,p=1;i<=5;i++){
//            for (int j=1;j<=i;j++,p++) {
//                System.out.print(p+" ");
//            }
//            System.out.println();
//        }
//     Ouptut:-
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15




//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        Output:-
//        5 4 3 2 1
//        5 4 3 2
//        5 4 3
//        5 4
//        5
//
//        // OR //
//
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }



        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        // Output:-
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

    }
}
