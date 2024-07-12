package Generics;

//generic methods are similar to the generic class where we are creating the methods that work with different data types
public class GenericMethodDemo {
    public static void main(String[] args) {
        printData(3);
        printData("Hello..!");
    }

    //This is a generic method with type E
    //In Generic method we add parameter type after access modifier public and before return type void
    static <E> void printData(E data){
        System.out.println(data);
    }
}
