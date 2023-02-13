

public class Array_Problems {
    public static void main(String[] args) {


        // 1) Sum of Array Elements
        int [] marks = {98, 45, 79, 99, 80};
        int sum = 0;
        for(int element:marks){
            sum = sum + element;
        }
        System.out.println("The sum of all the numbers in the Array is: "+sum);


                     // 2) Verify the given element in the Array
        int num = 99;
        boolean isInArray = false;

        for(int element:marks){
            if(element==num){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println(num+" is present in the Array");
        }
        else{
            System.out.println(num+" is not present in the Array");
        }


                //3) Reverse the array
        int[] arr = {2, 4, 6, 8, 10};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }


//   4) Swapping two numbers using third variable

        int a,b,t;
        a = 2;
        b = 6;

        t = a;
        a = b;
        b = t;

        System.out.println("\nThe values after swapping are "+"a = "+a +",b = "+b);

// 5) Swapping two numbers without using third variable

        int c,d;
        c = 4;
        d = 9;

        c = c+d;
        d = c-d;
        c = c-d;
        System.out.println("c = "+c+",d = "+d);


// 6) Reversing the array using 3rd variable

    int[] array = {9,8,7,6,5,4,3,2,1};
    int l = array.length;
    int n = Math.floorDiv(l,2);

    System.out.println("The original array is: ");
    for(int element:array){
        System.out.print(element+" ");
    }

    System.out.println("\nThe aray after reversing is: ");
    for(int i=0;i<=n;i++) {
        int temp = array[i];
        array[i] = array[l-1-i];
        array[l-1-i] = temp;
    }
    for(int element:array){
        System.out.print(element + " ");
    }

    // Finding Maximum Value
    int max = 0;
    for(int element:array){
        if(element>max){
            max=element;
        }
    }
        System.out.println("The maximum value in the Array is:"+max);






    }
}
