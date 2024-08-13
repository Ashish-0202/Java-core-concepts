package Multithreading;

class A{
    public void show(){
        for(int i=1;i<=10;i++){
            System.out.println("Class A");
        }
    }
}

class B{
    public void show(){
        for (int i=1;i<=10;i++){
            System.out.println("Class B");
        }
    }
}

public class WithOutThreadDemo {
    public static void main(String[] args) {
        A objA=new A();
        B objB=new B();

        objA.show();
        objB.show();

        //Here the method of class A is executing first and once it's completely done it will move for next object method.
        //To overcome this we are using multithreading
    }
}
