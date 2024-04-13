package Inheritance;
//Inheritance in Java is a fundamental concept of object-oriented programming (OOP) that allows classes to inherit attributes and methods from other classes. It promotes code reusability and the creation of a hierarchical relationship between classes.

public class car extends Parent{
    public String model(){
        return "BMW x1";
    }

    public static void main(String[] args) {
        car myCar=new car();
        myCar.transportmode();
        System.out.println(myCar.model());
    }
}
