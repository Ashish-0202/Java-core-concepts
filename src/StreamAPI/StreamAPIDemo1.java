package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,5,6,4,1);

        Stream<Integer> data = list.stream();
        Stream<Integer> sortedData= data.sorted();
        //sortedData.forEach(n-> System.out.println(n));
        //data.forEach(n-> System.out.println(n));
        //Note if the stream is consumed once then we cannot consume it again

        System.out.println("-----Normal way using loop----");
        for (int i=0;i<list.size();i++){
            int j= list.get(i)*2;
            //int result= j*j;
            System.out.println(j);
        }

        System.out.println("----Using Stream API-----");
        List<Integer> nums=Arrays.asList(55,2,44,23,11,1,1);

        List<Integer> num2=new ArrayList<>();

               num2= nums.stream()
                .sorted()
                .filter(n-> n%2==1)
                .distinct()
                .map(n -> n*2)
                .toList();
                //.forEach(n -> System.out.println(n) );

        for(int n: num2){
            System.out.println(n);
        }

    }
}
