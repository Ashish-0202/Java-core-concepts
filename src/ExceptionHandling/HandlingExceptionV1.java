package ExceptionHandling;

public class HandlingExceptionV1 {
    //With the help of try catch block we can handle the exception
    //And also prevents the abnormal termination of program
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Not able to divide a number by zero..!");
        }catch (Exception e){
            System.out.println("Something Went wrong..!");
        }

        //Even though we have an error in the above print statement the program will not terminate
        System.out.println("Hello Guys");
    }
}
