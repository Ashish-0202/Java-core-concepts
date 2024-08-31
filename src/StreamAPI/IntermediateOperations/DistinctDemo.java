package StreamAPI.IntermediateOperations;

/* distinct will nothing but will print only 1 set of element and will remove duplicate values which is similar to sql */

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
