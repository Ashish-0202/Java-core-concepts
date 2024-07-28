package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //FileReader will convert the given file into read format
        try{
            FileReader fs= new FileReader("D:\\Java_SpringBoot\\Demo\\Testing.txt");
            //read() method will return value in Integer format while reading character by character data from the file.
            try{
                int i;
                while ((i= fs.read())!= -1){
                    //Will typecast the integer value into character format
                    System.out.print((char)i);
                }
            }finally {
                fs.close();
                System.out.println("\nFile closed..!");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
