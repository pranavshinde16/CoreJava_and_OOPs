package com.company;

public class Faltu4 {
    static int ProductSmallestPair(int[] arr,int sum){
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                min2 = min;
                min = arr[i];
            }
            else if((arr[i]<min2)&&(arr[i]!=min)){
                min2 = arr[i];
            }
        }
        int c = min+min2;
        return c<=9?min*min2:-1;
    }





    public static void main(String[] args) {
        int[] Arr= {9,8,3,-7,3,9};
        System.out.println(ProductSmallestPair(Arr,9));
    }
}
