package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list= new LinkedList<>();

        list.add(12);
        list.add(4);
        list.add(3);
        list.add(41);
        list.add(5);
        list.add(6);

        System.out.println(list);

        //LinkedList contains the same methods which are available in ArrayList<>()

        System.out.println(list.get(3));

        System.out.println(list.get(Integer.valueOf(3)));

        System.out.println(list.remove(3));

        System.out.println(list.contains(3));

        for (Integer i: list){
            System.out.println(i);
        }

        Iterator<Integer> iterator= list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
