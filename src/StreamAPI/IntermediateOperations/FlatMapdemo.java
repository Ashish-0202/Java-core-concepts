package StreamAPI.IntermediateOperations;

/* Flatmap we use to flatten the given lists of list into individual elements/list */

import java.util.Arrays;
import java.util.List;

public class FlatMapdemo {
    public static void main(String[] args) {
        List<List<String>> listofList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        listofList.stream()
                //If we have complex datastructure we can use flatmap to divide or flatten
                .flatMap(list -> list.stream())
                .map(n-> n.toUpperCase())
                .forEach(n-> System.out.println(n));
    }
}
