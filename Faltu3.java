import java.util.Scanner;
public class Faltu3 {
// Find sum of numbers at prime indices
//    public static int SumPrimeIndices(int[] arr ) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (isPrime(i) && i != 1 && i!=0) {
//                count = count + arr[i];
//            }
//
//        }
//        return count;
//    }
//    public static boolean isPrime(int n) {
//        boolean result = true;
//        for (int i = 2; i <n; i++) {
//            if(n%i == 0) {
//                result = false;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] array = {10,-12,2,5,3,15,17,21,-3,-4};
//        System.out.println(SumPrimeIndices(array));



        //    Java program to find all duplicate characters in a string
        System.out.println("Enter a string to check repeating characters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] carray = str.toCharArray();
        int count = 0;
        System.out.print("The repeating characters are as follows:- ");

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(carray[i]==carray[j]){
//                    System.out.print(carray[i]+" ");
                        count++;
                }
            }
        }


    }
}
