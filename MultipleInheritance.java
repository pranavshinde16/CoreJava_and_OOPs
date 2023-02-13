// 1) Multiple Inheritance:- In Multiple Inheritance a class can inherit properties of more than one parent class.
         // Java doesn’t support Multiple Inheritance
         // The problem occurs when there exist methods with the same name in both the superclasses and subclass.
         // On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority.

//// 2) Multiple-Inheritance is not supported in the case of class because of ambiguity.
//// However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.
//
//// 3) Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
//
//// 4) Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile
//
//class A{
//void msg(){System.out.println("Hello");}
//}
//class B{
//void msg(){System.out.println("Welcome");}
//}
//
//class MultipleInheritance extends A,B {
//  public static void main(String[] args) {
//    // System.out.println("Hello world!");
//      MultipleInheritance obj=new MultipleInheritance();
//       obj.msg();
//  }
//}


// # The above code throws compile time error