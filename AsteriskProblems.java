package com.company;
import java.util.Scanner;

public class AsteriskProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Problem-1
 //      # Increasing Triangle
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
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

        for(int i=1,p=1;i<=5;i++,p++){
            for(int j=5;j>=i;j--){
                System.out.print(p+" ");
            }
            System.out.println();
        }




    }
}
