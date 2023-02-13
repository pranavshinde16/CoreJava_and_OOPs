interface I {
  abstract void method1();
}
interface I2 extends I{
  abstract void method1();
}

class interface_MultipleInheritance implements I,I2 {
  public void method1(){System.out.println("Method-1 executed ");}
  public static void main (String args[]){
    interface_MultipleInheritance M1 = new interface_MultipleInheritance();
    M1.method1();
  }
}
