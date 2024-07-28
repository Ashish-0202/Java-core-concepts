package FileHandling;

//FileWriter class is used to write the data in character form into the file
//If the file is not present in the path then it will create new file
//FileWriter is meant for writing streams of characters

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try {
            FileWriter file=new FileWriter("D:\\Java_SpringBoot\\Demo\\Testing.txt");
            try {
                file.write("Hello Guys this sentence is written through java code..!");
            } catch (FileNotFoundException e){
                System.out.println(e.getMessage());;
            }finally {
                file.close();
            }
            System.out.println("Successfully wrote into the file..!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
