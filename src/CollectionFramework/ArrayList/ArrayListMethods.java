package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list);

        //To add the element at the required index or position
        list.add(1,3);
        System.out.println(list);

        //To add a new list into the existing list
        List<Integer> newlist= new ArrayList<>();
        newlist.add(20);
        newlist.add(30);
        System.out.println("New List elements:"+newlist);

        list.addAll(newlist);
        System.out.println("Printing list elements after adding new list:");
        System.out.println(list);

        //To get an element with index
        System.out.println("Element at given index: "+list.get(3));

        //To remove an element from the list using index
        list.remove(3);
        System.out.println(list);

        //To remove an element using actual element value
        list.remove(Integer.valueOf(20));
        System.out.println(list);

        //To remove all elements from the list
        //list.clear();
        System.out.println("List after clearing all elements: " + list);

        //To Update en element in the list at given index
        //list.set(3,1000);
        System.out.println(list);

        //To check whether the given element is present in the list
        //Not this method will return a boolean type
        System.out.println(list.contains(1000));

        //To get the size of the array
        System.out.println(list.size());

    }
}
