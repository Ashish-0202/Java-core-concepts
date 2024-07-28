package CollectionFramework.ArrayDeque;

import java.util.ArrayDeque;

//ArrayDeque is a class implementing queue interface
//In ArrayDeque we can insert elements from both the ends
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();

        //As we are implementing queue interface we can use same methods to perform operations
        arrayDeque.offer(10);
        arrayDeque.offer(13);
        arrayDeque.offer(14);

        System.out.println(arrayDeque);

        //We can also insert, remove and peek elements from first as well as last
        //We are user offerFirst & offerLast method to insert at front and rear end
        arrayDeque.offerFirst(2);
        arrayDeque.offerLast(20);

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        arrayDeque.poll();
        System.out.println("After using poll:"+arrayDeque);
        arrayDeque.pollFirst();
        System.out.println("After using pollFirst:"+arrayDeque);
        arrayDeque.pollLast();
        System.out.println("After using pollLast:"+arrayDeque);

        System.out.println(arrayDeque.peekFirst());

        System.out.println(arrayDeque.peekLast());


    }
}
