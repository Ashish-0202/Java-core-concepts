package CollectionFramework.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        Employee e1=new Employee(2,"Ashish");
        Employee e2=new Employee(1,"Ashwini");

        //As we implemented the compareTo method and we have specified to compare the empid
        System.out.println(e1.compareTo(e2));

        //Collections.sort();

        List<Employee> list=new ArrayList<Employee>();

        list.add(new Employee(2,"Ashish"));
        list.add(new Employee(1,"Ashwini"));
        list.add(new Employee(5,"Holla"));
        list.add(new Employee(3,"VV9"));
        list.add(new Employee(6,"Ramana"));

        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.empname.compareTo(o2.empname);
            }
        });

        System.out.println(list);


    }
}
