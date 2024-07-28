package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class TreeSetDemoEx {
    public static void main(String[] args) {
        Set<Student> set=new HashSet<Student>();

        set.add(new Student("Ashish",1));
        set.add(new Student("Ashwini",2));
        set.add(new Student("Holla",3));
        set.add(new Student("VV9",1));

        System.out.println(set);
    }
}
