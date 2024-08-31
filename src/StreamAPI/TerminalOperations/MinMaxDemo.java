package StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        final Optional<Integer> min = list.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Min: "+min.get());

        final Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Max: "+max.get());
    }
}
