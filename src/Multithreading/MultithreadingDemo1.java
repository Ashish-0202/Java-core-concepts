package Multithreading;

class one extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Class one");
        }
    }
}

class two extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("Class two");
        }
    }
}

public class MultithreadingDemo1 {
    public static void main(String[] args) {
        one objone=new one();
        two objtwo=new two();

        objone.setPriority(Thread.MAX_PRIORITY);

        objone.start();
        objtwo.start();

    }
}
