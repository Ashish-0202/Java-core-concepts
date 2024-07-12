package WrapperClass;


//Automatic conversion of a primitive type into an object of wrapper class is know as Autoboxing

public class AutoBoxing {
    public static void main(String[] args) {

        //way-1
        Integer obj1= 10;

        //way2
        int a=20;

        //Here we have assigned a primitive type int to a wrapper class object
        Integer obj2=a;

        System.out.println(obj2);

    }
}
