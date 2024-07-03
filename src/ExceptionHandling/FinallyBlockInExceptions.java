package ExceptionHandling;

//finally block in exception will be declared after try catch block
public class FinallyBlockInExceptions {
    public static void main(String[] args) {
        System.out.println("Finally");
        int i=0;
        try {
            i=i/1;
            System.out.println("Inside Try");
        } catch (Exception e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println("Inside Catch");
            //finally block will be used to include some important clean code like closing a file or connection.
        } finally {
            System.out.println("From Finally block..!");
        }
        //some cases were finally block will not be executed
        //i) System.exit() method
        //ii) Exception inside a finally block
        //iii) The death of thread
    }
}
