package StreamAPI.IntermediateOperations;

//Limit is opposite to skip , were limit will limit the stream to given stream

import java.util.Arrays;
import java.util.List;

public class LimitDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        list.stream()
                //It will print only first n elements
                .limit(4)
                .forEach(System.out::println);
    }
}
