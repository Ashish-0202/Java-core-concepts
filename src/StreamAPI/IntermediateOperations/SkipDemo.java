package StreamAPI.IntermediateOperations;

//Skip will skip first given n elements

import java.util.Arrays;
import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        List<Integer> list1 = list.stream()
                .skip(4)
                .toList();

        System.out.println(list1);
    }
}

