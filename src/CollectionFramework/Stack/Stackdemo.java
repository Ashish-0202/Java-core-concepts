package CollectionFramework.Stack;

import java.util.Stack;

//Stack is a class inside collection framework which is implementing list interface
//Stack follows the order of Last In First Out(LIFO) elements

public class Stackdemo  {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        //push() method in stack is used to insert elements
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Tiger");

        System.out.println("Stack elements: "+animals);

        //peek() method is used to print top element
        System.out.println("Top element:"+animals.peek());

        //pop() method is used to remove top element as stack will remove last inserted element first
        animals.pop();
        System.out.println("Top element:"+animals.peek());
    }
}
