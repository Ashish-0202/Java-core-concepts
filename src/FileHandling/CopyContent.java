package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContent {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream= new FileInputStream("D:\\Java_SpringBoot\\Demo\\TestingNew.txt");

            FileOutputStream fileOutputStream=new FileOutputStream("D:\\Java_SpringBoot\\Demo\\TestingNew1.txt");

            try{
                int ch;
                while ((ch=fileInputStream.read())!= -1){
                    fileOutputStream.write((char)ch);
                }
                System.out.println("File Content copied successfully..!");
            }finally {
                fileInputStream.close();
                fileOutputStream.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
