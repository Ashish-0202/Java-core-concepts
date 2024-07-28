package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

//HashSet is a class which implements the Set Interface
//In Set duplicate elements are not allowed
//There is no any order of elements in set

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();

        set.add(24);
        set.add(3);
        set.add(43);
        set.add(15);
        set.add(6);

        //Even though if we try to add duplicate element into the set it will store only one
        set.add(6);

        //In hashSet the hash value of each element will be unique
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
