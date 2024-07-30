package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java_SpringBoot\\Demo\\TestingNew.txt");

        java.io.BufferedOutputStream bufferedOutputStream=new java.io.BufferedOutputStream(fileOutputStream);

        String data="Hello Guys. writing data using BufferedOutputStream";
        bufferedOutputStream.write(data.getBytes());

        bufferedOutputStream.close();
        System.out.println("Content written successfully");
    }
}
