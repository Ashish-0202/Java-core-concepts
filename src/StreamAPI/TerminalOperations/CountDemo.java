package StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        long count = list.stream().count();

        System.out.println(count);
    }
}
