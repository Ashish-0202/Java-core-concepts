package Strings;

import java.util.Scanner;

public class StringDemo1 {

    public static void main(String[] args) {

        //Declare
        //String name="Ashish Shenoy";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        //To Store single word as input in the given input
        String name= sc.next();
        System.out.println("Your Name: "+name);

        System.out.println("Enter Your name again:");
        //To Store all the given words from input
        String name2= sc.nextLine();
        System.out.println(name2);

        //Strings are Immutable in Java means not changeable
        //Once you define a string we cannot change its value or delete it or update it in the memory(String Constant pool)
    }
}
