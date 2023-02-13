import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any name you want:-");
         String str = sc.nextLine();
         String rev = "";
         int length = str.length();
         for (int i= length-1;i>=0;i--){
             rev = rev + str.charAt(i);
         }
//        System.out.println(rev);
        if (rev.equals(str)) {
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is not a Palindrome");
        }

//        Last index position is always (length-1) = last index
//          1 2 3 4 5 6     ---length
//          P R A N A V
//          0 1 2 3 4 5     ----index


        System.out.println("Enter any number of your choice");
        int n = sc.nextInt();
        int z = n;
        int reverse = 0;

        while(n>0){
            reverse = reverse*10 + n%10;
            n = n/10;
        }

        if (reverse == z){
            System.out.println("The Entered number is a palindrome");
        }
        else{
            System.out.println("The Entered number is not a palindrome");
        }





    }
}
