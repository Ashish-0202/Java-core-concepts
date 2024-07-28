package CollectionFramework.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();

        long starttime=System.nanoTime();

        for(int i=0;i<=5000;i++){
            a1.add(i);
        }

        long endtime=System.nanoTime();

        long timetaken= (endtime - starttime);


        System.out.println("Time Taken by array list to add 5000 elements is: "+timetaken+" ns");

        System.out.println("===============================");
        LinkedList<Integer> l1=new LinkedList<>();

        long ctime=System.nanoTime();

        for(int j=0;j<=5000;j++){
            l1.add(j);
        }

        long etime=System.nanoTime();

        long timet=etime-ctime;

        System.out.println("Time Taken by Linked list to add 5000 elements is: "+timet+" ns");

        System.out.println("==================================");

        long ctimee=System.nanoTime();

        System.out.println("3999th element in array list: "+a1.get(3999));

        long etimee=System.nanoTime();

        long tt=etimee-ctimee;

        System.out.println("Time Taken by Array list to fetch 3999th element is: "+tt+" ns");

        System.out.println("==================================");

        long ctimeee=System.nanoTime();

        System.out.println("3999th element in linked list: "+a1.get(3999));

        long etimeee=System.nanoTime();

        long tte=etimeee-ctimeee;

        System.out.println("Time Taken by Linked list to fetch 3999th element is: "+tte+" ns");
    }
}
