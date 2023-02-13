package com.company;
// 1) Constructor is similar to method, having same name as that of the ClassName
// 2) Doesnot have any return type,not even void
// 3) The only modifirers applicable are public,protected,default and private


class Messages{
    int id;
    String gender;
    public Messages(int i, String g){
        this.id = i;
        this.gender = g;
    }

    public void getDetails(){
        System.out.println("ID: "+ id );
        System.out.println("Gender: "+ gender);
    }
}
public class Constructors {
    public static void main(String[] args) {
    Messages msg = new Messages(69,"Male");    // CONSTRUCTOR INSTANCE
    msg.getDetails();
    }
}













// class employee {
//        constructor(myName, myAge, myIntrest) {
//            this.name = myName;
//            this.age = myAge;
//            this.intrest = myIntrest;
//            // this.run = function(){
//            //     console.log(`I am ${this.name},my age is ${this.age}years and my interest is ${this.interest}`)
//            // }
//        }
//        result() {
//            console.log(`I am ${this.name},my age is ${this.age} years and my interest is ${this.intrest}.`)
//        }
//
//       join() {
//            console.log(`${this.name} will get placed at age ${this.age + 1} in a good Firm through ${this.intrest} .`);
//        }
//
//        static multiply(a, b) {
//            return a * b;
//        }
//    }
//
//
//    let cv = new employee("Pranav Shinde", 21, "Coding");
//    console.log(cv);
//    console.log(cv.name)
//    // console.log(employee.multiply(5, 15));
//    // console.log(cv.join());
//    // console.log(cv.result());