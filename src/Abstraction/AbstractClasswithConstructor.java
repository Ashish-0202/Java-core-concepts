package Abstraction;

//yes we can have a constructor inside abstract class
//We use constructors to initialize the data members of the class and abstract class can have data members.

//When you extend an abstract class it will become a parent class, and when you have a default constructor in child class that is a non-abstract class
//Then here the first line of child class constructor will call the super class constructor and this time you abstract class constructor will be invoked.

abstract class MyAbstractclass{
    public MyAbstractclass(){
        System.out.println("Inside myabstract class constructor");
    }
}

public class AbstractClasswithConstructor extends MyAbstractclass{
    public AbstractClasswithConstructor(){
        System.out.println("Inside child class constructor..!");
    }

    public static void main(String[] args) {
        AbstractClasswithConstructor constructor=new AbstractClasswithConstructor();
    }
}
