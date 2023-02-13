package com.company;



class  cl1 {
    public int a;
    public void method1() {
        System.out.println("This is method 1 of class cl1");
    }
}

class cl2 extends cl1{
    public void method2(){
        System.out.println("This is method 1 of class cl2");
    }
    public void method1() {
        System.out.println("This is method 1 of class cl2");
    }
    //  This is called overRiding......method1() is implemented again in child class cl2 with same parameters i.e-()
}


public class Method_OverRiding {
    public static void main(String[] args) {
        cl1 a = new cl1();
        a.method1();

        cl2 b = new cl2();
        b.method1();


    }
}
