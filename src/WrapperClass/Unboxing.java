package WrapperClass;

//This is a reverse process of Autoboxing
//Automatic process of converting a wrapper class object into its specific primitive data type

public class Unboxing {
    public static void main(String[] args) {

        Integer obj1=new Integer(20);

        //Here we assigned a wrapper class object into a primitive type
        int a = obj1;

        System.out.println(a);

    }
}
