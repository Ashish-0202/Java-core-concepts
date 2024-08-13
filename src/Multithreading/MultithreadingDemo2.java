package Multithreading;

public class MultithreadingDemo2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println("Hello from thread..!");
        }
    }

    public static void main(String[] args) {
        MultithreadingDemo2 demo2=new MultithreadingDemo2();

        Thread t1=new Thread(demo2);
        t1.start();
    }
}
