//package com.company;
//import java.util.Scanner;

public class Pattern_Problems {
    public static void main(String[] args) {


//        Problem-1
 //      # Increasing Triangle
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<10;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//       # Decreasing Triangle
//        for (int m=1;m<=4;m++){
//            for(int s=4;s>=m;s--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 1) Butterfly

        int n = 10;
        // Upper half
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//                                2) Pyramid
//        int m=12;
//         for(int i=1;i<=m;i++){
//             //spaces
//             for(int j=1;j<=(m-i);j++){
//                 System.out.print(" ");
//             }
//             // Numbers or Asterisk
//             for(int j=1;j<=i;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }


//                             3) Diamond
        // Upper-half
//        int k=12;
//        for(int i=1;i<=k;i++){
//            //spaces
//            for(int j=1;j<=(k-i);j++){
//                System.out.print(" ");
//            }
//            // Asterisks
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }
        // Lower-half
//        for(int i=k;i>=1;i--){
//            //spaces
//            for(int j=1;j<=(k-i);j++){
//                System.out.print(" ");
//            }
//            // Asterisks
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }






    }
}
