package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileInfoOperations {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\Java_SpringBoot\\Demo\\Testing.txt");

        if(f.exists()){
            //getName() to get the file name
            System.out.println("File Name: "+f.getName());

            //getAbsolutePath to get the actual path of the file
            System.out.println("File Path: "+f.getAbsolutePath());

            //canWrite() to check whether we were able to write into the file
            System.out.println("Can we write data: "+f.canWrite());

            //canRead() to check whether we are able to read from file
            System.out.println("Can we read data: "+f.canRead());

            //length() will give the size of file
            System.out.println("File size: "+f.length());

            //delete() to delete file
            System.out.println("File Removed..!"+f.delete());

        }else {
            System.out.println("File does not exists..!");
        }
    }
}
