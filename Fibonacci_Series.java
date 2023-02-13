

public class Fibonacci_Series {

    static int a=0,b=1,c;
    static void fibonacci(int i){
        if(i>1){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
            fibonacci(i-1);
        }
    }
    public static void main(String[] args) {
        fibonacci(5);

    }
}
