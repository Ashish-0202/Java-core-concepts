package Multithreading;

class Counter{
    int counter;

    public synchronized void increment(){
        counter++;
    }
}

public class ConcurrencyProblem2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Runnable t1= () -> {
            for (int i=0;i<1000;i++){
                counter.increment();
            }
        };

        Runnable t2= () -> {
          for (int i=0;i<1000;i++){
              counter.increment();
          }
        };

        Thread thread=new Thread(t1);
        Thread thread1=new Thread(t2);

        thread.start();
        thread1.start();

        thread1.join();
        thread.join();

        System.out.println(counter.counter);
    }
}
