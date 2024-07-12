package Generics;

//Generics Means a parameterized type

//Using Generics it is possible to create class that works with different data types
//Any entity such as class, Interface and method which are operates on parameterized types are generic types

public class GenericDemo1 {
    public static void main(String[] args) {

        //Note we need to use Wrapper classes to define parameterized type

        //First we created an object for type String for the Generic Class Student
        Student<String> s1=new Student<>("A1");

        System.out.println("Wrapper type String:" +s1.getId());
        //Then we created an object for type Integer for the Generic Class Student
        Student<Integer> s2= new Student<>(201);

        System.out.println("Wrapper type Integer:" +s2.getId());
    }
}

//Here we Created a parameterized type class <E> which is a Generic types
class Student<E> {
    E id;

    public Student(E id){
        this.id=id;
    }

    E getId(){
        return id;
    }
}