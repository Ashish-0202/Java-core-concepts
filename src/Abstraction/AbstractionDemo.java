package Abstraction;

abstract class BWM{
    abstract void wheels();

    public void transporttype(){
        System.out.println("BMW is a road transport type vehicle company");
    }
}

public class AbstractionDemo extends BWM{
    @Override
    void wheels() {
        System.out.println("BMW cars are of four wheels.!");
    }

    public static void main(String[] args) {
        AbstractionDemo abstractionDemo=new AbstractionDemo();

        abstractionDemo.wheels();
        abstractionDemo.transporttype();
    }
}
