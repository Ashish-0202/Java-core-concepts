package CollectionFramework.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(12);
        list.add(15);
        list.add(1);

        System.out.println(list);

        Collections.sort(list);

        System.out.println("List after sorting: "+list);

        //Max element in the list
        System.out.println("Max: "+Collections.max(list));
        //Min element from the list
        System.out.println("Min: "+Collections.min(list));

        //It will print the frequency of occurrence of mentioned element from the list
        System.out.println("Frequency: "+Collections.frequency(list,1));


    }
}
