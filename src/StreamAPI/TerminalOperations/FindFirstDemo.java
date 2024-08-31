package StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        Optional<Integer> first = list.stream()
                .filter(n-> n%2==0)
                .findFirst();

        System.out.println(first.get());
    }
}
