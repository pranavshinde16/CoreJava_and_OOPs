

public class Cocubes_test {
     static int Distance(int Ax,int Ay,int Bx,int By){
        int d1 = (int)Math.pow(Ax,2)+(int)Math.pow(Ay,2);
        int d2 = (int)Math.pow(Bx,2)+(int)Math.pow(By,2);
        return Math.min(d1,d2);
    }

    public static void main(String[] args)
    {
       int result = Distance(6,8,3,4);
        System.out.println(result);
    }
}
