abstract class Base1{
  abstract void method1();
}
class Base2 extends Base1{
  void method1(){
    System.out.println("This is implementation of the above abstract class");
  }
}

// Main class
class Abstraction {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Base2 B2 = new Base2();
    B2.method1();
    
    Bike obj = new Honda4();  
    obj.run();  
    
    Circle c = new Circle();
    c.draw();
    Rectangle r = new Rectangle();
    r.draw();
  }
}

// Abstraction :- abstraction refers to hiding the internal implementation of the feature and only showing the functionality to the users.
// Abstract Class:-A class which is declared as abstract keyword is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.
// Abstract method :- A method that is declared with abstract keyword and it doesnot have any implementation (method without body) is calles as Abstract Method

// Points to Remember:-
// An abstract class is a class that is declared with an abstract keyword.
// Any class that contains one or more abstract methods must also be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.(Object of the Abstract class cannot be created)
// It can have constructors and static methods also.
// There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”


// Example-2
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
void run(){System.out.println("Honda-4 is running safely");}   
}  

// Example-3
abstract class Shape{  
abstract void draw();  
}    
class Rectangle extends Shape{  
void draw(){System.out.println("Drawing rectangle");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("Drawing circle");}  
}  
