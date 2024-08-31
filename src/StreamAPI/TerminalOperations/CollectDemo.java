package StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        List<Integer> list1 = list.stream()
                .filter(n-> n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
