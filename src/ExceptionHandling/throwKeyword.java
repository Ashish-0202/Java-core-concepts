package ExceptionHandling;

import java.util.Calendar;
import java.util.Scanner;

//throw keyword is used to explicitly throw an single exception
//Can also be used to throw an custom exception
public class throwKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you age: ");
        try {
            int age= sc.nextInt();
            if (age>100){
                //throw new Exception("Age grater than 100 not allowed");
                throw new CustomException("Age grater than 100 not allowed");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static class CustomException extends Exception{
        public CustomException(String message){
            super(message);
        }
    }
}
