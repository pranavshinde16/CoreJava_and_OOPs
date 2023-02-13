//package com.company;
// Access Modifiers in JAVA
//1) Private
//2) Default
//3) Protected
//4) Public

// Getter = returns the value. (accessors)
// Setter = Sets/updated the value (modifiers)

// Setter sets the int id = 5 in its function........and then Getter gets this modified id and returns it.
class allEmployee {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

class AreaCircle{
    int radius;
    int area;

    public void setRadius(int r){
        this.radius = r;
    }

    public int getArea(){
        return radius*radius;
    }
}

public class AccessModifiers_getters_setters {
    public static void main(String[] args) {

        allEmployee Employee1 = new allEmployee();
        Employee1.setName("Pramod");
        Employee1.setId(10);
        System.out.println(Employee1.getName());
        System.out.println(Employee1.getId());


        // Class AreaCircle
        AreaCircle Area = new AreaCircle();
        Area.setRadius(5);
        System.out.println(Area.getArea());

    }
}
