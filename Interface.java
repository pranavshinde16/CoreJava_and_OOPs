// 1) The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. 
// 2) Interface is used to achieve abstraction and multiple inheritance in Java. Interface cannot be instantiated (object cannot be created)
// 2) A class extends another class,
//   an interface extends another interface, 
//   but a class implements an interface.
// 3) Multiple Inheritance:- Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one parent class.
//    The problem occurs when there exist methods with the same signature in both the superclasses and subclass. 
//    On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority. 
// 4) A class that implements an interface must implement all the methods declared in the interface. To implement interface use implements keyword.
// Since Java 8, we can have default and static methods in an interface.
// Since Java 9, we can have private methods in an interface.


// Example-1
interface Gadgets{
  abstract void type();
}
class Phone implements Gadgets{
  public void type(){
    System.out.println("This Phone is a Smartphone");
  }
}

// Example-2
interface Drawable{  
    abstract void draw();  
}  
class Rectangle1 implements Drawable{
public void draw(){System.out.println("Drawing a Rectangle");}  
}  
class Circle1 implements Drawable{
public void draw(){System.out.println("Drawing a Circle");}  
}  

// MAIN
class Interface {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Phone P = new Phone();
    P.type();
    
    Circle1 c = new Circle1();
    c.draw();
  }
}


// Example-3 (Interface inheritance)

//interface Vehicle{
//  abstract void run();
//}
//
//interface BMW extends Vehicle{
//  abstract void braking();
//}
//
//class Base implements BMW{
//  public void braking(){
//    System.out.println("BMW has best braking system in the segment");
//  }
// Main method
//   public static void main(String args[]){  
            // Base B1 = new Base();
            // B1.braking(); }

