package Polymorphism;

//Overriding means we have two different classes in which one is child and one is parent
//Both class have same method with same arguments
class Parent{
    public void method(){
        System.out.println("From parent class..!");
    }
}

//Through overriding child class can provide specific implementation for the method which is already defined in parent class
class Child extends Parent{
    public void method(){
        System.out.println("From child class..!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p1= new Parent();

        p1.method();
    }
}
