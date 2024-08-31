package StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> list1 = list.stream()
                //peek() is nothing but used to print the stream objects or list
                .peek(System.out::println)
                .map(n->n*n)
                .peek(System.out::println)
                .toList();

        System.out.println("List:" +list1);
    }
}
