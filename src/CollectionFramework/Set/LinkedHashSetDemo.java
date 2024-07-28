package CollectionFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new LinkedHashSet<>();

        set.add(13);
        set.add(1);
        set.add(14);
        set.add(51);
        set.add(11);

        //LinkedHashSet class is also implementing the properties of LinkedList so here the order of element will be maintained.
        System.out.println(set);

        //In LinkedHashSet the hash value of each element will be unique
        //We can use same method that we use in the list
        System.out.println(set);

        //remove method will remove the given object from the set
        System.out.println(set.remove(6));

        System.out.println(set);

        //size() method will be used to get the size of the set
        System.out.println(set.size());

        //contains() method will check whether the given object is present or not
        System.out.println(set.contains(24));

        //isEmpty() method will print whether the set is empty or not
        System.out.println(set.isEmpty());

        //Clear method will clear the set
        //set.clear();
    }
}
