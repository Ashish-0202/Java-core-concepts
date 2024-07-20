package Polymorphism;

//Poly means many & Morph means forms
//It is a process in which an object or function taking multiple forms
public class MethodOverloading {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    //Overloading means we have two or more methods with same name but different number of arguments in one class
    public static void main(String[] args) {
        MethodOverloading overloading= new MethodOverloading();

        System.out.println(overloading.add(4,6));

        System.out.println(overloading.add(5,7,9));
    }
}
