package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,6,2,5);

        int result=list.stream()
                .filter(n->n%2==1)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);

        System.out.println(result);
    }
}
