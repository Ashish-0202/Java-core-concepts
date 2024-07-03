package ExceptionHandling;

public class RuntimeException {
    public static void main(String[] args) {
        //Runtime exception is the exception occurred during the execution of program
        //It was checked at the run time
        //It is also called as Unchecked Exception
        int[] a = new int[5];

        //try to access the array at index 3
        System.out.println(a[3]);

        //Now try to access the 6th element
        System.out.println(a[6]);

        //Some of the imp or common Runtime Exceptions are
        //ArrayBoundOutOfIndex
        //NullPointerException
        //ArithmeticException
    }
}
