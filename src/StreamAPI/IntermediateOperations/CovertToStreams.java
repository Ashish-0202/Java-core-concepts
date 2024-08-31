package StreamAPI.IntermediateOperations;

//Converting an Array into stream object

import java.util.Arrays;
import java.util.stream.Stream;

public class CovertToStreams {
    public static void main(String[] args) {

        //primitive array
        int[] arr1={1,2,3,4,5,6};

        //Object array
        Integer[] arr2={2,3,4,5,6,6};

        //We can use Arrays.stream() method to convert Object Array into stream
        Stream<Integer> integerStream= Arrays.stream(arr2);

        integerStream.forEach(System.out::println);

        //We can use Stream.of() method
        Stream<Integer> integerStream1= Stream.of(arr2);

        integerStream1.forEach(n-> System.out.println(n));

    }
}
