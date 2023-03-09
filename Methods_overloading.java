//package com.company;

public class Methods_overloading {
     static void faltu(){
        System.out.println("This is faltu message");
    }
     static void change(int[] arr){
         arr[0] = 100;
    }

//    Overloaded function loo
    static void loo(){
        System.out.println("No Parameters and No arguments");
    }
    static void loo2(int a,int b){
        System.out.println("The parameters are: " + a+", "+ b);
    }


    public static void main(String[] args) {
        faltu();

        int [] marks = {48,50,41,38,50};
        change(marks);
        //  the [] marks in change(marks) will go in the function and there it will be processed and give output.
        System.out.println("The value after using function to marks array is: "+marks[0]);
        for (int element:marks){
            System.out.println(element+ " ");
        }

        // loo function
        loo();
        loo2(20,50);


//        static (void or int)------ these int and void are called return type(function)
//        ......hence our output will be integer or void message





    }
}
