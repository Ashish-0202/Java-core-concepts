package StreamAPI.IntermediateOperations;

//Filter will filter the given stream object based on condition
//It has an Predicate Interface which return true or falso

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,1,2,4,6,7,6,8);

        list.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
