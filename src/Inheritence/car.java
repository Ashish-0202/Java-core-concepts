package Inheritence;

public class car extends Inheritence{
    public String model(){
        return "BMW x1";
    }

    public static void main(String[] args) {
        car myCar=new car();
        myCar.transportmode();
        System.out.println(myCar.model());
    }
}
