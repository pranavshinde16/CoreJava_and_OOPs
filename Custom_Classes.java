package com.company;


class Employee{
    int id;
    String Name;
    int salary;
    int side;

    // Methods of class Employee
     public void getSalary(){
        System.out.println("My name is "+ Name);
        System.out.println("Salary: "+salary);
    }
    public int getId(){
         return id;
    }

    public int getArea(){
         return side*side;
    }
}




public class Custom_Classes {
    public static void main(String[] args) {

        Employee Pranav = new Employee();
        Pranav.id = 5;                 // Set the value of id to 5 for new object Pranav
        Pranav.Name = "Pranav Pramod Shinde";
        Pranav.salary = 80000;
        int myId = Pranav.getId();
        Pranav.getSalary();
        System.out.println("ID: "+myId);


//     New Employee
        Employee Kedar = new Employee();
        Kedar.salary = 100000;
        Kedar.id = 69;
        Kedar.Name = "Kedar Somnath Dhongade";
        Kedar.getSalary();
        System.out.println("ID: "+ Kedar.getId());


        Employee Area = new Employee();
        Area.side = 5;
        System.out.println("The area is: "+Area.getArea());

    }

}
