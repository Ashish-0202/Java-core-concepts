package ExceptionHandling;

import java.io.File;

public class CompileTimeException {
    //These exceptions are checked at Compile time
    //These are also called as Checked Exceptions
    //Programmer is prompted to handle this exception
    public static void main(String[] args) {
        //If you want to access a file then u need to handle exception
        File file=new File("\"E:\\Resume\\suggi.pdf\"");

        //Here if I direct try to call this method it is throwing me an error now itself
        //file.createNewFile();

        //To Handle these exception we can use try catch block or by adding exception to method signature.
        //Common Compile time exception
        //FileNotFoundException
        //Class Not Found
        //Method Not Found
    }
}
