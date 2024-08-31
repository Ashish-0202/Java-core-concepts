package StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,1,1,4,5,2,1,3,5);

        boolean b = list.stream()
                .anyMatch(n->n%2==0);

        System.out.println("Even numbers in the list: "+b);
    }
}
