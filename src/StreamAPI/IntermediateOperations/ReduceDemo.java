package StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        Integer sum= list.stream()
                .reduce(0,(a,b)->a+b);

        System.out.println(sum);
    }
}
