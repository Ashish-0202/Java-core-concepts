package ExceptionHandling;


//throws keyword is used in method declaration or signature to define the type of exception that might occur in it
public class ThrowsKeyword {

    public static void dividebyzero(int i) throws ArithmeticException {
        System.out.println(i=i/0);;
    }

    public static void main(String[] args)  {
        dividebyzero(10);
        System.out.println("After the method call..!");
    }
}
