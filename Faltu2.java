//package com.company;

public class Faltu2 {

    static int findCount(int[] arr,int num,int diff){
         int l = arr.length;
         int a=0;
         for(int i=0;i<l;i++){
             int count = Math.abs(num-arr[i]);
             if(count<=diff){
                  a++;
             }
         }
         return a>0?a:-1;
    }

    static int findSum(int n,int m){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<=m;i++){
            if(i%4==0){
                sum1 = sum1 +i;
            }
            else{
                sum2 = sum2+i;
            }
        }
        return Math.abs(sum1-sum2);
    }



    static int smallest_pair(int[] a,int sum)
    {
        int min =  Integer.MAX_VALUE, secondMin =  Integer.MAX_VALUE;
        for (int j = 0; j < a.length; j++)
        {

            // If found new minimum                       //  int[] array = {9,8,3,-7,3,9};
            if (a[j] < min)
            {
                secondMin = min;
                min = a[j];
            }

            // If current element is > min and < secondMin
            else if ((a[j] < secondMin) && a[j] != min)

                // Update secondMin
                secondMin = a[j];
        }

        // Return the sum of the minimum pair
        int c =(secondMin + min);
        if(c<sum){
            return secondMin*min;
        }
        return 0;
    }

    public static void main(String[] args) {
//        int[] array = {12,3,14,56,77,13};
//        int output = findCount(array,20,10);
//        System.out.println(output);
        System.out.println(findSum(4,20));

//        int[] array = {9,8,3,-7,3,9};
//        System.out.println(smallest_pair(array,4));

    }
}
