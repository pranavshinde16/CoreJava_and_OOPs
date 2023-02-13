import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year you want");
        int year = sc.nextInt();
        if ((year%4 == 0) && (year%100!=0) || (year%400==0))
            System.out.println(year+" is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");

    }

//    Example :-  year = 3000;
//      (It should be divisible by 4 ) && (Not divisible by 100)--------for years like 1900,2000,3000
//                            OR
//    (It should be divisible by 400)--------for years like 1900,2000,3000
}
