package Constructor;

//Constructor are used to initialize the objects.
//Constructor is called when an object of the class is created
//It can be used to set the initial values to the object attributes

public class Demo1 {

    int x;

    public Demo1(){
        this.x = 10;
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();

        System.out.println(demo1.x);
    }
}
