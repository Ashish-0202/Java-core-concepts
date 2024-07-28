package CollectionFramework.ArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterators {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);

        //We have 3 ways to explicitly iterate each element of the array
        //First method using for loop
        for(int i=0;i<list.size();i++) {
            System.out.println("element using for loop: " + list.get(i));
        }

        //Second method using for each
        for(Integer element : list){
            System.out.println("For each element:"+element);
        }

        //Third method using Iterator interface
        //list.iterator() method will return an iterator type
        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator :"+iterator.next());
        }

    }
}
