

public class Fibonacci_Series {

    static int a=0,b=1,c;
    static void fibonacci(int i){
        if(i>2){
            c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
            fibonacci(i-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(a+" "+b);
        fibonacci(9);
    }
}
