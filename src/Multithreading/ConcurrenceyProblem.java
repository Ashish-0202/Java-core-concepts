package Multithreading;

public class ConcurrenceyProblem extends Thread {
    public static int amount=0;

    public static void main(String[] args) {
        ConcurrenceyProblem problem=new ConcurrenceyProblem();
        problem.start();
        //By using isAlive() method we can avoid concurrency problem
        //So here using while loop and isAlive method will wait until that thread is completed
        while (problem.isAlive()){
            System.out.println("waiting...");
        }
        System.out.println("Amount:"+amount);
        amount++;
        System.out.println("Amount:"+amount);
    }

    public void run(){
        amount++;
    }
}
