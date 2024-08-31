package StreamAPI.TerminalOperations;

//sum mainly works with int stream and used to get the sum of passed integers

import java.util.Arrays;
import java.util.List;

public class SumDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        int sum = list.stream()
                .mapToInt(n-> n.intValue())
                .sum();

        System.out.println(sum);
    }
}
