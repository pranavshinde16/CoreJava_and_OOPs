    package com.company;
// Function to print sum of "n" numnber of elements
public class Variable_Arguments {

    static int sum(int...arr){
        // ....arr = numbers entered by user will be available as an array in the function written
        int result = 0;
        for(int element:arr){
            result = result +element;
        }
        return result;
    }

//    static int sum(int a,int b){
//        return a+b;
//    }


    public static void main(String[] args) {

        System.out.println(sum(5,5,5,5));





//        System.out.println(sum());
        // Here it is mandatory to give a and b parameters as mentioned in static function above



    }
}
