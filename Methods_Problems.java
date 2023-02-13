package com.company;

public class Methods_Problems {


    static void tables(int n){
            for(int i=1;i<=10;i++){
                System.out.printf("%d x %d = %d\n",n,i,n*i);
            }
    }

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum(int n){
        if (n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }




    public static void main(String[] args) {
//        tables(7);
        pattern(5);
        System.out.println(sum(5));
    }
}


