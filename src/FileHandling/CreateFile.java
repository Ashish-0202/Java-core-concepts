package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f=new File("D:\\Java_SpringBoot\\Demo\\Testing.txt");
        //Note: we need to handle the io exceptions while performing file operations

        //Two ways to handle exception try catch block or throws keyword at method declaration
        try{
            if (f.createNewFile()){
                System.out.println("File created successfully.!");
            } else {
                System.out.println("File already exists..!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
