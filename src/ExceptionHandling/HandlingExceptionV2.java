package ExceptionHandling;

public class HandlingExceptionV2 {
    public static void main(String[] args) {

        int i=0;

        int[] a=new int[5];

        //We can also declare multiple catch expressions
        try {
            //i=i/0;
            System.out.println(a[7]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
