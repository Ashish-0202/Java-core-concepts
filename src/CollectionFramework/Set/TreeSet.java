package CollectionFramework.Set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set= new java.util.TreeSet<>();

        set.add(13);
        set.add(1);
        set.add(14);
        set.add(51);
        set.add(11);

        //TreeSet class is also implementing the properties of Set and behind the scene it is implementing Binary Search algorithm.
        //TreeSet will sort the element inside the set as BTS is it using binary search algorithm
        System.out.println(set);

        //In TreeSet the hash value of each element will be unique
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
