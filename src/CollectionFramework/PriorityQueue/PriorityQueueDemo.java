package CollectionFramework.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
//PriorityQueue is a Java class implementing queue interface
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();

        //As we are implementing queue interface we can use same methods to insert element into PriorityQueue
        priorityQueue.offer(51);
        priorityQueue.offer(23);
        priorityQueue.offer(43);
        priorityQueue.offer(4);
        priorityQueue.offer(53);
        priorityQueue.offer(63);
        priorityQueue.offer(72);

        //Inside Priority queue it will implement Min_heap behind the scene the replaced the lowest element of the queue into first position
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);

        //If we want to explicitly change the min_heap order we need to define it while declaration using comparator
        //This will reverse the order of min heap, and it will replace the highest value at the beginning
        PriorityQueue<Integer> pq1= new PriorityQueue<>(Comparator.reverseOrder());
    }
}
