package StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* Sorted will be going to sort the element in natural ascending order. We can also reverse the order */

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        //Natural order
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------------");
        //Reverse order
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("---------------");

        //Sorting the elements based on the length of string
        List<String> list1 = Arrays.asList("zebra","ashish","monkey","cow");

        list1.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
