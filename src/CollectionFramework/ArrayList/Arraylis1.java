package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

//ArrayList is a class which implements the List interface

public class Arraylis1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        //Default size of an ArrayList will be 10
        //Once the 10 elements will be stored it will explicitly increase the size to n = n + n/2 +1

        //add() method used to add an element into the list & it will insert at the end of the list
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list);

        //Note if you remove any element from middle of the array then all the element next to that array will be shifted left
        //And also if you add an element to the middle of the array, it will shift all the elements to right
    }
}
