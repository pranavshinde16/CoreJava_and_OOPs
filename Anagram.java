import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        if(A.length()!=B.length()) return false;
        for(int i=0;i<A.length();i++)
        {
            int countA=0;
            int countB=0;
            for(int j=0;j<A.length();j++){
                if (A.charAt(i)==A.charAt(j)) countA++;  // to check how many times the character occured in the same String

                if (A.charAt(i)==B.charAt(j)) countB++;  // to check how many times the character matches with the second string
            }
            if(countA==countB)  continue;
            else  return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter two words to check:-");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
