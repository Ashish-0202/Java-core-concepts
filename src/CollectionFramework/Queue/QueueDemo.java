package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;
//Queue is an interface which implements collection framework
//Queue follows FIFO(First IN First Out) method for inserting and deleting
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        //offer() method is used to insert an element at the rear end of the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        System.out.println(queue);

        //poll() method will remove an element from the front end of the queue
        System.out.println(queue.poll());

        System.out.println(queue);

        //peek() method will display the next element in the front end of the queue
        System.out.println(queue.peek());

    }
}
