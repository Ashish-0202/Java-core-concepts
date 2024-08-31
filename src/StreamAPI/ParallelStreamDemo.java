package StreamAPI;

//Parallel stream are used to execute the stream in a thread and synchronised manner

import java.util.Arrays;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long[] longArray = new long[20000];

        for (int i=0;i< longArray.length;i++){
            longArray[i] =i+1;
        }

    }
}
