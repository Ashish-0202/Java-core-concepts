package FileHandling;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file1=new File("D:\\Java_SpringBoot\\Demo\\Testing.txt");

        File file2=new File("D:\\Java_SpringBoot\\Demo\\TestingNew.txt");

        if (file1.exists()){
            System.out.println(file1.renameTo(file2));
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
