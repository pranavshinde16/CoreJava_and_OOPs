package com.company;

public class ContinueBreakStatements {
    public static void main(String[] args) {
        int i;
        for(i=0;i<10;i++){

            System.out.println(i);
            if(i==3){
                System.out.println("The loop has been broken");
                break;
            }
        }

        for(int j=0;j<10;j++){
            System.out.println(j);
            if(j==4){
                System.out.println("The loop will continue to print after printing 4 and its condition");
                continue;
            }
        }






    }
}
