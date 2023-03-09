import java.util.Scanner;

public class Exception_Handling {


    public static void main(String[] args) {
        int a = 999;
        int b= 0;    // Put b = 0 for getting the exception
        int c;
        try{
            c = a/b;
            System.out.println("The answer is : "+c);
        }
        catch(Exception e){
            System.out.println("Failed to divide");
            System.out.println("Reason:"+ e);
        }

//        int []students = new int [5];
//        students[0] = 40;
//        students[1] = 50;
//        students[2] = 60;
//        students[3] = 70;
//        students[4] = 80;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Index of the Array");
//        int input = sc.nextInt();
//        try{
//            System.out.println("Passed Level-1 of try-catch");
//
//            try {
//                System.out.println(students[input]);
//                System.out.println("Passed Level-2");
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Exception occurred in Level-2");
//                System.out.println("The array index you entered doesnot exist");
//                System.out.println("The exception is"+e);
//            }
//        }
//        catch (Exception e){
//            System.out.println("Exception occurred in Level-1");
//            System.out.println(e);
//        }





    }
}
